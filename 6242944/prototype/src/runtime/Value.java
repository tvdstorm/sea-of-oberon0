package runtime;

public abstract class Value {

	//FIXME: think about alternative designs
	public boolean isInteger() {
		return false;
	}
	
	public abstract IntegerValue toInteger();

	public abstract String toNativeString();
}
