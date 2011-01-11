package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.generated.Oberon0Parser;

public abstract class OSelector extends OExpression
{
	public static OSelector buildSelector(Tree tree) throws Oberon0Exception
	{
		switch (tree.getType())
		{
			case Oberon0Parser.ARRAYSELECTOR:
				return OArraySelector.buildArraySelector(tree);
			default:
					throw new Oberon0Exception("Unknown selector type '" + tree.getType() + "'...");
		}
	}
}
