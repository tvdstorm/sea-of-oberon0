package oberon.interpret;

import oberon.Expression;
import oberon.node.*;

public class ExpInterpreterFactory {
	
	private static <TNode extends PExp> BaseInterpreter<Expression> 
		getInterpreter(TNode node)// throws NoInterpreterDefinedException
	{	
		if (node instanceof AExgtExp)
			return new ExpExgtInterpreter();
		else if (node instanceof ASubExp)
			return new ExpSubInterpreter();
		else if (node instanceof AIdentselExp)
			return new ExpIdentselInterpreter();
		else if (node instanceof AIntegerExp)
			return new ExpIntegerInterpreter();
		else if (node instanceof ADivExp)
			return new DivExpInterpreter();
		else if (node instanceof AParenExp)
			return new ParenExpInterpreter();
		else if (node instanceof AAddExp)
			return new AddExpInterpreter();
		else if (node instanceof AAmpExp)
			return new AmpExpInterpreter();
		else if (node instanceof AExseExp)
			return new ExseExpInterpreter();
		else if (node instanceof AExgtExp)
			return new ExgtExpInterpreter();
		else if (node instanceof AExstExp)
			return new ExstExpInterpreter();
		else if (node instanceof AExeqExp)
			return new ExeqExpInterpreter();
		else if (node instanceof AExgeExp)
			return new ExgeExpInterpreter();
		
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
