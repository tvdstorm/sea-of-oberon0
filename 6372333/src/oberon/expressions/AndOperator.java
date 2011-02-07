package oberon.expressions;

public class AndOperator implements IComparisonOperatorImplementation {

	public AndOperator() {}
	
	@Override
	public Boolean eval(int lefthandSide, int righthandSide) {
		return lefthandSide == righthandSide; 
	}

}
