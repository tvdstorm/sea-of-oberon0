package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.generated.Oberon0Parser;
import randy.interpreter.Oberon0VariableStack;
import randy.value.OValue;

public class OConstDeclaration extends OBodyDeclaration
{
	private String name;
	private OExpression value;
	
	public OConstDeclaration(String _name, OExpression _value)
	{
		assert(_name != null);
		assert(_name.length() >= 1);
		assert(_value != null);
		name = _name;
		value = _value;
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		assert(vars != null);
		// Add the constant to the variable scope
		vars.addConstant(name, value.run(vars));
		return null;
	}
	public static OConstDeclaration buildConstDeclaration(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.CONST);
		assert(tree.getChildCount() == 2);
		assert(tree.getChild(0).getType() == Oberon0Parser.IDENT);
		String name = tree.getChild(0).getText();
		OExpression value = OExpression.buildExpression(tree.getChild(1));
		return new OConstDeclaration(name, value);
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		value.accept(visitor);
		visitor.visitAfter(this);
	}
}
