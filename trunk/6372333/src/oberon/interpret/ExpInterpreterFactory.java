package oberon.interpret;

import oberon.Expression;
import oberon.node.*;

public class ExpInterpreterFactory {
	
	private static <TNode extends PExp> BaseInterpreter<Expression> 
		getInterpreter(TNode node)// throws NoInterpreterDefinedException
	{	
		if (	node instanceof AExgtExp ||
				node instanceof AExseExp ||
				node instanceof AExgtExp ||
				node instanceof AExstExp ||
				node instanceof AExeqExp ||
				node instanceof AExgeExp ||
				node instanceof AExhaExp ||
				node instanceof AAmpExp  ||
				node instanceof ATilExp)
			return new ComparisonExpressionInterpreter();
		
		else if(node instanceof ASubExp ||
				node instanceof ADivExp ||
				node instanceof AAddExp ||
				node instanceof AMulExp ||
				node instanceof AModExp ||
				node instanceof AAddExp)
			return new MathematicalExpressionInterpreter();
		
		else if (node instanceof AParenExp)
			return new ParenExpInterpreter();
		else if (node instanceof ASelectorExp)
			return new SelectorExpInterpreter();
		else if (node instanceof AIntegerExp)
			return new ExpIntegerInterpreter();
		
		System.out.println("No interpreter for type: " + node.getClass());
		return null;
	}
	
	public static <TNode extends PExp> Expression getExpression(TNode node)
	{
		BaseInterpreter<Expression> interpreter = ExpInterpreterFactory.getInterpreter(node);
		node.apply(interpreter);
		return interpreter.BuildInterpreterResult();
	}
}
