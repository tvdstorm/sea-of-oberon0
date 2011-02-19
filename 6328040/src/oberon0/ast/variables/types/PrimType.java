package oberon0.ast.variables.types;

import oberon0.environment.Context;
import oberon0.environment.IValue;

public class PrimType implements IType {
	private final String _typename;
	private IType _type;

	public PrimType(String typename) {
		_typename = typename;
	}

	public void typeFactory(Context context) {
		// TODO: for typechecking, something for arrays and records probably
		if (_typename.equals("INTEGER")) {
			_type = new IntegerType();
		} else if (_typename.equals("BOOLEAN")) {
			_type = new BooleanType();
		} else {
			_type = context.getType(_typename);
		}
	}

	public TypeNames getTypeName(Context context) {
		typeFactory(context);
		return _type.getTypeName(context);
	}

	@Override
	public IValue getDefaultValue(Context context) {
		typeFactory(context);
		return _type.getDefaultValue(context);
	}
}
