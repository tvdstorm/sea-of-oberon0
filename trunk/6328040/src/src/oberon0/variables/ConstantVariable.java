package oberon0.variables;

public class ConstantVariable implements IVariable{

	private final int _value;
	
	public ConstantVariable(int value){
		_value = value;
	}
	
	public VariableTypes getType() {
		return VariableTypes.CONSTANT;
	}

	public Object getValue() {
		return _value;
	}
	
	public void print(){
		System.out.println("Constant has value: " + _value);
	}

}
