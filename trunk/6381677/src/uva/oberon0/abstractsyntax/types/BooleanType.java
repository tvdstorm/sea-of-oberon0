package uva.oberon0.abstractsyntax.types;

import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.values.BooleanValue;
import uva.oberon0.runtime.values.Value;

public class BooleanType extends BaseType {

	public BooleanType() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Value instantiate(Scope scope) {
		return new BooleanValue();
	}

}
