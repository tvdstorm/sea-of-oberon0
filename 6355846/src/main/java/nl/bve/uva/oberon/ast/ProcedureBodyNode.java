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
		
		System.out.println("ENVIRONMENT in UserProcedure: \n" +env.toString()+ "\nEND OF ENVIRONMENT");
		
		body.interpret(env);
		
		System.out.println("ENVIRONMENT in UserProcedure: \n" +env.toString()+ "\nEND OF ENVIRONMENT");
		
		return null;
	}
}
