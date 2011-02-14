package oberon.expressions;

/**
 * The Class MulOperator.
 */
public class MulOperator implements IMathematicalOperator {

	/**
	 * Instantiates a new mul operator.
	 */
	public MulOperator() {}
	
	/* (non-Javadoc)
	 * @see oberon.expressions.IMathematicalOperator#eval(int, int)
	 */
	@Override
	public int eval(int lefthandSide, int righthandSide) {
		return lefthandSide * righthandSide;
	}

	/* (non-Javadoc)
	 * @see oberon.expressions.IMathematicalOperator#getOperatorSign()
	 */
	@Override
	public String getOperatorSign() {
		return "MUL";
	}

}
