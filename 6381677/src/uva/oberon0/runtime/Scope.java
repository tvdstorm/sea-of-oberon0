package uva.oberon0.runtime;

import java.util.Hashtable;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.ID;
import uva.oberon0.abstractsyntax.declarations.BaseDeclaration;
import uva.oberon0.abstractsyntax.declarations.BaseDeclarationList;
import uva.oberon0.abstractsyntax.declarations.Procedure;
import uva.oberon0.abstractsyntax.declarations.Var;
import uva.oberon0.abstractsyntax.declarations.VarRef;
import uva.oberon0.abstractsyntax.statements.CallActualParameters;
import uva.oberon0.abstractsyntax.types.ArrayType;
import uva.oberon0.abstractsyntax.types.BaseType;


/**
 * @author Chiel Labee
 * This class represents an Execution Scope.
*/
public class Scope 
{
	public Scope() {
	}
	
	public Scope(BaseDeclarationList declarations, Scope parent)
	{
		//Reference to Parent Execution Scope to create a Stack Hierarchy.
		_parent = parent;

		//Loop all Declarations.
		for (BaseDeclaration declaration : declarations)
		{
			//Add item to Procedures hash.
			if (declaration instanceof Procedure)
				addProcedure((Procedure)declaration);

			//Create and Add an Execution Scope Value to the Value hash.
			else
				addValue(declaration.getID(), createValue(declaration, null));
		}
	}
	public Scope(CallActualParameters actualParameters, Procedure procedure, Scope parent)
	{
		//Process the Procedure Body declarations.
		this(procedure.getDeclarations(), parent);
		
		//Loop all Method Call Variables.
		for (int i = 0; i < procedure.getParameterCount(); i++)
		{
			//Determine the Method Declaration.
			BaseDeclaration formal = procedure.getParameter(i);
			//Determine the Call Variable.
			BaseNode actual = actualParameters.getItem(i);
			
			//Determine if the declaration should be passed by Reference.
			if (formal instanceof VarRef)
			{
				//Get and Add the existing Execution Scope Value. 
				addValue(formal.getID(), _parent.getValueReference((ID)actual));
			}
			
			//Determine if the declaration should be passed by Reference.
			else if (formal instanceof Var)
			{
				//Create and Add an Execution Scope Value to the Value hash.
				addValue(formal.getID(), createValue(actual, null));
			}
			
			//Determine incomplete implementation.
			else
			{
				assert false : "Procedure Call Declaration Type not implemented!";
			}
		}
	}
	
	private void addProcedure(Procedure procedure)
	{
		_hashProcedures.put(procedure.getID(), procedure);
	}
	
	public void addValue(ID id, ScopeValueBase value)
	{
		_hashValues.put(id, value);
	}
	
	private ScopeValueBase createValue(BaseNode declaration, ID callVarID)
	{
		if (declaration instanceof Var)
		{
			Var var = (Var)declaration;
			BaseType varType = var.getType();
			
			if (varType instanceof ArrayType)
				return new ScopeValueIntArray(this, (ArrayType)varType);
		}
		
		return new ScopeValueInt(this, declaration.eval(_parent));
	}
	
	private Scope _parent = null;
	private Hashtable<ID, ScopeValueBase> _hashValues = new Hashtable<ID, ScopeValueBase>();
	private Hashtable<ID, Procedure> _hashProcedures = new Hashtable<ID, Procedure>();

	/**
	 * Gets an Integer Value from the current Execution Scope.
	 * @param id The Identifier of the Value that should be retrieved.
	 */
	public int getValue(ID id)
	{
		ScopeValueBase scopeValue = getValueReference(id);
		
		if (scopeValue == null)
		{
			assert false : "Variable " + id.getValue() + " not found!";
			return 0;
		}
		
		return scopeValue.getValue(this, id);
	}
	protected ScopeValueBase getValueReference(ID id)
	{
		ScopeValueBase value = _hashValues.get(id);
		
		if (value != null)
			return value.getValueReference(this, id);
		
		if (_parent != null)
			return _parent.getValueReference(id);
		
		assert false : "Variable " + id.getValue() + " not found!";
		return null;
	}

	/**
	 * Sets the Integer Value whitin the current Execution Scope.
	 * @param id The Identifier of the Value that should be stored.
	 */
	public int setValue(ID id, int valueNew)
	{
		ScopeValueBase scopeValue = getValueReference(id);
		
		if (scopeValue == null)
		{
			assert false : "Variable " + id.getValue() + " not found!";
			return 0;
		}
		
		scopeValue.setValue(this, id, valueNew);
		
		return 1;
	}
	
	/**
	 * Performs a Procedure Method Call within the current Execution Scope.
	 * @param id The Identifier of the Procedure that should be executed.
	 * @param callVars The Method Call Variables that should be passed to the Procedure.
	 */
	public int callProcedure(ID id, CallActualParameters callVars)
	{
		return callProcedure(id, callVars, this);
	}
	protected int callProcedure(ID id, CallActualParameters callVars, Scope parentScope)
	{
		//Retrieve procedure from hash in current Execution Scope.
		Procedure procedure = _hashProcedures.get(id);
		
		//Determine procedure match in current Execution Scope.
		if (procedure != null)
		{
			//Create a new child Execution Scope for the Procedure Method Call.
			Scope scope = new Scope(callVars, procedure, parentScope);
			//Evaluate the Procedure Method Call.
			return procedure.eval(scope);
		}
		
		//Determine if a parent Execution Scope is available.
		if (_parent != null)
			//Perform the Procedure Method Call on the parent Execution Scope.
			return _parent.callProcedure(id, callVars, parentScope);
		
		//Detect incorrect implementation!
		assert false : "Procedure not implemented!";
		return 0;
	}
}
