package oberon.convert;

import oberon.IExpression;
import oberon.node.AAddExp;
import oberon.node.AAmpExp;
import oberon.node.ADivExp;
import oberon.node.AExeqExp;
import oberon.node.AExgeExp;
import oberon.node.AExgtExp;
import oberon.node.AExhaExp;
import oberon.node.AExseExp;
import oberon.node.AExstExp;
import oberon.node.AIntegerExp;
import oberon.node.AModExp;
import oberon.node.AMulExp;
import oberon.node.AParenExp;
import oberon.node.ASelectorExp;
import oberon.node.ASubExp;
import oberon.node.ATilExp;
import oberon.node.PExp;

/**
 * A factory for creating ExpConvertor objects.
 */
final class ExpConverterFactory {
	
	//private constructor to prevent this type from being instantiated
	/**
	 * Instantiates a new exp interpreter factory.
	 */
	private ExpConverterFactory(){
	}
	
	/**
	 * Gets the interpreter.
	 *
	 * @param <TNode> the generic type
	 * @param node the node
	 * @return the interpreter
	 */
	private static <TNode extends PExp> AbstractConverter<IExpression> 
		getInterpreter(final TNode node)// throws NoInterpreterDefinedException
	{	
		AbstractConverter<IExpression> returnExp = null;
		
		returnExp = tryGetComparisonExpression(node);
		if (returnExp == null) {
			returnExp = tryGetMathematicalExpression(node);
		}
		if (returnExp == null) {
			returnExp = tryGetOtherExpression(node);
		}
		
		return returnExp;
	}
	
	/**
	 * Try get comparison expression.
	 *
	 * @param node the node
	 * @return the abstract base interpreter
	 */
	private static AbstractConverter<IExpression> tryGetComparisonExpression(
			final PExp node) {
		AbstractConverter<IExpression> returnExp = null;
		if (	node instanceof AExgtExp ||
				node instanceof AExseExp ||
				node instanceof AExgtExp ||
				node instanceof AExstExp ||
				node instanceof AExeqExp ||
				node instanceof AExgeExp ||
				node instanceof AExhaExp ||
				node instanceof AAmpExp  ||
				node instanceof ATilExp) {
			returnExp = new ComparisonExpressionConverter();
		}
		return returnExp;
	}
	
	/**
	 * Try get mathematical expression.
	 *
	 * @param node the node
	 * @return the abstract base interpreter
	 */
	private static AbstractConverter<IExpression> tryGetMathematicalExpression(
			final PExp node) {
		AbstractConverter<IExpression> returnExp = null;
		if(	node instanceof ASubExp ||
			node instanceof ADivExp ||
			node instanceof AAddExp ||
			node instanceof AMulExp ||
			node instanceof AModExp ||
			node instanceof AAddExp) {
			returnExp = new MathematicalExpressionConverter();
		}
		return returnExp;
	}
	
	/**
	 * Try get other expression.
	 *
	 * @param node the node
	 * @return the abstract base interpreter
	 */
	private static AbstractConverter<IExpression> tryGetOtherExpression(
			final PExp node) {
		AbstractConverter<IExpression> returnExp = null;
		if(	node instanceof AParenExp) {
			returnExp = new ParenExpConverter();
		}
		else if (node instanceof ASelectorExp) {
			returnExp = new SelectorExpConverter();
		}
		else if (node instanceof AIntegerExp) {
			returnExp = new ExpIntegerConverter();
		}
		return returnExp;
	}

	/**
	 * Gets the expression.
	 *
	 * @param <TNode> the generic type
	 * @param node the node
	 * @return the expression
	 */
	public static <TNode extends PExp> IExpression getExpression(final TNode node)
	{
		final AbstractConverter<IExpression> interpreter = ExpConverterFactory.getInterpreter(node);
		node.apply(interpreter);
		return interpreter.buildInterpreterResult();
	}
}
