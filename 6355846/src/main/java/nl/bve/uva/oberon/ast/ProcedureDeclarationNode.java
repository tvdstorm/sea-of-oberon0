package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.UserProcedure;

public class ProcedureDeclarationNode implements IInterpretableNode {
	private String ident;
	private IInterpretableNode heading;
	private IInterpretableNode body;
	
	public ProcedureDeclarationNode(String name1, String name2, IInterpretableNode heading, IInterpretableNode body) {
		if (! name1.equals(name2)) {
			throw new RuntimeException("Procedure START-identifier and END-identifier aren't equals: " +name1+ "<>" +name2);
		}
		
		this.ident = name1;
		this.heading = heading;
		this.body = body;
	}
	
	@Override
	public Object interpret(Environment env) {
		assert heading instanceof ProcedureHeadingNode : "Procedure heading is not valid, found: " +heading;
		
		env.addProcedure(ident, new UserProcedure(heading, body));
		
		return null;
	}
}
