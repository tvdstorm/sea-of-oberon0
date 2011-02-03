package oberon.interpret;

import oberon.AbstractExpression;
import oberon.node.*;

final class ExpInterpreterFactory {
	
	//private constructor to prevent this type from being instantiated
	private ExpInterpreterFactory(){
	}
	
	private static <TNode extends PExp> AbstractBaseInterpreter<AbstractExpression> 
		getInterpreter(final TNode node)// throws NoInterpreterDefinedException
	{	
		AbstractBaseInterpreter<AbstractExpression> returnExp = null;
		
		returnExp = tryGetComparisonExpression(node);
		if (returnExp == null) {
			returnExp = tryGetMathematicalExpression(node);
		}
		if (returnExp == null) {
			returnExp = tryGetOtherExpression(node);
		}
		
		return returnExp;
	}
	
	private static AbstractBaseInterpreter<AbstractExpression> tryGetComparisonExpression(
			final PExp node) {
		AbstractBaseInterpreter<AbstractExpression> returnExp = null;
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
	
	private static AbstractBaseInterpreter<AbstractExpression> tryGetMathematicalExpression(
			final PExp node) {
		AbstractBaseInterpreter<AbstractExpression> returnExp = null;
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
	
	private static AbstractBaseInterpreter<AbstractExpression> tryGetOtherExpression(
			final PExp node) {
		AbstractBaseInterpreter<AbstractExpression> returnExp = null;
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

	public static <TNode extends PExp> AbstractExpression getExpression(final TNode node)
	{
		final AbstractBaseInterpreter<AbstractExpression> interpreter = ExpInterpreterFactory.getInterpreter(node);
		node.apply(interpreter);
		return interpreter.buildInterpreterResult();
	}
}
