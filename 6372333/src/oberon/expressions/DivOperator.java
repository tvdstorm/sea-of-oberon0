package oberon.expressions;

/**
 * The Class DivOperator.
 */
public class DivOperator implements IMathematicalOperator {

	/**
	 * Instantiates a new div operator.
	 */
	public DivOperator() {}
	
	/* (non-Javadoc)
	 * @see oberon.expressions.IMathematicalOperator#eval(int, int)
	 */
	@Override
	public int eval(int lefthandSide, int righthandSide) {
		return lefthandSide / righthandSide;
	}

	/* (non-Javadoc)
	 * @see oberon.expressions.IMathematicalOperator#getOperatorSign()
	 */
	@Override
	public String getOperatorSign() {
		return "DIV";
	}
}
