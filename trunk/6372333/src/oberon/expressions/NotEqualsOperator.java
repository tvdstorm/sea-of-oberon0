package oberon.expressions;

/**
 * The Class NotEqualsOperator.
 */
public class NotEqualsOperator implements IComparisonOperator {

	/**
	 * Instantiates a new not equals operator.
	 */
	public NotEqualsOperator() {}
	
	/* (non-Javadoc)
	 * @see oberon.expressions.IComparisonOperator#eval(int, int)
	 */
	@Override
	public Boolean eval(int lefthandSide, int righthandSide) {
		return lefthandSide != righthandSide;
	}

	/* (non-Javadoc)
	 * @see oberon.expressions.IComparisonOperator#getOperatorSign()
	 */
	@Override
	public String getOperatorSign() {
		return "~";
	}

}
