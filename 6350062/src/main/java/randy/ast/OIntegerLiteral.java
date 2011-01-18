package randy.ast;

import randy.value.*;

import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.interpreter.Oberon0VariableStack;

public class OIntegerLiteral extends OExpression
{
	private OInteger value;
	
	public OIntegerLiteral(OInteger _value)
	{
		value = _value;
	}
	public static OIntegerLiteral buildIntegerLiteral(Tree tree) throws Oberon0Exception
	{
		// TODO: parseException opvangen
		return new OIntegerLiteral(new OInteger(Integer.parseInt(tree.getText())));
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		return value;
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		visitor.visitAfter(this);
	}
}
