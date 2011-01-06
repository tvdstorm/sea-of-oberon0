package runtime;

public class VoidValue extends Value {

	@Override
	public IntegerValue toInteger() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toNativeString() {
		return "<void>";
	}
}
