package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;

public class ProcedureBodyNode implements IInterpretableNode {
	private IInterpretableNode declarations;
	private IInterpretableNode body;
	
	public ProcedureBodyNode(IInterpretableNode declarations, IInterpretableNode body) {
		this.declarations = declarations;
		this.body = body;
	}
	
	@Override
	public Object interpret(Environment env) {
		declarations.interpret(env);
		body.interpret(env);
		
		return null;
	}
}
