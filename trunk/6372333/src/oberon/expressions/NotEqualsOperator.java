package oberon.expressions;

public class NotEqualsOperator implements IComparisonOperator {

	public NotEqualsOperator() {}
	
	@Override
	public Boolean eval(int lefthandSide, int righthandSide) {
		return lefthandSide != righthandSide;
	}

}
