package oberon;

public class MathematicalExpression extends LeftAndRightExpression {
	
	private MathematicalExpressionType _type;

	public MathematicalExpression(Expression lefthandSide,
			Expression righthandSide, MathematicalExpressionType type) {
		super(lefthandSide, righthandSide);
		_type = type;
	}

	@Override
	public int EvalAsInt() {
		int result = 0;
		int left = get_lefthandSide().EvalAsInt();
		int right = get_righthandSide().EvalAsInt();
		
		switch (_type) {
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
			//TODO
			break;
		}
		
		return result;
	}

}
