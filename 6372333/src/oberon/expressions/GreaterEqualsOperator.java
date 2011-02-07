package oberon.expressions;

public class GreaterEqualsOperator implements IComparisonOperatorImplementation {
	public GreaterEqualsOperator() {}
	
	@Override
	public Boolean eval(int lefthandSide, int righthandSide) {
		return lefthandSide >= righthandSide;
	}

}
