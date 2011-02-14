package oberon.expressions;

/**
 * The Class SmallerThanOperator.
 */
public class SmallerThanOperator implements IComparisonOperator {

	/**
	 * Instantiates a new smaller than operator.
	 */
	public SmallerThanOperator() {}
	
	/* (non-Javadoc)
	 * @see oberon.expressions.IComparisonOperator#eval(int, int)
	 */
	@Override
	public Boolean eval(int lefthandSide, int righthandSide) {
		return lefthandSide < righthandSide;
	}

	/* (non-Javadoc)
	 * @see oberon.expressions.IComparisonOperator#getOperatorSign()
	 */
	@Override
	public String getOperatorSign() {
		return "<";
	}

}
