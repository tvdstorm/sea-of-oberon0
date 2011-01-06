package runtime;

public abstract class Value {

	//FIXME: implement alternative design?
	public boolean isInteger() {
		return false;
	}
	public boolean isBoolean() {
		return false;
	}

	public abstract IntegerValue toInteger();
	public abstract BooleanValue toBoolean();

	public abstract String toNativeString();

}
