package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.ast.visitor.OASTNodeVisitor;
import randy.oberon0.ast.datastructures.Tuple;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.*;

public class OIfStatement extends OStatement
{
	private List<Tuple<OExpression, OBlock>> ifStatements;
	private OBlock elseBody;
	
	public OIfStatement(List<Tuple<OExpression, OBlock>> _ifStatements, OBlock _elseBody)
	{
		assert(_ifStatements != null);
		ifStatements = _ifStatements;
		elseBody = _elseBody;
	}
	@Override
	public OValue run(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		assert(environment != null);
		// Loop through all if expressions until one is true
		for (Tuple<OExpression, OBlock> curIf : ifStatements)
		{
			// Run the expression and convert it to an boolean
			OBoolean bExpression = curIf.getFirst().run(environment).castToBoolean();
			// If the expression is true, run the body
			if (bExpression.getBoolValue())
			{
				curIf.getSecond().run(environment);
				return null;
			}
		}
		// If there is an else body, run it
		if (elseBody != null)
			elseBody.run(environment);
		return null;
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		for (Tuple<OExpression, OBlock> curIf : ifStatements)
		{
			curIf.getFirst().accept(visitor);
			curIf.getSecond().accept(visitor);
		}
		if (elseBody != null)
			elseBody.accept(visitor);
		visitor.visitAfter(this);
	}
}
