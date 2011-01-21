package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.generated.Oberon0Parser;
import randy.interpreter.Oberon0VariableStack;
import randy.value.OValue;

public class OVariable extends OExpression
{
	private String name;
	
	public OVariable(String _name)
	{
		assert(_name != null);
		assert(_name.length() >= 1);
		name = _name;
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		assert(vars != null);
		// Resolve the variable with the variable stack
		return vars.getVariable(name);
	}
	public static OVariable buildVariable(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.IDENT);
		String name = tree.getText();
		return new OVariable(name);
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		visitor.visitAfter(this);
	}
}
