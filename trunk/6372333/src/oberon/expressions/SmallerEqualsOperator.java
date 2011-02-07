package oberon.expressions;

public class SmallerEqualsOperator implements IComparisonOperator {

	public SmallerEqualsOperator() {}
	
	@Override
	public Boolean eval(int lefthandSide, int righthandSide) {
		return lefthandSide <= righthandSide;
	}

}
