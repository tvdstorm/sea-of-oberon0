package runtime;

public abstract class Value {

	//FIXME: implement alternative design?
	public boolean isInteger() {
		return false;
	}
	public boolean isBoolean() {
		return false;
	}
	public boolean isArray() {
		return false;
	}
	
	public abstract IntegerValue toInteger();
	public abstract BooleanValue toBoolean();
	public abstract ArrayValue toArray();

	public abstract String toNativeString();
	public abstract boolean valueEquals(Value other);
}
