package randy.ast;

import java.util.*;
import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;

public class OBlock extends OASTNode
{
	private List<OStatement> statements;
	
	public OBlock(List<OStatement> _statements)
	{
		statements = _statements;
	}
	public static OBlock buildBlock(Tree tree) throws Oberon0Exception
	{
		List<OStatement> statements = new Vector<OStatement>();
		for (int i=0;i<tree.getChildCount();i++)
		{
			Tree child = tree.getChild(i);
			statements.add(OStatement.buildStatement(child));
		}
		return new OBlock(statements);
	}
	public void print(String indent)
	{
		System.out.println(indent + "BLOCK"); 
		for (OStatement st : statements)
		{
			st.print(indent + "\t");
		}
	}
}
