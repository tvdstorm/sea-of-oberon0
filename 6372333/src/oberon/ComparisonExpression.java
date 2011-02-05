package oberon;

public class ComparisonExpression extends AbstractLeftAndRightExpression {

	private final ComparisonType comparisonType;

	public ComparisonExpression(final IExpression lefthandSide,
			final IExpression righthandSide, final ComparisonType type) {
		super(lefthandSide, righthandSide);
		
		comparisonType = type;
	}

	@Override
	public int evalAsInt() {
		final IExpression leftHandSide = getLefthandSide();
		final IExpression rightHandSide = getRighthandSide();
		
		int result = 0;
		switch(comparisonType) {
		case Exeq:
			result = booleanAsInt(leftHandSide.evalAsInt() == rightHandSide.evalAsInt());
			break;
		case Exge:
			result = booleanAsInt(leftHandSide.evalAsInt() >= rightHandSide.evalAsInt());
			break;
		case Exgt:
			result = booleanAsInt(leftHandSide.evalAsInt() > rightHandSide.evalAsInt());
			break;
		case Exse:
			result = booleanAsInt(leftHandSide.evalAsInt() <= rightHandSide.evalAsInt());
			break;
		case Exst:
			result = booleanAsInt(leftHandSide.evalAsInt() < rightHandSide.evalAsInt());
			break;
		case Amp:
			result = booleanAsInt(leftHandSide.evalAsBoolean() && rightHandSide.evalAsBoolean());
			break;
		default:
			//TODO: throw
		}
		return result;
	}
}
