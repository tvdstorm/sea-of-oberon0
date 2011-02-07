package oberon.expressions;

public class NotEqualsOperator implements IComparisonOperatorImplementation {

	public NotEqualsOperator() {}
	
	@Override
	public Boolean eval(int lefthandSide, int righthandSide) {
		return lefthandSide != righthandSide;
	}

}
