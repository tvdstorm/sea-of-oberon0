package oberon.expressions;

public class DivOperator implements IMathematicalOperator {

	public DivOperator() {}
	
	@Override
	public int eval(int lefthandSide, int righthandSide) {
		return lefthandSide / righthandSide;
	}

}
