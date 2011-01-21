package randy.ast;

import java.util.*;
import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.generated.Oberon0Parser;
import randy.interpreter.Oberon0VariableStack;
import randy.value.*;

public class OIfStatement extends OStatement
{
	private OExpression expression;
	private OBlock body;
	private List<OExpression> elseifExpressions; // TODO: elseif expressions en bodys bundelen
	private List<OBlock> elseifBodys;
	private OBlock elseBody;
	
	public OIfStatement(OExpression _expression, OBlock _body, List<OExpression> _elseifExpressions, List<OBlock> _elseifBodys, OBlock _elseBody)
	{
		assert(_expression != null);
		assert(_body != null);
		assert(_elseifExpressions != null);
		assert(_elseifBodys != null);
		expression = _expression;
		body = _body;
		elseifExpressions = _elseifExpressions;
		elseifBodys = _elseifBodys;
		elseBody = _elseBody;
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		assert(vars != null);
		// Evaluate the main expression and convert it to an boolean
		OValue expr = expression.run(vars);
		if (!expr.getType().isBool())
			throw new Oberon0TypeMismatchException(expr.getType(), Type.BOOL);
		OBoolean b = (OBoolean)expr;
		// If the main expression is true, run the body
		if (b.getBoolValue())
		{
			body.run(vars);
			return null;
		}
		// Loop through all elseif expression until one is true
		for (int i=0;i<elseifExpressions.size();i++)
		{
			// Run the expression and convert it to an boolean
			expr = elseifExpressions.get(i).run(vars);
			if (!expr.getType().isBool())
				throw new Oberon0TypeMismatchException(expr.getType(), Type.BOOL);
			b = (OBoolean)expr;
			// If the expression is true, run the body
			if (b.getBoolValue())
			{
				elseifBodys.get(i).run(vars);
				return null;
			}
		}
		// If there is an else body, run it
		if (elseBody != null)
			elseBody.run(vars);
		return null;
	}
	public static OIfStatement buildIfStatement(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.IF);
		assert(tree.getChildCount() >= 2);
		assert(tree.getChild(1).getType() == Oberon0Parser.BODY); 
		OExpression expression = OExpression.buildExpression(tree.getChild(0).getChild(0));
		OBlock body = OBlock.buildBlock(tree.getChild(1));
		List<OExpression> elseifExpressions = new Vector<OExpression>();
		List<OBlock> elseifBodys = new Vector<OBlock>();
		OBlock elseBody = null;
		for (int i=2;i<tree.getChildCount();i++)
		{
			Tree child = tree.getChild(i);
			switch (child.getType())
			{
				case Oberon0Parser.ELSIF:
					elseifExpressions.add(OExpression.buildExpression(child.getChild(0).getChild(0)));
					elseifBodys.add(OBlock.buildBlock(child.getChild(1)));
					break;
				case Oberon0Parser.ELSE:
					elseBody = OBlock.buildBlock(child.getChild(0));
					break;
				default:
					throw new Oberon0ASTTreeBuildException("Encountered unknown parser tree type '" + tree.getType() + "' on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + ".");
			}
		}
		return new OIfStatement(expression, body, elseifExpressions, elseifBodys, elseBody);
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		expression.accept(visitor);
		body.accept(visitor);
		for (OExpression expr : elseifExpressions)
		{
			expr.accept(visitor);
		}
		for (OBlock bl : elseifBodys)
		{
			bl.accept(visitor);
		}
		if (elseBody != null)
			elseBody.accept(visitor);
		visitor.visitAfter(this);
	}
}
