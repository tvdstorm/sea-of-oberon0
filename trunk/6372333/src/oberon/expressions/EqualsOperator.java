package oberon.expressions;


public class EqualsOperator implements IComparisonOperator {

	public EqualsOperator() {} 
	
	@Override
	public Boolean eval(int leftHandSide, int rightHandSide) {
		return  leftHandSide == rightHandSide;
	}

}
