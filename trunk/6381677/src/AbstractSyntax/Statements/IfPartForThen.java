package AbstractSyntax.Statements;

import org.antlr.runtime.tree.CommonTree;

/**
 * @author Chiel Labee
 * This class represents the Then part of an If-Then-ElsIf-Else Statement.
*/
public class IfPartForThen extends BaseStatementList
{
	public IfPartForThen(CommonTree parserTree)
	{
		super(parserTree);
	}

}
