package oberon.expressions;

public class SmallerThanOperator implements IComparisonOperatorImplementation {

	public SmallerThanOperator() {}
	
	@Override
	public Boolean eval(int lefthandSide, int righthandSide) {
		return lefthandSide < righthandSide;
	}

}
