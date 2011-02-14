package oberon.expressions;

/**
 * The Class ModOperator.
 */
public class ModOperator implements IMathematicalOperator {

	/**
	 * Instantiates a new mod operator.
	 */
	public ModOperator() {}
	
	/* (non-Javadoc)
	 * @see oberon.expressions.IMathematicalOperator#eval(int, int)
	 */
	@Override
	public int eval(int lefthandSide, int righthandSide) {
		return lefthandSide % righthandSide;
	}

	/* (non-Javadoc)
	 * @see oberon.expressions.IMathematicalOperator#getOperatorSign()
	 */
	@Override
	public String getOperatorSign() {
		return "MOD";
	}

}
