package interpreter;

public abstract class Value {

	//FIXME: think about alternative designs
	public boolean isInteger() {
		return false;
	}
	
	public abstract IntegerValue toInteger();
}
