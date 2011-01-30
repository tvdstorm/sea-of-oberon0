package oberon;

import java.util.List;
import java.util.Stack;

public class VariableManager {
	private static VariableManager _instance;
	private Stack<Scope> _scopes;
	private Scope _currentScope;
	
	private VariableManager()
	{
		_scopes = new Stack<Scope>();
		_currentScope = new Scope();
	}

	public static VariableManager getInstance()
	{
		if (_instance == null)
		{
			_instance = new VariableManager();
		}
		return _instance;
	}
	
	public void setVariableValue(String name, Expression value)
	{
		_currentScope.setVariableValue(name, value);
	}
	
	public void AddNewDeclaration(Declaration declaration)
	{
		_currentScope.AddNewDeclaration(declaration);
	}
	
	public void EnterNewScope(List<VarVariable> actualProcedureParameters, List<ArrayVariable> actualArrayList)
	{
		//preserve the old scope, put it on the stack
		_scopes.add(_currentScope);
		
		//create a new scope and store it in _currentscope
		Scope newScope = _currentScope.createNewScope(actualProcedureParameters, actualArrayList);
		_currentScope = newScope;
	}
	
	public void LeaveScope()
	{
		if (!_scopes.empty())
		{
			_currentScope = _scopes.pop();
		}
	}

	public int getVariableValue(String name) {
		return _currentScope.getVariableValue(name);
	}

	public int getArrayValue(String name, int index) {
		return _currentScope.getArrayValue(name, index);
	}

	public void setArrayValue(String name, int index, int value) {
		_currentScope.setArrayValue(name, index, value);
	}

	void AddProcedure(String string, ProcedureHeading procedure) {
		_currentScope.AddProcedure(string, procedure);
	}

	public ProcedureHeading getProcedure(String name) {
		return _currentScope.getProcedure(name);
	}

	public ArrayVariable getArray(String name) {
		return _currentScope.getArray(name);
	}
	
	public VarVariable getVariable(String varNameToCopy) {
		return _currentScope.getVariable(varNameToCopy);
	}
	
	class Scope {		
		private Stack<ConstVariable> _constVariables;
		private Stack<VarVariable> _varVariables;
		private Stack<ArrayVariable> _arrayVariables;
		private Stack<ProcedureHeading> _procedures;
		
		Scope()
		{
			_constVariables = new Stack<ConstVariable>();
			_varVariables = new Stack<VarVariable>();
			_arrayVariables = new Stack<ArrayVariable>();
			_procedures = new Stack<ProcedureHeading>();
		}
		
		Scope(Stack<ConstVariable> constVariables, Stack<VarVariable> varVariables, Stack<ArrayVariable> arrayVariables,
				Stack<ProcedureHeading> procedures)
		{
			_constVariables = constVariables;
			_varVariables = varVariables;
			_arrayVariables = arrayVariables;
			_procedures = procedures;
		}

		private Scope createNewScope(
				List<VarVariable> actualProcedureParameters,
				List<ArrayVariable> actualArrayList) {
			Stack<ConstVariable> newConstStack = deepCopyStack(_constVariables);
			Stack<VarVariable> newVarStack = deepCopyStack(_varVariables);
			Stack<ArrayVariable> newArrStack = deepCopyStack(_arrayVariables);
			Stack<ProcedureHeading> newProcStack = deepCopyStack(_procedures);
			
			AddCollectionToStack(newVarStack, actualProcedureParameters);
			AddCollectionToStack(newArrStack, actualArrayList);
			
			return new Scope(newConstStack, newVarStack, newArrStack, newProcStack);
		}

		private <T extends IDeepCopyable<T>> Stack<T> deepCopyStack(Stack<T> stackToCopy) {
			Stack<T> newStack = new Stack<T>();
			for (T variable : stackToCopy)
			{
				newStack.add(variable);
			}
			return newStack;
		}
		
		public void setVariableValue(String name, Expression value)
		{
			for (VarVariable variable : _varVariables)
			{
				if (variable.getName().equals(name))
				{
//					if (value instanceof MathematicalExpression)
//					{
//						variable.setValue(new IntegerExpression(value.EvalAsInt()));
//					}
//					else
//					{
						variable.setValue(value);
//					}
					return;
				}
			}
			
			//TODO exception thrown
			System.out.println("Variabele niet gevonden: "+ name);
		}
		
		public void AddNewDeclaration(Declaration declaration)
		{
			AddCollectionToStack(_constVariables, declaration.getConstVariables());
			AddCollectionToStack(_varVariables, declaration.getVarVariables());
			AddCollectionToStack(_arrayVariables, declaration.getArrayVariables());
			AddCollectionToStack(_procedures, declaration.getProcedures());
		}
		
		public <T extends INamedClass> void AddCollectionToStack(Stack<T> currentStack, List<T> listToAdd)
		{
			for (T itemToAdd : listToAdd)
			{
				Boolean itemProcessed = false;
				for (T itemInCurrentStack : currentStack)
				{
					if (itemInCurrentStack.getName().equals(itemToAdd.getName()))
					{
						itemInCurrentStack = itemToAdd;
						itemProcessed = true;
					}
				}
				
				if (!itemProcessed)
				{
					currentStack.add(itemToAdd);
				}
			}
		}

		public int getVariableValue(String name) {
			for (VarVariable variable : _varVariables)
			{
				if (variable.getName().equals(name))
				{
					return variable.getValue();
				}
			}
			
			for (ConstVariable variable : _constVariables)
			{
				if (variable.getName().equals(name))
				{
					return variable.getValue();
				}
			}
			
			//TODO exception throwen
			System.out.println("Variabele niet gevonden: "+ name);
			return 0;
		}

		public int getArrayValue(String name, int index) {
			for (ArrayVariable array : _arrayVariables)
			{
				if (array.getName().equals(name))
				{
					return array.getValue(index);
				}
			}
			
			//TODO exception throwen
			System.out.println("Array niet gevonden: "+ name);
			return 0;
		}

		public void setArrayValue(String name, int index, int value) {
			for (ArrayVariable variable : _arrayVariables)
			{
				if (variable.getName().equals(name))
				{
					variable.setValue(index, value);
					return;
				}
			}
			
			//TODO exception thrown
			System.out.println("Array: "+ name +" waarde niet gezet, index: "+ index);
		}

		void AddProcedure(String string, ProcedureHeading procedure) {
			_procedures.add(procedure);
		}

		public ProcedureHeading getProcedure(String name) {
			for (ProcedureHeading procedure : _procedures)
			{
				if (procedure.getName().equals(name))
				{
					return procedure;
				}
			}
			
			System.out.println("Procedure not found in scope: "+ name);
			return null;
		}

		public ArrayVariable getArray(String name) {
			for (ArrayVariable array : _arrayVariables)
			{
				if (array.getName().equals(name))
				{
					return array;
				}
			}
			//TODO exception throwen
			System.out.println("Array niet gevonden: "+ name);
			return null;
		}

		public VarVariable getVariable(String varNameToCopy) {
			for (VarVariable variable : _varVariables)
			{
				if (variable.getName().equals(varNameToCopy))
				{
					return variable;
				}
			}
			return null;
		}
	}
}
