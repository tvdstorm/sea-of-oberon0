package oberon.expressions;

public class AndOperator implements IComparisonOperator {

	public AndOperator() {}
	
	@Override
	public Boolean eval(int lefthandSide, int righthandSide) {
		return lefthandSide == righthandSide; 
	}

}
