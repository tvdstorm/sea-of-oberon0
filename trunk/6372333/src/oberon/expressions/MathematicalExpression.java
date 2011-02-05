package oberon.expressions;

import oberon.IExpression;

public class MathematicalExpression extends AbstractLeftAndRightExpression {
	private final MathematicalExpressionType expressionType;

	public MathematicalExpression(final IExpression lefthandSide,
			final IExpression righthandSide, final MathematicalExpressionType type) {
		super(lefthandSide, righthandSide);
		expressionType = type;
	}

	@Override
	public int evalAsInt() {
		int result = 0;
		final int left = getLefthandSide().evalAsInt();
		final int right = getRighthandSide().evalAsInt();
		
		switch (expressionType) {
		case Add:
			result = left + right;
			break;
		case Div: 
			result = left / right;
			break;
		case Mod:
			result = left % right;
			break;
		case Mul:
			result = left * right;
			break;
		case Sub: 
			result = left - right;
			break;
		default:
			//TODO: throw
			break;
		}
		
		return result;
	}

}
