package uva.oberon0.runtime;

import java.util.HashMap;
import java.util.Map;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.declarations.Constant;
import uva.oberon0.abstractsyntax.declarations.CustomType;
import uva.oberon0.abstractsyntax.declarations.Declaration;
import uva.oberon0.abstractsyntax.declarations.DeclarationList;
import uva.oberon0.abstractsyntax.declarations.Procedure;
import uva.oberon0.abstractsyntax.declarations.Variable;
import uva.oberon0.abstractsyntax.expressions.ExpressionList;
import uva.oberon0.abstractsyntax.expressions.Reference;
import uva.oberon0.abstractsyntax.types.ID;

/**
 * @author Chiel Labee This class represents an Execution Scope.
 */
public class Scope {
	private final Scope _parent;
	private final Map<String, IBindable> _mapBindings;

	public Scope() {
		this(null);
	}

	public Scope(Scope parent) {
		_parent = parent;
		_mapBindings = new HashMap<String, IBindable>();
	}

	public Scope(DeclarationList declarations, Scope parent) {
		this(parent);

		// Loop all Declarations.
		for (Declaration declaration : declarations) {
			// Add item to Procedures map.
			if (declaration instanceof IBindable) {
				putBindable(declaration.getID(), (IBindable)declaration);
			}

			// Add item to Type map.
			else if (declaration instanceof CustomType) {
				putBindable(((CustomType) declaration).getID(), ((CustomType)declaration).getType());
			}

			// Create and Add an Execution Scope Value to the Value hash.
			else if (declaration instanceof Variable) {
				putBindable(declaration.getID(),
						((Variable) declaration).instantiate(this));
			}

			// Create and Add an Execution Scope Value to the Value hash.
			else if (declaration instanceof Constant) {
				putBindable(declaration.getID(),
						((Constant) declaration).instantiate(this));
			}

			else {
				assert false : "Declaration Type not implemented!";
			}
		}
	}

	public Scope(ExpressionList actualParameters, Procedure procedure,
			Scope parent) {
		// Process the Procedure Body declarations.
		this(procedure.getDeclarations(), parent);

		// Register current Procedure for executing.
		putBindable(procedure.getID(), procedure);

		// Loop all Method Call Variables.
		for (int i = 0; i < procedure.getParameterCount(); i++) {
			// Determine the Formal Procedure Parameter.
			Variable formal = (Variable) procedure.getParameter(i);

			// Determine the Actual Method Call.
			BaseNode actual = actualParameters.get(i);

			// Determine if the declaration should be passed by Reference.
			if (formal.isByReference()) {
				// Get and Add the existing Execution Scope Value.
				putBindable(formal.getID(), parent.getValueReference(((Reference) actual).getID()));
			}

			// Determine if the declaration should be passed by Value.
			else {
				Value value = formal.instantiate(this);
				((IntegerValue) value).setValue(actual.eval(parent));

				// Create and Add an Execution Scope Value to the Value hash.
				putBindable(formal.getID(), value);
			}
		}
	}
	public void putBindable(ID itemID, IBindable item) {
		_mapBindings.put(itemID.getValue(), item);
	}
	public IBindable getBindable(ID itemID)
	{
		return _mapBindings.get(itemID.getValue());
	}

	/**
	 * Gets an Integer Value from the current Execution Scope.
	 * 
	 * @param id
	 *            The Identifier of the Value that should be retrieved.
	 */
	public int getValue(ID id) {
		return ((IntegerValue) getValueReference(id)).getValue();
	}

	private Value getValueReference(ID id) {
		assert id != null : "ID cannot be Null!";

		Value value = null;

		// Determine value reference from current scope.
		if (_mapBindings.containsKey(id.getValue())) {
			value = (Value)_mapBindings.get(id.getValue());
		}

		// Determine value reference from parent scope.
		else if (_parent != null) {
			value = _parent.getValueReference(id);
		}

		// Unsuspected termination.
		if (value == null) {
			assert false : "Value for " + id + " not found!";
			return null;
		}

		// Determine selector value.
		if (id.getSelector() != null) {
			value = value.getValueBySelector(this, id.getSelector());
		}

		return value;
	}

	/**
	 * Sets the Integer Value within the current Execution Scope.
	 * 
	 * @param id
	 *            The Identifier of the Value that should be stored.
	 */
	public void setValue(ID id, int valueNew) {
		IntegerValue scopeValue = (IntegerValue) getValueReference(id);
		scopeValue.setValue(valueNew);
	}


	/**
	 * Performs a Procedure Method Call within the current Execution Scope.
	 */
	public int callProcedure(ID id, ExpressionList actualParameterList) {
		// Retrieve procedure from hash in current Execution Scope.
		Procedure procedure = (Procedure)getBindable(id);

		// Determine procedure match in current Execution Scope.
		if (procedure != null) {
			// Create a new child Execution Scope for the Procedure Method Call.
			Scope scope = new Scope(actualParameterList, procedure, this);
			// Evaluate the Procedure Method Call.
			return procedure.eval(scope);
		}

		// Detect incorrect implementation!
		assert false : "Procedure not implemented!";
		return 0;
	}
}
