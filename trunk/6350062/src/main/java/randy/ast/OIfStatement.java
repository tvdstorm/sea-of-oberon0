package randy.ast;

import java.util.*;
import randy.exception.*;
import randy.interpreter.Oberon0VariableStack;
import randy.value.*;

public class OIfStatement extends OStatement
{
	private OExpression expression;
	private OBlock body;
	private List<Tuple<OExpression, OBlock>> elseifs;
	private OBlock elseBody;
	
	public OIfStatement(OExpression _expression, OBlock _body, List<Tuple<OExpression, OBlock>> _elseifs, OBlock _elseBody)
	{
		assert(_expression != null);
		assert(_body != null);
		assert(_elseifs != null);
		expression = _expression;
		body = _body;
		elseifs = _elseifs;
		elseBody = _elseBody;
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		assert(vars != null);
		// Evaluate the main expression and convert it to an boolean
		OBoolean bExpression = expression.run(vars).castToBoolean();
		// If the main expression is true, run the body
		if (bExpression.getBoolValue())
		{
			body.run(vars);
			return null;
		}
		// Loop through all elseif expression until one is true
		for (Tuple<OExpression, OBlock> curElseif : elseifs)
		{
			// Run the expression and convert it to an boolean
			bExpression = curElseif.getFirst().run(vars).castToBoolean();
			// If the expression is true, run the body
			if (bExpression.getBoolValue())
			{
				curElseif.getSecond().run(vars);
				return null;
			}
		}
		// If there is an else body, run it
		if (elseBody != null)
			elseBody.run(vars);
		return null;
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		expression.accept(visitor);
		body.accept(visitor);
		for (Tuple<OExpression, OBlock> curElseif : elseifs)
		{
			curElseif.getFirst().accept(visitor);
			curElseif.getSecond().accept(visitor);
		}
		if (elseBody != null)
			elseBody.accept(visitor);
		visitor.visitAfter(this);
	}
}
