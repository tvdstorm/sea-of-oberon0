package oberon0.value;

public class BooleanValue extends IntegerValue {
	
	public BooleanValue(boolean value) {
		super((value)?1:0);
	}
	
	public BooleanValue getCopy() {
		return new BooleanValue(this.getBoolValue());
	}
}
