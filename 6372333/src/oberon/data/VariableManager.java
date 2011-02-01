package oberon.data;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import oberon.Declaration;
import oberon.ProcedureHeading;

public class VariableManager {
	private static VariableManager _instance;
	private Stack<Scope> _scopes;
	private Scope _currentScope;
	
	private VariableManager(){
		_scopes = new Stack<Scope>();
		_currentScope = new Scope();
	}

	public static VariableManager getInstance(){
		if (_instance == null){
			_instance = new VariableManager();
		}
		return _instance;
	}
	
	public void AddNewDeclaration(Declaration declaration){
		_currentScope.AddNewDeclaration(declaration);
	}
	
	public void EnterNewScope(List<DataType> actualProcedureParameters){
		//preserve the old scope, put it on the stack
		_scopes.add(_currentScope);
		
		//create a new scope and store it in _currentscope
		Scope newScope = _currentScope.createNewScope(actualProcedureParameters);
		_currentScope = newScope;
	}
	
	public void LeaveScope(){
		if (!_scopes.empty()){
			_currentScope = _scopes.pop();
		}
	}

	public DataType getVariable(String name) {
		return _currentScope.getVariable(name);
	}
	
	public void AddProcedure(ProcedureHeading procedure) {
		_currentScope.AddProcedure(procedure);
	}
	
	public void AddSystemProcedure(ProcedureHeading procedure) {
		_currentScope.AddSystemProcedure(procedure);
	}

	public ProcedureHeading getProcedure(String name) {
		return _currentScope.getProcedure(name);
	}
	
	class Scope {		
		private HashMap<String, DataType> _variables;
		private HashMap<String, ProcedureHeading> _procedures;
		private HashMap<String, ProcedureHeading> _systemProcedures;
		
		Scope(){
			_variables = new HashMap<String, DataType>();
			_procedures = new HashMap<String, ProcedureHeading>();
			_systemProcedures = new HashMap<String, ProcedureHeading>();
		}
		
		public void AddSystemProcedure(ProcedureHeading procedure) {
			_systemProcedures.put(procedure.getName(), procedure);
		}

		Scope(HashMap<String, DataType> variables, HashMap<String, ProcedureHeading> systemProcedures){
			_variables = variables;
			_systemProcedures = systemProcedures;
		}

		private Scope createNewScope(
				List<DataType> actualProcedureParameters) {
			HashMap<String, DataType> variables = new HashMap<String, DataType>();
			
			addVariablesToCollection(actualProcedureParameters, variables);
			
			return new Scope(variables, _systemProcedures);
		}

		private void addVariablesToCollection(
				List<DataType> variablesToAdd,
				HashMap<String, DataType> collectionToAddVariablesTo) {
			for (DataType actualParam : variablesToAdd){
				collectionToAddVariablesTo.put(actualParam.getName(), actualParam);	
			}
		}
		
		public void AddNewDeclaration(Declaration declaration)
		{
			_variables = new HashMap<String, DataType>();
			addVariablesToCollection(declaration.getVariables(), _variables);
			
			_procedures = new HashMap<String, ProcedureHeading>();
			for (ProcedureHeading heading : declaration.getProcedures()){
				AddProcedure(heading);
			}
		}
		
		void AddProcedure(ProcedureHeading procedure) {
			_procedures.put(procedure.getName(), procedure);
		}

		public ProcedureHeading getProcedure(String name) {
			if (_procedures.containsKey(name)){
				return _procedures.get(name);
			}
			if (_systemProcedures.containsKey(name)){
				return _systemProcedures.get(name);
			}
			
			System.out.println("Procedure not found in scope: "+ name);
			return null;
		}

		public DataType getVariable(String variableName) {
			if (_variables.containsKey(variableName)){
					return _variables.get(variableName);
			}
			
			System.out.println("Variable not found in scope: "+ variableName);
			return null;
		}
	}
}
