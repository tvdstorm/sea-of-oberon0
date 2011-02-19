package nl.bve.uva.oberon.ast.declarations;

import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonConstant;
import nl.bve.uva.oberon.env.types.OberonInt;
import nl.bve.uva.oberon.env.types.OberonValue;

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
		OberonConstant c = new OberonConstant((OberonInt)value);
		
		env.addConstant(ident, c);
	}
}
