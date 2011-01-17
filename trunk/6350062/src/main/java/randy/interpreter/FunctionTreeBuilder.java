package randy.interpreter;

import java.util.*;
import randy.ast.*;

public class FunctionTreeBuilder implements OASTNodeVisitor
{
	private Oberon0FunctionTree tree;
	private Stack<Oberon0FunctionTree> stack;
	
	public FunctionTreeBuilder()
	{
		tree = new Oberon0FunctionTree(null);
		stack = new Stack<Oberon0FunctionTree>();
		stack.add(tree);
	}
	
	@Override
	public void visitBefore(OASTNode astNode)
	{
		if (astNode instanceof OProcedureDeclaration)
		{
			OProcedureDeclaration pd = (OProcedureDeclaration)astNode;
			Oberon0FunctionTree branch = new Oberon0FunctionTree(pd);
			stack.peek().addBranch(pd.name, branch);
			stack.add(branch);
			System.out.println("IN " + pd.name);
		}
	}
	@Override
	public void visit(OASTNode astNode)
	{
		// TODO Auto-generated method stub
	}
	@Override
	public void visitAfter(OASTNode astNode)
	{
		if (astNode instanceof OProcedureDeclaration)
		{
			OProcedureDeclaration pd = (OProcedureDeclaration)astNode;
			stack.pop();
			System.out.println("OUT " + pd.name);
		}
	}
	public void print()
	{
		tree.print("");
	}
}
