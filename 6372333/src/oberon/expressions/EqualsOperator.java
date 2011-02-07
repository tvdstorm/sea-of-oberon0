package oberon.expressions;


public class EqualsOperator implements IComparisonOperatorImplementation {

	public EqualsOperator() {} 
	
	@Override
	public Boolean eval(int leftHandSide, int rightHandSide) {
		return  leftHandSide == rightHandSide;
	}

}
