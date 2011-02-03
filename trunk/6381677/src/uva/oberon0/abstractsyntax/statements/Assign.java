package uva.oberon0.abstractsyntax.statements;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.ID;


/**
 * @author Chiel Labee
 * This class represents an Assignment Statement.
*/
public class Assign extends BaseStatement {

	public Assign(ID id, BaseNode value)
	{
		_id = id;
		_value = value;
	}

	//Represents the Identifier Node that needs to be assigned.
	private ID _id = null;
	//Represents the Value Node that needs to be set to the Identifier Node.
	private BaseNode _value = null;
	
	
	@Override
	public boolean isValid()
	{
		return _id != null
		&& _value != null;
	}
	
	@Override
	public int eval(uva.oberon0.runtime.Scope scope)
	{
		return scope.setValue(_id, _value.eval(scope));
	}
}
