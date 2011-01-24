package ar.oberon0.interpreter.Memory;

import java.util.List;
import java.util.Map.Entry;

import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.DataTypes.SimpleType;
import ar.oberon0.interpreter.DataTypes.CreatableType;
import ar.oberon0.interpreter.Lists.BaseMap;
import ar.oberon0.interpreter.Lists.ConstantList;
import ar.oberon0.interpreter.Lists.ProcedureList;
import ar.oberon0.interpreter.Lists.TypeIdentifierList;
import ar.oberon0.interpreter.Lists.DataFieldList;
import ar.oberon0.interpreter.Procedure.Procedure;


public final class Context {
	
	private Context _parentContext;
	private DataFieldList _variables;
	private TypeIdentifierList _typeIdentifiers;
	private ConstantList _constants;
	private ProcedureList _procedures;
	
	/*
	 * The parent context is used to get variables of the parent construct, for example a procedure has an own context and a parent context of the parent procedure or module.
	 */
	public void setParentContext(Context context)
	{
		_parentContext = context;
	}
	
	public Context()
	{
		_parentContext = null;
		_variables = new DataFieldList();
		_typeIdentifiers = new TypeIdentifierList();
		_constants = new ConstantList();
	}
	
	public void setProcedures(ProcedureList procedures)
	{
		_procedures = procedures;
	}
	
	public Procedure getProcedure(String name) throws Exception
	{
		if(!itemExist(name,_procedures))
			throw new Exception("There was no procedure named " + name + " in the context.");
		return _procedures.getItem(name);
	}
	
	public void AddConstants(ConstantList constants)
	{
		if(constants != null)
		{
			if(_constants.getCount() <= 0)
				_constants = constants;
			else
			{
				for(Entry<String,DataField> item : constants)
				{
					_constants.AddItem(item.getKey(), item.getValue());
				}
			}
		}
	} 
	
	public void AddProcedure(String name,Procedure procedure)
	{
		_procedures.AddItem(name, procedure);
	}
	
	public void AddTypeIdentifiers(TypeIdentifierList typeIdentifiers)
	{
		if(typeIdentifiers != null)
		{
			if(_typeIdentifiers.getCount() <= 0)
				_typeIdentifiers = typeIdentifiers;
			else
			{
				for(Entry<String,CreatableType> item : typeIdentifiers)
				{
					_typeIdentifiers.AddItem(item.getKey(), item.getValue());
				}
			}
		}
	}

	public void AddVariables(DataFieldList variables)
	{
		if(variables != null)
		{
			if(_variables.getCount() <= 0)
				_variables = variables;
			else
			{
				for(Entry<String,DataField> item : variables)
				{
					_variables.AddItem(item.getKey(),item.getValue());
				}
			}
		}
	}
	
	public void CloneAndAddVariables(DataFieldList variables)
	{
		if(variables != null)
		{
			_variables.CloneAndAdd(variables);
		}
	}
	
	private CreatableType getTypeIdentifier(String name) throws Exception
	{
		if(!itemExist(name,_typeIdentifiers))
			throw new Exception("There was no type named " + name + " in the context.");
		return _typeIdentifiers.getItem(name);
	}	
	
	/*
	 * Check if there is a variable with the specified name.
	 */
	private boolean itemExist(String name, BaseMap list)
	{		
		if(list.getItem(name) == null)
			return false;
		else 
			return true;		
	}
	
	public DataType getVarOrConstantAsDataType(String name,Context context) throws Exception
	{
		return getVarOrConstantAsDataField(name).getValue(context);
	}

	public DataField getVarOrConstantAsDataField(String name) throws Exception 
	{
		if(itemExist(name,_variables))
		{
			return _variables.getItem(name);
		}
		else if(itemExist(name,_constants))
		{
			return _constants.getItem(name).Clone();
		}
		else if(_parentContext != null)		// If there is a parent construct look if it contains a variable or constant with the specified name.
		{
			return _parentContext.getVarOrConstantAsDataField(name);
		}
		else
		{
			throw new Exception("There was no variable or constant named " + name + " in the context.");
		}
	}

	public void AddVariable(String name, DataField value) 
	{
		_variables.AddItem(name, value);
	}
}
