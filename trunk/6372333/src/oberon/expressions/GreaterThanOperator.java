package oberon.expressions;

public class GreaterThanOperator implements IComparisonOperatorImplementation {
	
	public GreaterThanOperator() {}
	
	@Override
	public Boolean eval(int lefthandSide, int righthandSide) {
		return lefthandSide > righthandSide;
	}

}
