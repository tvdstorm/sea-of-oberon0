package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.types.ID;


/**
 * @author Chiel Labee
 * This class represents an Assignment Statement.
*/
public class Assign extends Statement {
	private final ID _id;
	private final BaseNode _value;

	public Assign(ID id, BaseNode value)
	{
		assert id != null 		: "No Identifier is available for the current Assign Statement!";
		assert value != null 	: "No Value is available for the current Assign Statement!";
		
		_id = id;
		_value = value;
	}

	@Override
	public int eval(uva.oberon0.runtime.Scope scope)
	{
		return scope.setValue(_id, _value.eval(scope));
	}
}
