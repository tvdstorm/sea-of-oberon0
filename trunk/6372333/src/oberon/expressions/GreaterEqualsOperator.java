package oberon.expressions;

/**
 * The Class GreaterEqualsOperator.
 */
public class GreaterEqualsOperator implements IComparisonOperator {
	
	/**
	 * Instantiates a new greater equals operator.
	 */
	public GreaterEqualsOperator() {}
	
	/* (non-Javadoc)
	 * @see oberon.expressions.IComparisonOperator#eval(int, int)
	 */
	@Override
	public Boolean eval(int lefthandSide, int righthandSide) {
		return lefthandSide >= righthandSide;
	}

	/* (non-Javadoc)
	 * @see oberon.expressions.IComparisonOperator#getOperatorSign()
	 */
	@Override
	public String getOperatorSign() {
		return ">=";
	}

}
