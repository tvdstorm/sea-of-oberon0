package oberon.expressions;

import oberon.IExpression;
import oberon.Scope;

/**
 * The Class ComparisonExpression, compares to expressions.
 */
public class ComparisonExpression extends AbstractLeftAndRightExpression {
	
	private final IComparisonOperator evaluator;

	/**
	 * Instantiates a new comparison expression.
	 *
	 * @param lefthandSide the lefthand side of the expression
	 * @param righthandSide the righthand side of the expression
	 * @param type the type of the expression
	 */
	public ComparisonExpression(final IExpression lefthandSide,
			final IExpression righthandSide, final IComparisonOperator expEvaluator) {
		super(lefthandSide, righthandSide);
		
		evaluator = expEvaluator;
	}

	/* (non-Javadoc)
	 * @see oberon.expressions.AbstractExpression#evalAsInt()
	 */
	@Override
	public int evalAsInt(Scope currentScope) {
		final IExpression leftHandSide = getLefthandSide();
		final IExpression rightHandSide = getRighthandSide();
		
		return booleanAsInt(evaluator.eval(leftHandSide.evalAsInt(currentScope), rightHandSide.evalAsInt(currentScope)));
	}

	/* (non-Javadoc)
	 * @see oberon.expressions.AbstractExpression#getText()
	 */
	@Override
	public String getText() {
		return getLefthandSide().getText() + " " + evaluator.getOperatorSign() + " " + getRighthandSide().getText();
	}
}
