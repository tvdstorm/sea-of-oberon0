package oberon.data;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import oberon.Declaration;
import oberon.AbstractProcedure;
import oberon.ProcedureHeading;

public class VariableManager {
	private static VariableManager instance;
	private final Stack<Scope> scopes;
	private Scope currentScope;
	
	private VariableManager(){
		scopes = new Stack<Scope>();
		currentScope = new Scope();
	}

	public static VariableManager getInstance(){
		if (instance == null){
			instance = new VariableManager();
		}
		return instance;
	}
	
	public void addNewDeclaration(final Declaration declaration){
		currentScope.addNewDeclaration(declaration);
	}
	
	public void enterNewScope(final List<AbstractDataType> actualProcedureParameters, 
			final ProcedureHeading currentProcedure){
		//preserve the old scope, put it on the stack
		scopes.add(currentScope);
		
		//create a new scope and store it in _currentscope
		final Scope newScope = currentScope.createNewScope(actualProcedureParameters, currentProcedure);
		currentScope = newScope;
	}
	
	public void leaveScope(){
		if (!scopes.empty()){
			currentScope = scopes.pop();
		}
	}

	public AbstractDataType getVariable(final String name) {
		return currentScope.getVariable(name);
	}
	
	public void addProcedure(final ProcedureHeading procedure) {
		currentScope.addProcedure(procedure);
	}
	
	public void addSystemProcedure(final AbstractProcedure procedure) {
		currentScope.addSystemProcedure(procedure);
	}

	public AbstractProcedure getProcedure(final String name) {
		return currentScope.getProcedure(name);
	}
	
	class Scope {		
		private final AbstractMap<String, AbstractDataType> variables;
		private final AbstractMap<String, ProcedureHeading> procedures;
		private final AbstractMap<String, AbstractProcedure> systemProcedures;
		
		Scope(){
			variables = new HashMap<String, AbstractDataType>();
			procedures = new HashMap<String, ProcedureHeading>();
			systemProcedures = new HashMap<String, AbstractProcedure>();
		}
		
		public void addSystemProcedure(final AbstractProcedure procedure) {
			systemProcedures.put(procedure.getName(), procedure);
		}

		Scope(final AbstractMap<String, AbstractDataType> inputVariables, 
				final AbstractMap<String,ProcedureHeading> inputPprocedures, 
				final AbstractMap<String, AbstractProcedure> inputSysProcedures){
			variables = inputVariables;
			systemProcedures = inputSysProcedures;
			procedures = inputPprocedures;
		}

		private Scope createNewScope(final List<AbstractDataType> actualProcedureParameters, 
				final ProcedureHeading currentProcedure) {
			final HashMap<String, AbstractDataType> variables = new HashMap<String, AbstractDataType>();
			
			for (AbstractDataType actualParam : actualProcedureParameters){
				variables.put(actualParam.getName(), actualParam);
			}
			
			final HashMap<String, ProcedureHeading> procedures = new HashMap<String, ProcedureHeading>();
			procedures.put(currentProcedure.getName(), currentProcedure);
			
			return new Scope(variables, procedures, systemProcedures);
		}
		
		public void addNewDeclaration(final Declaration declaration)
		{
			for (AbstractDataType actualParam : declaration.getVariables()){
				variables.put(actualParam.getName(), actualParam);	
				
				if (actualParam instanceof IntegerArrayType){
					((IntegerArrayType)actualParam).initializeArray();
				}
			}
			
			for (ProcedureHeading heading : declaration.getProcedures()){
				addProcedure(heading);
			}
		}
		
		protected void addProcedure(final ProcedureHeading procedure) {
			procedures.put(procedure.getName(), procedure);
		}

		public AbstractProcedure getProcedure(final String name) {
			AbstractProcedure procedure = null;
			if (procedures.containsKey(name)){
				procedure = procedures.get(name);
			}
			if (systemProcedures.containsKey(name)){
				procedure = systemProcedures.get(name);
			}
			
			if (procedure == null) {
				System.out.println("Procedure not found in scope: "+ name);
			}
			return procedure;
		}

		public AbstractDataType getVariable(final String variableName) {
			if (variables.containsKey(variableName)){
					return variables.get(variableName);
			}
			
			System.out.println("Variable not found in scope: "+ variableName);
			return null;
		}
	}
}
