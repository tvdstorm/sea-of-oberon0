package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.grammar.Oberon0Parser;
import randy.interpreter.Oberon0VariableStack;
import randy.value.OValue;

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
	public abstract OValue run(Oberon0VariableStack vars) throws Oberon0Exception;
}
