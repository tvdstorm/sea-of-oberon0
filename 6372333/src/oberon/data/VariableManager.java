package oberon.data;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import oberon.Declaration;
import oberon.Procedure;
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
	
	public void EnterNewScope(List<DataType> actualProcedureParameters, ProcedureHeading currentProcedure){
		//preserve the old scope, put it on the stack
		_scopes.add(_currentScope);
		
		//create a new scope and store it in _currentscope
		Scope newScope = _currentScope.createNewScope(actualProcedureParameters, currentProcedure);
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
	
	public void AddSystemProcedure(Procedure procedure) {
		_currentScope.AddSystemProcedure(procedure);
	}

	public Procedure getProcedure(String name) {
		return _currentScope.getProcedure(name);
	}
	
	class Scope {		
		private HashMap<String, DataType> _variables;
		private HashMap<String, ProcedureHeading> _procedures;
		private HashMap<String, Procedure> _systemProcedures;
		
		Scope(){
			_variables = new HashMap<String, DataType>();
			_procedures = new HashMap<String, ProcedureHeading>();
			_systemProcedures = new HashMap<String, Procedure>();
		}
		
		public void AddSystemProcedure(Procedure procedure) {
			_systemProcedures.put(procedure.getName(), procedure);
		}

		Scope(HashMap<String, DataType> variables, HashMap<String,ProcedureHeading> procedures, HashMap<String, Procedure> systemProcedures){
			_variables = variables;
			_systemProcedures = systemProcedures;
			_procedures = procedures;
		}

		private Scope createNewScope(
				List<DataType> actualProcedureParameters, ProcedureHeading currentProcedure) {
			HashMap<String, DataType> variables = new HashMap<String, DataType>();
			
			for (DataType actualParam : actualProcedureParameters){
				variables.put(actualParam.getName(), actualParam);
				
//				if (actualParam instanceof IntegerArrayIndexerType)
//				{
//					IntegerArrayIndexerType integerArrayIndexer = ((IntegerArrayIndexerType)actualParam);
//					_variables.put(integerArrayIndexer.getName(), integerArrayIndexer.getArray());
//				}
			}
			
			HashMap<String, ProcedureHeading> procedures = new HashMap<String, ProcedureHeading>();
			procedures.put(currentProcedure.getName(), currentProcedure);
			
			return new Scope(variables, procedures, _systemProcedures);
		}
		
		public void AddNewDeclaration(Declaration declaration)
		{
			for (DataType actualParam : declaration.getVariables()){
				_variables.put(actualParam.getName(), actualParam);	
				
				if (actualParam instanceof IntegerArrayType)
				{
					((IntegerArrayType)actualParam).initializeArray();
				}
			}
			
			for (ProcedureHeading heading : declaration.getProcedures()){
				AddProcedure(heading);
			}
		}
		
		void AddProcedure(ProcedureHeading procedure) {
			_procedures.put(procedure.getName(), procedure);
		}

		public Procedure getProcedure(String name) {
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
