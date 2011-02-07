package oberon.expressions;

public class MulOperator implements IMathematicalOperator {

	public MulOperator() {}
	
	@Override
	public int eval(int lefthandSide, int righthandSide) {
		return lefthandSide * righthandSide;
	}

}
