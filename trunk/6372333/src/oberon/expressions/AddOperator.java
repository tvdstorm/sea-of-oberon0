package oberon.expressions;

/**
 * The Class AddOperator, implements the add operation on 2 ints.
 */
public class AddOperator implements IMathematicalOperator {

	/**
	 * Instantiates a new adds the operator.
	 */
	public AddOperator() {}
	
	/* (non-Javadoc)
	 * @see oberon.expressions.IMathematicalOperator#eval(int, int)
	 */
	@Override
	public int eval(int lefthandSide, int righthandSide) {
		return lefthandSide + righthandSide;
	}

}
