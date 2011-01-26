package randy.interpreter;

import java.util.*;
import randy.ast.*;
import randy.exception.Oberon0Exception;
import randy.exception.Oberon0UndefinedMethodException;

public class FunctionTreeBuilder extends OASTNodeNullVisitor
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
	public void visitBefore(OProcedureDeclaration procedureDeclaration) throws Oberon0Exception
	{
		Oberon0FunctionTree branch = new Oberon0FunctionTree(procedureDeclaration);
		stack.peek().addBranch(procedureDeclaration.getName(), branch);
		stack.add(branch);
	}
	@SuppressWarnings("unchecked")
	@Override
	public void visit(OProcedureCall procedureCall) throws Oberon0Exception
	{
		procedureCalls.put(procedureCall, (Stack<Oberon0FunctionTree>)stack.clone());
	}
	@Override
	public void visitAfter(OProcedureDeclaration procedureDeclaration) throws Oberon0Exception
	{
		stack.pop();
	}
}
