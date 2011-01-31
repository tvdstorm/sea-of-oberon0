package oberon;

public class ComparisonExpression extends LeftAndRightExpression {

	private ComparisonType _type;

	public ComparisonExpression(Expression lefthandSide,
			Expression righthandSide, ComparisonType type) {
		super(lefthandSide, righthandSide);
		
		_type = type;
	}

	@Override
	public int EvalAsInt() {
		Expression leftHandSide = get_lefthandSide();
		Expression rightHandSide = get_righthandSide();
		
		switch(_type)
		{
		case Exeq:
			return BooleanAsInt(leftHandSide.EvalAsInt() == rightHandSide.EvalAsInt());
		case Exge:
			return BooleanAsInt(leftHandSide.EvalAsInt() >= rightHandSide.EvalAsInt());
		case Exgt:
			return BooleanAsInt(leftHandSide.EvalAsInt() > rightHandSide.EvalAsInt());
		case Exse:
			return BooleanAsInt(leftHandSide.EvalAsInt() <= rightHandSide.EvalAsInt());
		case Exst:
			return BooleanAsInt(leftHandSide.EvalAsInt() < rightHandSide.EvalAsInt());
		case Amp:
			return BooleanAsInt(leftHandSide.EvalAsBoolean() && rightHandSide.EvalAsBoolean());
		default:
			System.out.println("Unsupported comparison: "+ _type.toString());
		}
		return 0;
	}

}
