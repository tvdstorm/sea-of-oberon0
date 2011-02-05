package oberon.interpret;

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
 * A factory for creating ExpInterpreter objects.
 */
final class ExpInterpreterFactory {
	
	//private constructor to prevent this type from being instantiated
	/**
	 * Instantiates a new exp interpreter factory.
	 */
	private ExpInterpreterFactory(){
	}
	
	/**
	 * Gets the interpreter.
	 *
	 * @param <TNode> the generic type
	 * @param node the node
	 * @return the interpreter
	 */
	private static <TNode extends PExp> AbstractBaseInterpreter<IExpression> 
		getInterpreter(final TNode node)// throws NoInterpreterDefinedException
	{	
		AbstractBaseInterpreter<IExpression> returnExp = null;
		
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
	private static AbstractBaseInterpreter<IExpression> tryGetComparisonExpression(
			final PExp node) {
		AbstractBaseInterpreter<IExpression> returnExp = null;
		if (	node instanceof AExgtExp ||
				node instanceof AExseExp ||
				node instanceof AExgtExp ||
				node instanceof AExstExp ||
				node instanceof AExeqExp ||
				node instanceof AExgeExp ||
				node instanceof AExhaExp ||
				node instanceof AAmpExp  ||
				node instanceof ATilExp) {
			returnExp = new ComparisonExpressionInterpreter();
		}
		return returnExp;
	}
	
	/**
	 * Try get mathematical expression.
	 *
	 * @param node the node
	 * @return the abstract base interpreter
	 */
	private static AbstractBaseInterpreter<IExpression> tryGetMathematicalExpression(
			final PExp node) {
		AbstractBaseInterpreter<IExpression> returnExp = null;
		if(	node instanceof ASubExp ||
			node instanceof ADivExp ||
			node instanceof AAddExp ||
			node instanceof AMulExp ||
			node instanceof AModExp ||
			node instanceof AAddExp) {
			returnExp = new MathematicalExpressionInterpreter();
		}
		return returnExp;
	}
	
	/**
	 * Try get other expression.
	 *
	 * @param node the node
	 * @return the abstract base interpreter
	 */
	private static AbstractBaseInterpreter<IExpression> tryGetOtherExpression(
			final PExp node) {
		AbstractBaseInterpreter<IExpression> returnExp = null;
		if(	node instanceof AParenExp) {
			returnExp = new ParenExpInterpreter();
		}
		else if (node instanceof ASelectorExp) {
			returnExp = new SelectorExpInterpreter();
		}
		else if (node instanceof AIntegerExp) {
			returnExp = new ExpIntegerInterpreter();
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
		final AbstractBaseInterpreter<IExpression> interpreter = ExpInterpreterFactory.getInterpreter(node);
		node.apply(interpreter);
		return interpreter.buildInterpreterResult();
	}
}
