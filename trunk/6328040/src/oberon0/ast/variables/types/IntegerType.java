package oberon0.ast.variables.types;

import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.IntegerValue;

public class IntegerType implements IType{

	@Override
	public TypeNames getTypeName(Context context) {
		return TypeNames.INTEGER;
	}

	@Override
	public IValue getDefaultValue(Context context) {
		return new IntegerValue(0);
	}

}
