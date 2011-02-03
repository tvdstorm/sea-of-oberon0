package oberon;

public class AbstractIntegerExpression extends AbstractExpression {
	private final int expressionValue;

	public AbstractIntegerExpression(final int value) {
		expressionValue = value;
	}
	
	@Override
	public int evalAsInt() {
		return expressionValue;
	}

}
