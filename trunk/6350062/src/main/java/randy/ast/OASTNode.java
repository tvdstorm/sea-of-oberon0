package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.generated.Oberon0Parser;
import randy.interpreter.Oberon0VariableStack;
import randy.value.OValue;

public abstract class OASTNode
{
	public static OASTNode buildASTTree(Tree tree) throws Oberon0Exception
	{
		switch (tree.getType())
		{
			case Oberon0Parser.MODULE:
				return OModule.buildModule(tree);
			default:
				throw new Oberon0ASTTreeBuildException(tree);
		}
	}
	public abstract void print(String indent);
	public abstract OValue run(Oberon0VariableStack vars) throws Oberon0Exception;
}
