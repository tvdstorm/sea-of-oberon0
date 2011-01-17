package ar.oberon0.interpreter;

import java.util.ArrayList;
import java.util.List;


public final class Context {
	/*
	 * This list contains the context data. The variables of the executing program, function etc.
	 */
	private List<Variable> _dataList;

	public Context()
	{
		_dataList = new ArrayList<Variable>();
	}
	
	/*
	 * This function combines the current context and the context from the parameter into a new context object.	 * 
	 */
	public Context Combine(Context contextToAdd)
	{
		Context newContext = new Context();
		newContext.AddDataList(this.getDataList());
		newContext.AddDataList(contextToAdd.getDataList());
		return newContext;
	}
	
	/*
	 * Returns the value of the variable.
	 */
	public Object getValue(String name)
	{		
		for (Variable variable : _dataList) {
			if(variable.getName() == name.trim())
				return variable.getValue();
		}
		return null;
	}
	
	/*
	 * Create a variable. There can be only one variable for a name.
	 * Trying to insert a variable with a name that already exist will result in an exception
	 */
	public void CreateVariable(String name) throws Exception
	{
		Variable variable = new Variable(name);
		if(VariableExist(name))
			throw new Exception("Variable " + name + " already exist.");
		_dataList.add(variable);
	}
	
	/*
	 * Set the value of a variable that is in the context.
	 * If there is no variable with the specified name an exception will be thrown.
	 */
	public void SetVariable(String name, Object value) throws Exception
	{	
		if(!VariableExist(name))
			throw new Exception("Variable " + name + " doesn't exist.");
		Variable variableToSet = getVariable(name);
		variableToSet.setValue(value);
	}
	
	/*
	 * Get the variable object for the specified name.
	 * If the there is no variable with the specified name null will be returned.
	 */
	private Variable getVariable(String name)
	{
		for (Variable variable : _dataList) 
		{
			if(variable.getName() == name)
				return variable;
		}
		return null;
	}
	
	/*
	 * Check if there is a variable with the specified name in the data collection.
	 */
	private boolean VariableExist(String name)
	{
		return getVariable(name) == null ? false : true;
	}
	
	/*
	 * This function returns the data list of this context.
	 * This function is only for internal use to combine two contexts.
	 */
	private List<Variable> getDataList() {
		return _dataList;
	}

	/*
	 * This function adds a datalist to the current context. 
	 * This function is only for internal use to combine two contexts.
	 */
	private void AddDataList(List<Variable> dataToAdd)
	{
		_dataList.addAll(dataToAdd);
	}
	
	/*
	 * This class is used to store the value of a variable.
	 * It is only supposed to be used in the Context class.
	 */
	private class Variable
	{
		private final String _name;
		private Object _value;
		
		public Variable(String name)
		{
			_name = name;
		}
		
		public void setValue(Object value) 
		{
			_value = value;				
		}

		private String getName()
		{
			return _name;
		}
		
		private Object getValue()
		{
			return _value;
		}
		
		@Override
		public int hashCode() 
		{
			return getName().hashCode();
		}
		
		@Override
		public boolean equals(Object obj)
		{
			if(obj.getClass() != Variable.class)
				throw new IllegalArgumentException("The type " + obj.getClass() + " cannot be compared with " + Variable.class + ".");
			return ((Variable)obj).getName() == this.getName();
		}
		
	}
	
}
