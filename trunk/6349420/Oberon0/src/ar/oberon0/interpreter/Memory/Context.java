package ar.oberon0.interpreter.Memory;

import java.util.Map.Entry;

import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.DataTypes.CreatableType;
import ar.oberon0.interpreter.Lists.BaseMap;
import ar.oberon0.interpreter.Lists.ConstantList;
import ar.oberon0.interpreter.Lists.DataFieldList;
import ar.oberon0.interpreter.Lists.ProcedureList;
import ar.oberon0.interpreter.Lists.TypeIdentifierList;
import ar.oberon0.interpreter.Procedure.ProcedureDeclaration;

/*
 * The context class is used to store runtime data. 
 * It stores the procedures that can be called form within a node,
 * the variables that can be read and set, constants, etc.
 */
public final class Context
{
	/*
	 * The parent context can be used to lookup data from the calling procedure
	 * or module.
	 */
	private Context _parentContext;
	/*
	 * The variables that of the scope the node is interpreted in. Procedure
	 * parameters are also stored in the variables list.
	 */
	private DataFieldList _variables;
	/*
	 * The type identifiers that are defined in the scope the node is
	 * interpreted in.
	 */
	private TypeIdentifierList _typeIdentifiers;
	private ConstantList _constants;
	private ProcedureList _procedures;

	/*
	 * The parent context is used to get variables of the parent construct, for
	 * example a procedure has an own context and a parent context of the parent
	 * procedure or module.
	 */
	public void setParentContext(Context context)
	{
		_parentContext = context;
	}

	/*
	 * Create a new context.
	 */
	public Context()
	{
		_parentContext = null;
		_variables = new DataFieldList();
		_typeIdentifiers = new TypeIdentifierList();
		_constants = new ConstantList();
	}

	/*
	 * Set the procedure's list.
	 */
	public void setProcedures(ProcedureList procedures)
	{
		_procedures = procedures;
	}

	/*
	 * Get the procedure with the specified name.
	 */
	public ProcedureDeclaration getProcedure(String name) throws TechnicalException
	{
		if (!itemExist(name, _procedures))
		{
			throw new TechnicalException("There was no procedure named " + name + " in the context.");
		}
		return _procedures.getItem(name);
	}

	/*
	 * Add a new constant to the list of constants.
	 */
	public void AddConstants(ConstantList constants)
	{
		if (constants != null)
		{
			if (_constants.getCount() <= 0)
				_constants = constants;
			else
			{
				for (Entry<String, DataField> item : constants)
				{
					_constants.AddItem(item.getKey(), item.getValue());
				}
			}
		}
	}

	/*
	 * Add a new procedure to the list of procedures.
	 */
	public void AddProcedure(String name, ProcedureDeclaration procedure)
	{
		_procedures.AddItem(name, procedure);
	}

	/*
	 * Add the type identifiers.
	 */
	public void AddTypeIdentifiers(TypeIdentifierList typeIdentifiers)
	{
		if (typeIdentifiers != null)
		{
			if (_typeIdentifiers.getCount() <= 0)
				_typeIdentifiers = typeIdentifiers;
			else
			{
				for (Entry<String, CreatableType> item : typeIdentifiers)
				{
					_typeIdentifiers.AddItem(item.getKey(), item.getValue());
				}
			}
		}
	}

	/*
	 * Add the variables.
	 */
	public void AddVariables(DataFieldList variables)
	{
		if (variables != null)
		{
			if (_variables.getCount() <= 0)
				_variables = variables;
			else
			{
				for (Entry<String, DataField> item : variables)
				{
					_variables.AddItem(item.getKey(), item.getValue());
				}
			}
		}
	}

	/*
	 * Clone the context. Creates a new context and copies all the lists except
	 * the variables. The variable list is also cloned. This is needed for
	 * example by the creation of a new procedure. A procedure can be invoked
	 * multiple times and if the variables where not cloned all the procedure
	 * instances would share the same variable.
	 */
	public Context Clone()
	{
		Context clone = new Context();
		clone._constants = _constants;
		clone._parentContext = _parentContext;
		clone._procedures = _procedures;
		clone._typeIdentifiers = _typeIdentifiers;
		clone._variables = _variables.Clone();
		return clone;
	}

	/*
	 * Get the type identifier for the specified name.
	 */
	private CreatableType getTypeIdentifier(String name) throws TechnicalException
	{
		if (!itemExist(name, _typeIdentifiers))
		{
			throw new TechnicalException("There was no type named " + name + " in the context.");
		}
		return _typeIdentifiers.getItem(name);
	}

	/*
	 * Check if there is an item with the specified name in the specified list.
	 */
	private boolean itemExist(String name, BaseMap list)
	{
		if (list.getItem(name) == null)
			return false;
		else
			return true;
	}

	/*
	 * Get the datafield of the constant or variable with the specified name.
	 */
	protected DataField getVarOrConstantAsDataField(String name) throws TechnicalException
	{
		if (itemExist(name, _variables))
		{
			return _variables.getItem(name);
		} else if (itemExist(name, _constants))
		{
			return _constants.getItem(name).Clone();
		} else
		{
			throw new TechnicalException("There was no variable or constant named " + name + " in the context.");
		}
	}

	/*
	 * Add a new variable to the list of variables.
	 */
	public void AddVariable(String name, DataField value)
	{
		_variables.AddItem(name, value);
	}
}
