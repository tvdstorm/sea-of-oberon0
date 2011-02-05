package oberon;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import oberon.data.IntegerArrayType;
import oberon.procedures.AbstractProcedure;
import oberon.procedures.Declaration;
import oberon.procedures.ProcedureHeading;

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
	
	public void enterNewScope(final List<IDataType> actualProcedureParameters, 
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

	public IDataType getVariable(final String name) {
		return currentScope.getVariable(name);
	}
	
	public void addProcedure(final ProcedureHeading procedure) {
		currentScope.addProcedure(procedure);
	}
	
	public void addSystemProcedure(final AbstractProcedure procedure) {
		currentScope.addSystemProcedure(procedure);
	}

	public IProcedure getProcedure(final String name) {
		return currentScope.getProcedure(name);
	}
	
	class Scope {		
		private final AbstractMap<String, IDataType> variables;
		private final AbstractMap<String, IProcedure> procedures;
		private final AbstractMap<String, IProcedure> systemProcedures;
		
		Scope(){
			variables = new HashMap<String, IDataType>();
			procedures = new HashMap<String, IProcedure>();
			systemProcedures = new HashMap<String, IProcedure>();
		}

		Scope(final AbstractMap<String, IDataType> inputVariables, 
				final AbstractMap<String,IProcedure> inputPprocedures, 
				final AbstractMap<String, IProcedure> inputSysProcedures){
			variables = inputVariables;
			systemProcedures = inputSysProcedures;
			procedures = inputPprocedures;
		}
		
		public void addSystemProcedure(final AbstractProcedure procedure) {
			systemProcedures.put(procedure.getName(), procedure);
		}

		private Scope createNewScope(final List<IDataType> actualProcedureParameters, 
				final IProcedure currentProcedure) {
			final HashMap<String, IDataType> variables = new HashMap<String, IDataType>();
			
			for (IDataType actualParam : actualProcedureParameters){
				variables.put(actualParam.getName(), actualParam);
			}
			
			final HashMap<String, IProcedure> procedures = new HashMap<String, IProcedure>();
			procedures.put(currentProcedure.getName(), currentProcedure);
			
			return new Scope(variables, procedures, systemProcedures);
		}
		
		public void addNewDeclaration(final Declaration declaration)
		{
			for (IDataType actualParam : declaration.getVariables()){
				variables.put(actualParam.getName(), actualParam);	
				
				if (actualParam instanceof IntegerArrayType){
					((IntegerArrayType)actualParam).initializeArray();
				}
			}
			
			for (IProcedure heading : declaration.getProcedures()){
				addProcedure(heading);
			}
		}
		
		protected void addProcedure(final IProcedure procedure) {
			procedures.put(procedure.getName(), procedure);
		}

		public IProcedure getProcedure(final String name) {
			IProcedure procedure = null;
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

		public IDataType getVariable(final String variableName) {
			if (variables.containsKey(variableName)){
					return variables.get(variableName);
			}
			
			System.out.println("Variable not found in scope: "+ variableName);
			return null;
		}
	}
}
