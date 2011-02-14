package oberon.convert;

import oberon.IExpression;
import oberon.expressions.AndOperator;
import oberon.expressions.ComparisonExpression;
import oberon.expressions.EqualsOperator;
import oberon.expressions.GreaterEqualsOperator;
import oberon.expressions.GreaterThanOperator;
import oberon.expressions.IComparisonOperator;
import oberon.expressions.NotEqualsOperator;
import oberon.expressions.SmallerEqualsOperator;
import oberon.expressions.SmallerThanOperator;
import oberon.node.AAmpExp;
import oberon.node.AExeqExp;
import oberon.node.AExgeExp;
import oberon.node.AExgtExp;
import oberon.node.AExseExp;
import oberon.node.AExstExp;
import oberon.node.ATilExp;

/**
 * The Class ComparisonExpressionConverter.
 */
public class ComparisonExpressionConverter extends AbstractConverter<IExpression> {
	
	/** The left. */
	private IExpression left;
	
	/** The right. */
	private IExpression right;
	
	/** The type. */
	private IComparisonOperator operatorImplementation;

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAExeqExp(oberon.node.AExeqExp)
	 */
	@Override
	public void caseAExeqExp(final AExeqExp node)
	{
		left = ExpConverterFactory.getExpression(node.getLeft());
		right = ExpConverterFactory.getExpression(node.getRight());
		operatorImplementation = new EqualsOperator();
	}

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAAmpExp(oberon.node.AAmpExp)
	 */
	@Override
	public void caseAAmpExp(final AAmpExp node)
	{
		left = ExpConverterFactory.getExpression(node.getLeft());
		right = ExpConverterFactory.getExpression(node.getRight());
		operatorImplementation = new AndOperator();
	}

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAExgeExp(oberon.node.AExgeExp)
	 */
	@Override
	public void caseAExgeExp(final AExgeExp node)
	{
		left = ExpConverterFactory.getExpression(node.getLeft());
		right = ExpConverterFactory.getExpression(node.getRight());
		operatorImplementation = new GreaterEqualsOperator();
	}

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAExgtExp(oberon.node.AExgtExp)
	 */
	@Override
	public void caseAExgtExp(final AExgtExp node)
	{
		left = ExpConverterFactory.getExpression(node.getLeft());
		right = ExpConverterFactory.getExpression(node.getRight());
		operatorImplementation = new GreaterThanOperator();
	}

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseATilExp(oberon.node.ATilExp)
	 */
	@Override
	public void caseATilExp(final ATilExp node)
	{
		left = ExpConverterFactory.getExpression(node.getLeft());
		right = ExpConverterFactory.getExpression(node.getRight());
		operatorImplementation = new NotEqualsOperator();
	}
	
	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAExstExp(oberon.node.AExstExp)
	 */
	@Override
	public void caseAExstExp(final AExstExp node)
	{
		left = ExpConverterFactory.getExpression(node.getLeft());
		right = ExpConverterFactory.getExpression(node.getRight());
		operatorImplementation = new SmallerThanOperator();
	}
	
	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAExseExp(oberon.node.AExseExp)
	 */
	@Override
	public void caseAExseExp(final AExseExp node)
	{
		left = ExpConverterFactory.getExpression(node.getLeft());
		right = ExpConverterFactory.getExpression(node.getRight());
		operatorImplementation = new SmallerEqualsOperator();
	}

	/* (non-Javadoc)
	 * @see oberon.interpret.AbstractBaseInterpreter#buildInterpreterResult()
	 */
	@Override
	public IExpression buildInterpreterResult() {
		return new ComparisonExpression(left, right, operatorImplementation);
	}

}
