package oberon.expressions;

/**
 * The Class AndOperator.
 */
public class AndOperator implements IComparisonOperator {

	/**
	 * Instantiates a new and operator.
	 */
	public AndOperator() {}
	
	/* (non-Javadoc)
	 * @see oberon.expressions.IComparisonOperator#eval(int, int)
	 */
	@Override
	public Boolean eval(int lefthandSide, int righthandSide) {
		return lefthandSide == righthandSide; 
	}

	/* (non-Javadoc)
	 * @see oberon.expressions.IComparisonOperator#getOperatorSign()
	 */
	@Override
	public String getOperatorSign() {
		return "&";
	}

}
