package nl.bve.uva.oberon.ast.declarations;

import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.ConstantValue;
import nl.bve.uva.oberon.env.values.IntValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class ConstantDeclarationNode extends DeclarationNode {
	private String ident;
	private ExpressionNode expression;
	
	public ConstantDeclarationNode(String ident, ExpressionNode expression) {
		this.ident = ident;
		this.expression = expression;
	}
	
	@Override
	public void declare(Environment env) {
		OberonValue value = expression.eval(env);
		ConstantValue c = new ConstantValue((IntValue)value);
		
		env.addConstant(ident, c);
	}
}
