package oberon;

public abstract class AbstractExpression implements IExpression {
	/* (non-Javadoc)
	 * @see oberon.IExpression#evalAsInt()
	 */
	@Override
	public abstract int evalAsInt();
	
	/* (non-Javadoc)
	 * @see oberon.IExpression#evalAsBoolean()
	 */
	@Override
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
