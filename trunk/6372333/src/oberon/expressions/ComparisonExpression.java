package oberon.expressions;

import oberon.IExpression;
import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;

/**
 * The Class ComparisonExpression, compares to expressions.
 */
public class ComparisonExpression extends AbstractLeftAndRightExpression {

	/** The comparison type. */
	private final ComparisonType comparisonType;

	/**
	 * Instantiates a new comparison expression.
	 *
	 * @param lefthandSide the lefthand side of the expression
	 * @param righthandSide the righthand side of the expression
	 * @param type the type of the expression
	 */
	public ComparisonExpression(final IExpression lefthandSide,
			final IExpression righthandSide, final ComparisonType type) {
		super(lefthandSide, righthandSide);
		
		comparisonType = type;
	}

	/* (non-Javadoc)
	 * @see oberon.expressions.AbstractExpression#evalAsInt()
	 */
	@Override
	public int evalAsInt() throws UnsupportedException, VariableNotFoundInScopeException {
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
			result = booleanAsInt(leftHandSide.evalAsInt() == rightHandSide.evalAsInt());
			break;
		case Til:
			result = booleanAsInt(leftHandSide.evalAsInt() != rightHandSide.evalAsInt());
			break;
		default:
			throw new UnsupportedException("Unsupported comparison: "+ comparisonType.toString());
		}
		return result;
	}
}
