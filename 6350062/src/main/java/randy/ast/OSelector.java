package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.generated.Oberon0Parser;

public abstract class OSelector extends OExpression
{
	public static OSelector buildSelector(Tree tree) throws Oberon0Exception
	{
		switch (tree.getType())
		{
			case Oberon0Parser.ARRAYSELECTOR:
				return OArraySelector.buildArraySelector(tree);
			case Oberon0Parser.IDENT:
				return OVariableSelector.buildVariableSelector(tree);
			default:
					throw new Oberon0ASTTreeBuildException("Encountered unknown parser tree type '" + tree.getType() + "' on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + ".");
		}
	}
}
