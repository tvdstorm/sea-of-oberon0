package oberon0.ast.variables.types;

import oberon0.environment.BooleanValue;
import oberon0.environment.Context;
import oberon0.environment.IValue;

public class BooleanType implements IType {

	@Override
	public TypeNames getTypeName(Context context) {
		return TypeNames.BOOLEAN;
	}

	@Override
	public IValue getDefaultValue(Context context) {
		return new BooleanValue(false);
	}

}
