package oberon.expressions;

public class GreaterEqualsOperator implements IComparisonOperator {
	public GreaterEqualsOperator() {}
	
	@Override
	public Boolean eval(int lefthandSide, int righthandSide) {
		return lefthandSide >= righthandSide;
	}

}
