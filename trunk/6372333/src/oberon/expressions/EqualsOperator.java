package oberon.expressions;


/**
 * The Class EqualsOperator.
 */
public class EqualsOperator implements IComparisonOperator {

	/**
	 * Instantiates a new equals operator.
	 */
	public EqualsOperator() {} 
	
	/* (non-Javadoc)
	 * @see oberon.expressions.IComparisonOperator#eval(int, int)
	 */
	@Override
	public Boolean eval(int leftHandSide, int rightHandSide) {
		return  leftHandSide == rightHandSide;
	}

	/* (non-Javadoc)
	 * @see oberon.expressions.IComparisonOperator#getOperatorSign()
	 */
	@Override
	public String getOperatorSign() {
		return "==";
	}

}
