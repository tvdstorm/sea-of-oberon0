package ar.oberon0.interpreter.Memory;

import java.util.Map.Entry;

import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.DataTypes.Type;
import ar.oberon0.interpreter.Lists.BaseList;
import ar.oberon0.interpreter.Lists.ConstantList;
import ar.oberon0.interpreter.Lists.TypeIdentifierList;
import ar.oberon0.interpreter.Lists.VarList;


public final class Context {
	
	private VarList _variables;
	private TypeIdentifierList _typeIdentifiers;
	private ConstantList _constants;
	
	public Context()
	{
		_variables = new VarList();
		_typeIdentifiers = new TypeIdentifierList();
		_constants = new ConstantList();
	}
	
	public void AddConstants(ConstantList constants)
	{
		if(constants != null)
		{
			if(_constants.getCount() <= 0)
				_constants = constants;
			else
			{
				for(Entry<String,DataType> item : constants)
				{
					_constants.AddItem(item.getKey(), item.getValue());
				}
			}
		}
	} 
	
	public void AddTypeIdentifiers(TypeIdentifierList typeIdentifiers)
	{
		if(typeIdentifiers != null)
		{
			if(_typeIdentifiers.getCount() <= 0)
				_typeIdentifiers = typeIdentifiers;
			else
			{
				for(Entry<String,Type> item : typeIdentifiers)
				{
					_typeIdentifiers.AddItem(item.getKey(), item.getValue());
				}
			}
		}
	}

	public void AddVariables(VarList variables)
	{
		if(variables != null)
		{
			if(_variables.getCount() <= 0)
				_variables = variables;
			else
			{
				for(Entry<String,Var> item : variables)
				{
					_variables.AddItem(item.getKey(),item.getValue());
				}
			}
		}
	}
	
	public DataType getConstant(String name) throws Exception
	{
		if(!itemExist(name,_constants))
			throw new Exception("There was no constant named " + name + " in the context.");
		return _constants.getItem(name);
	}
	
	public Type getTypeIdentifier(String name) throws Exception
	{
		if(!itemExist(name,_variables))
			throw new Exception("There was no type named " + name + " in the context.");
		return _typeIdentifiers.getItem(name);
	}
	
	/*
	 * Returns the the variable with the specified name if it exists.
	 */
	public Var getVariable(String name) throws Exception
	{		
		if(!itemExist(name,_variables))
			throw new Exception("There was no variable named " + name + " in the context.");
		return _variables.getItem(name);
	}
	
	/*
	 * Check if there is a variable with the specified name.
	 */
	private boolean itemExist(String name, BaseList list)
	{		
		if(list.getItem(name) == null)
			return false;
		else 
			return true;		
	}

	public Var getValueOf(String name) throws Exception 
	{
		if(itemExist(name,_variables))
			return _variables.getItem(name);
		else if(itemExist(name,_constants))
			return new Var(null,_constants.getItem(name));
		else
			throw new Exception("There was no variable or constant named " + name + " in the context.");
	}	
}
