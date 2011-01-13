package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.generated.Oberon0Parser;

public abstract class OStatement extends OASTNode
{
	public static OStatement buildStatement(Tree tree) throws Oberon0Exception
	{
		switch (tree.getType())
		{
			case Oberon0Parser.EXPRESSION:
				return OExpressionStatement.buildExpressionStatement(tree);
			case Oberon0Parser.ASSIGNMENT:
				return OAssignmentStatement.buildAssignmentStatement(tree);
			case Oberon0Parser.WHILE:
				return OWhileStatement.buildWhileStatement(tree);
			case Oberon0Parser.IF:
				return OIfStatement.buildIfStatement(tree);
			default:
				throw new Oberon0ASTTreeBuildException("Encountered unknown parser tree type '" + tree.getType() + "' on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + ".");
		}
	}
}
