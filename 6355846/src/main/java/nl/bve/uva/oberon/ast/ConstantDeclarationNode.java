package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.Constant;
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
		Constant c = new Constant((OberonInt)value);
		
		env.addConstant(ident, c);
		return null;
	}
}
