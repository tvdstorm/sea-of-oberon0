package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonConstant;
import nl.bve.uva.oberon.env.types.OberonInt;

public class ConstantDeclarationNode implements IInterpretableNode {
	private String ident;
	private IInterpretableNode expression;
	
	public ConstantDeclarationNode(String ident, IInterpretableNode expression) {
		this.ident = ident;
		this.expression = expression;
	}
	
	@Override
	public Object interpret(Environment env) {
		Object value = expression.interpret(env);
		OberonConstant c = new OberonConstant((OberonInt)value);
		
		env.addConstant(ident, c);
		return null;
	}
}
