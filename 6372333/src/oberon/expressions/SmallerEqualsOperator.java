package oberon.expressions;

/**
 * The Class SmallerEqualsOperator.
 */
public class SmallerEqualsOperator implements IComparisonOperator {

	/**
	 * Instantiates a new smaller equals operator.
	 */
	public SmallerEqualsOperator() {}
	
	/* (non-Javadoc)
	 * @see oberon.expressions.IComparisonOperator#eval(int, int)
	 */
	@Override
	public Boolean eval(int lefthandSide, int righthandSide) {
		return lefthandSide <= righthandSide;
	}

	/* (non-Javadoc)
	 * @see oberon.expressions.IComparisonOperator#getOperatorSign()
	 */
	@Override
	public String getOperatorSign() {
		return "<=";
	}

}
