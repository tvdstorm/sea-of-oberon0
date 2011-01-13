package randy.exception;

import org.antlr.runtime.tree.Tree;

public class Oberon0ASTTreeBuildException extends Oberon0Exception
{
	private static final long serialVersionUID = 3280548191683189365L;

	public Oberon0ASTTreeBuildException(Tree tree)
	{
		super("Encountered unknown parser tree type '" + tree.getType() + "' on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + ".");
	}
}
