package AbstractSyntax.Statements;

import org.antlr.runtime.tree.CommonTree;

/**
 * @author Chiel Labee
 * This class represents a Statement Node.
 * This class is abstract.
*/
public abstract class BaseStatement extends AbstractSyntax.BaseNode 
{
	protected BaseStatement(CommonTree parserTree) 
	{
		super(parserTree);
	}
}
