package AbstractSyntax.Statements;

import org.antlr.runtime.tree.CommonTree;

/**
 * @author Chiel Labee
 * This class represents the Else part of an If-Then-ElsIf-Else Statement.
*/
public class IfPartForElse extends BaseStatementList
{
	public IfPartForElse(CommonTree parserTree)
	{
		super(parserTree);
	}
}
