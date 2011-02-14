package oberon.expressions;

/**
 * The Interface IMathematicalOperator.
 */
public interface IMathematicalOperator {
	
	/**
	 * Implements the operator.
	 *
	 * @param lefthandSide the lefthand side
	 * @param righthandSide the righthand side
	 * @return the int
	 */
	int eval(int lefthandSide, int righthandSide);

	/**
	 * Gets the operator sign.
	 *
	 * @return the operator sign
	 */
	String getOperatorSign();
}
