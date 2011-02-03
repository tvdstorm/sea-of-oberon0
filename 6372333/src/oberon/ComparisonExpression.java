package oberon;

public class ComparisonExpression extends AbstractLeftAndRightExpression {

	private final ComparisonType comparisonType;

	public ComparisonExpression(final AbstractExpression lefthandSide,
			final AbstractExpression righthandSide, final ComparisonType type) {
		super(lefthandSide, righthandSide);
		
		comparisonType = type;
	}

	@Override
	public int evalAsInt() {
		final AbstractExpression leftHandSide = getLefthandSide();
		final AbstractExpression rightHandSide = getRighthandSide();
		
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
