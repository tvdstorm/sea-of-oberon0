package uva.oberon0.runtime;

import java.util.HashMap;
import java.util.Map;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.declarations.BaseDeclaration;
import uva.oberon0.abstractsyntax.declarations.BaseDeclarationList;
import uva.oberon0.abstractsyntax.declarations.Constant;
import uva.oberon0.abstractsyntax.declarations.Procedure;
import uva.oberon0.abstractsyntax.declarations.Type;
import uva.oberon0.abstractsyntax.declarations.Variable;
import uva.oberon0.abstractsyntax.statements.CallActualParameterList;
import uva.oberon0.abstractsyntax.types.ID;


/**
 * @author Chiel Labee
 * This class represents an Execution Scope.
*/
public class Scope 
{
	private final Scope						_parent			;
	private final Map<ID, Type> 			_mapTypes 		;
	private final Map<ID, ScopeValueBase> 	_mapValues 		;
	private final Map<ID, Procedure> 		_mapProcedures 	;

	public Scope()
	{
		this(null);
	}
	public Scope(Scope parent) 
	{
		_parent 		= parent;
		_mapTypes 		= new HashMap<ID, Type>();
		_mapValues 		= new HashMap<ID, ScopeValueBase>();
		_mapProcedures 	= new HashMap<ID, Procedure>();
	}
	
	public Scope(BaseDeclarationList declarations, Scope parent)
	{
		this(parent);
		
		//Loop all Declarations.
		for (BaseDeclaration declaration : declarations)
		{
			//Add item to Procedures map.
			if (declaration instanceof Procedure) {
				addProcedure((Procedure)declaration);
			}
			
			//Add  item to Type map.
			else if (declaration instanceof Type) {
				addType((Type)declaration);
			}
			
			//Create and Add an Execution Scope Value to the Value hash.
			else if (declaration instanceof Variable) {
				addValue(declaration.getID(), ((Variable)declaration).instantiate(this));
			}
			
			//Create and Add an Execution Scope Value to the Value hash.
			else if (declaration instanceof Constant) {
				addValue(declaration.getID(), ((Constant)declaration).instantiate(this));
			}
			
			else {
				assert false : "Declaration Type not implemented!";
			}
		}
	}
	public Scope(CallActualParameterList actualParameters, Procedure procedure, Scope parent)
	{
		//Process the Procedure Body declarations.
		this(procedure.getDeclarations(), parent);
		
		//Register current Procedure for executing.
		_mapProcedures.put(procedure.getID(), procedure);
		
		//Loop all Method Call Variables.
		for (int i = 0; i < procedure.getParameterCount(); i++) 
		{
			//Determine the Formal Procedure Parameter.
			Variable formal = (Variable)procedure.getParameter(i);
			
			//Determine the Actual Method Call.
			BaseNode actual = actualParameters.get(i);
			
			//Determine if the declaration should be passed by Reference.
			if (formal.isByReference()) {
				//Get and Add the existing Execution Scope Value. 
				addValue(formal.getID(), parent.getValueReference(ID.get(actual)));
			}
			
			//Determine if the declaration should be passed by Value.
			else {
				ScopeValueBase value = formal.instantiate(this);
				value.setValue(this, actual.eval(parent));
				
				//Create and Add an Execution Scope Value to the Value hash.
				addValue(formal.getID(), value);
			}
		}
	}
	
	private void addProcedure(Procedure procedure)
	{
		_mapProcedures.put(procedure.getID(), procedure);
	}
	private void addType(Type type)
	{
		_mapTypes.put(type.getID(), type);
	}
	public void addValue(ID id, ScopeValueBase value)
	{
		_mapValues.put(id, value);
	}
	
	/**
	 * Gets an Integer Value from the current Execution Scope.
	 * @param id The Identifier of the Value that should be retrieved.
	 */
	public int getValue(ID id)
	{
		ScopeValueBase scopeValue = getValueReference(id);
		
		if (scopeValue == null){
			assert false : "Variable " + id + " not found!";
			return 0;
		}
		
		return scopeValue.getValue(this);
	}
	private ScopeValueBase getValueReference(ID id)
	{
		assert id != null : "ID cannot be Null!";
		
		ScopeValueBase value = null;
		
		if (_mapValues.containsKey(id)){
			value = _mapValues.get(id);
		}
		
		else if (_parent != null){
			value = _parent.getValueReference(id);
		}
		
		if (value != null){
			return value.getValueReference(this, id);
		}
		
		assert false : "Variable " + id + " not found!";
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
			assert false : "Variable " + id + " not found!";
			return 0;
		}
		
		scopeValue.setValue(this, valueNew);
		
		return 1;
	}
	
	/**
	 * Get the specified Type from within the current Execution Scope.
	 */
	public Type getType(ID id)
	{
		if (_mapTypes.containsKey(id)) {
			return _mapTypes.get(id);
		}
		
		if (_parent != null) {
			return _parent.getType(id);
		}
		
		assert false : "Undefined Type " + id + "!";
		return null;
	}
	
	/**
	 * Performs a Procedure Method Call within the current Execution Scope.
	 * @param id The Identifier of the Procedure that should be executed.
	 * @param callVars The Method Call Variables that should be passed to the Procedure.
	 */
	public int callProcedure(ID id, CallActualParameterList callVars)
	{
		return callProcedure(id, callVars, this);
	}
	protected int callProcedure(ID id, CallActualParameterList callVars, Scope parentScope)
	{
		//Retrieve procedure from hash in current Execution Scope.
		Procedure procedure = _mapProcedures.get(id);
		
		//Determine procedure match in current Execution Scope.
		if (procedure != null) {
			//Create a new child Execution Scope for the Procedure Method Call.
			Scope scope = new Scope(callVars, procedure, parentScope);
			//Evaluate the Procedure Method Call.
			return procedure.eval(scope);
		}
		
		//Detect incorrect implementation!
		assert false : "Procedure not implemented!";
		return 0;
	}
}
