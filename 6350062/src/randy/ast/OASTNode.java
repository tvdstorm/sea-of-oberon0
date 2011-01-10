package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.grammar.Oberon0Parser;

public abstract class OASTNode
{
	// getParent?
	public static OASTNode buildASTTree(Tree tree) throws Oberon0Exception
	{
		switch (tree.getType())
		{
			case Oberon0Parser.MODULE:
				return OModule.buildModule(tree);
			default:
				throw new Oberon0Exception("Unknown parser tree type '" + tree.getType() + "'.");
		}
	}
	public abstract void print(String indent);
}
