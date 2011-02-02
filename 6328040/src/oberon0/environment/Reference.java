package oberon0.environment;

public class Reference {
	private IValue _value;
	
	public Reference(IValue value){
		_value = value;
	}
	
	public IValue getValue(){
		return (IValue) _value;
	}
	
	public void setValue(IValue value){
		_value = value;
	}
	
	public String toString(){
		return _value.toString();
	}
}
