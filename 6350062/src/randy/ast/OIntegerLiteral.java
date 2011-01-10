package randy.ast;

import randy.value.*;

import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.interpreter.Oberon0VariableStack;

public class OIntegerLiteral extends OExpression
{
	private OInteger value;
	
	public OIntegerLiteral(OInteger _value)
	{
		value = _value;
	}
	public OValue getValue()
	{
		return value;
	}
	public static OIntegerLiteral buildIntegerLiteral(Tree tree) throws Oberon0Exception
	{
		// TODO: parseException opvangen
		return new OIntegerLiteral(new OInteger(Integer.parseInt(tree.getText())));
	}
	@Override // TODO: nodig?
	public OValue run(Oberon0VariableStack vars) throws Oberon0Exception
	{
		return value;
	}
	public void print(String indent)
	{
		System.out.println(indent + value);
	}
}
