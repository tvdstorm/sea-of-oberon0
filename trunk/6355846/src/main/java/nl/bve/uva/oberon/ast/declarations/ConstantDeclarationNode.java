package nl.bve.uva.oberon.ast.declarations;

import nl.bve.uva.oberon.ast.expressions.IExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.ConstantValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class ConstantDeclarationNode implements IDeclarationNode {
	private String ident;
	private IExpressionNode expression;
	
	public ConstantDeclarationNode(String ident, IExpressionNode expression) {
		this.ident = ident;
		this.expression = expression;
	}
	
	@Override
	public void declare(Environment env) {
		OberonValue value = expression.eval(env);
		ConstantValue c = new ConstantValue(value.getValue());
		
		env.addConstant(ident, c);
	}
}
