package oberon.expressions;

/**
 * The Class SubOperator.
 */
public class SubOperator implements IMathematicalOperator {

	/**
	 * Instantiates a new sub operator.
	 */
	public SubOperator() {}
	
	/* (non-Javadoc)
	 * @see oberon.expressions.IMathematicalOperator#eval(int, int)
	 */
	@Override
	public int eval(int lefthandSide, int righthandSide) {
		return lefthandSide - righthandSide;
	}

	/* (non-Javadoc)
	 * @see oberon.expressions.IMathematicalOperator#getOperatorSign()
	 */
	@Override
	public String getOperatorSign() {
		return "-";
	}

}
