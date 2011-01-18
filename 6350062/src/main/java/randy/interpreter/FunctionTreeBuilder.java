package randy.interpreter;

import java.util.*;
import randy.ast.*;
import randy.exception.Oberon0Exception;
import randy.exception.Oberon0UndefinedMethodException;

public class FunctionTreeBuilder implements OASTNodeVisitor
{
	private Oberon0FunctionTree tree;
	private Stack<Oberon0FunctionTree> stack;
	private Map<OProcedureCall, Stack<Oberon0FunctionTree>> procedureCalls; // The procedureCalls and their location relative to procedure declarations
	
	public FunctionTreeBuilder()
	{
		tree = new Oberon0FunctionTree(null);
		stack = new Stack<Oberon0FunctionTree>();
		stack.add(tree);
		procedureCalls = new HashMap<OProcedureCall, Stack<Oberon0FunctionTree>>();
	}
	public void register(OInvokableFunction function) throws Oberon0Exception
	{
		Oberon0FunctionTree branch = new Oberon0FunctionTree(function);
		stack.peek().addBranch(function.getName(), branch); 
	}
	public void resolveAllFunctionCalls() throws Oberon0Exception
	{
		for (OProcedureCall call : procedureCalls.keySet())
		{
			String name = call.getName();
			boolean bFoundFunction = false;
			for (Oberon0FunctionTree t : procedureCalls.get(call))
			{
				Oberon0FunctionTree ret = t.getFunction(name);
				if (ret != null)
				{
					call.setFunctionDeclaration(ret.getDeclaration());
					bFoundFunction = true;
					break;
				}
			}
			if (!bFoundFunction)
				throw new Oberon0UndefinedMethodException(name);
		}
	}
	@Override
	public void visitBefore(OASTNode astNode) throws Oberon0Exception
	{
		if (astNode instanceof OProcedureDeclaration)
		{
			OProcedureDeclaration pd = (OProcedureDeclaration)astNode;
			Oberon0FunctionTree branch = new Oberon0FunctionTree(pd);
			stack.peek().addBranch(pd.getName(), branch);
			stack.add(branch);
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public void visit(OASTNode astNode) throws Oberon0Exception
	{
		if (astNode instanceof OProcedureCall)
		{
			procedureCalls.put((OProcedureCall)astNode, (Stack<Oberon0FunctionTree>)stack.clone());
		}
	}
	@Override
	public void visitAfter(OASTNode astNode) throws Oberon0Exception
	{
		if (astNode instanceof OProcedureDeclaration)
		{
			stack.pop();
		}
	}
}
