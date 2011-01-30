package oberon0.variables;

public class ConstantVar extends BaseReadableVar{

	private final int _value;
	
	public ConstantVar(String name, int value){
		super(name);
		_value = value;
	}
	
	@Override
	public VariableTypes getType() {
		return VariableTypes.CONSTANT;
	}

	@Override
	public Object getValue() {
		return _value;
	}
}
