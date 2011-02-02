package oberon0.environment;

public class IntegerValue implements IValue{
	private int _value;
	
	public IntegerValue(int value){
		_value = value;
	}
	
	public int getValue(){
		return _value;
	}
	
	@Override
	public String toString(){
		return Integer.toString(_value);
	}
}
