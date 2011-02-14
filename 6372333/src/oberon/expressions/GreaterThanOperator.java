package oberon.expressions;

/**
 * The Class GreaterThanOperator.
 */
public class GreaterThanOperator implements IComparisonOperator {
	
	/**
	 * Instantiates a new greater than operator.
	 */
	public GreaterThanOperator() {}
	
	/* (non-Javadoc)
	 * @see oberon.expressions.IComparisonOperator#eval(int, int)
	 */
	@Override
	public Boolean eval(int lefthandSide, int righthandSide) {
		return lefthandSide > righthandSide;
	}

	/* (non-Javadoc)
	 * @see oberon.expressions.IComparisonOperator#getOperatorSign()
	 */
	@Override
	public String getOperatorSign() {
		return ">";
	}

}
