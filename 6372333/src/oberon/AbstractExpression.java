package oberon;

public abstract class AbstractExpression {
	public abstract int evalAsInt();
	
	public Boolean evalAsBoolean() {
		return evalAsInt() == 1;
	}
	
	protected int booleanAsInt(final Boolean input) {
		int result = 0;
		if (input) {
			result = 1;
		}
		return result;
	}

}
