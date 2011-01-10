package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.grammar.Oberon0Parser;

public abstract class OStatement extends OASTNode
{
	public static OStatement buildStatement(Tree tree) throws Oberon0Exception
	{
		switch (tree.getType())
		{
			case Oberon0Parser.EXPRESSION:
				return OExpressionStatement.buildExpressionStatement(tree);
			default:
				throw new Oberon0Exception("Unknown statement type '" + tree.getType() + "'");
		}
	}
}
