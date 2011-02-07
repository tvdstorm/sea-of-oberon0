package oberon.expressions;

public class SubOperator implements IMathematicalOperator {

	public SubOperator() {}
	
	@Override
	public int eval(int lefthandSide, int righthandSide) {
		return lefthandSide - righthandSide;
	}

}
