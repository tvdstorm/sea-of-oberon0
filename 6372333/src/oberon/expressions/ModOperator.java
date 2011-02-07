package oberon.expressions;

public class ModOperator implements IMathematicalOperator {

	public ModOperator() {}
	
	@Override
	public int eval(int lefthandSide, int righthandSide) {
		return lefthandSide % righthandSide;
	}

}
