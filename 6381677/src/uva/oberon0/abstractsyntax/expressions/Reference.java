package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.abstractsyntax.types.IntegerType;
import uva.oberon0.runtime.Scope;

public class Reference extends Expression {
	private final ID _id;

	public Reference(ID id) {
		super(new IntegerType());
		
		_id = id;
	}

	@Override
	public int eval(Scope scope) {
		return scope.getValueAsInteger(_id);
	}

	public ID getID() {
		return _id;
	}

}
