package nl.bve.uva.oberon.ast;

import java.util.List;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.procedures.ApplicationProcedure;
import nl.bve.uva.oberon.shared.TypedParameterList;

public class ProcedureDeclarationNode implements IInterpretableNode {
	private String ident;
	private List<TypedParameterList> formalParameters;
	private IInterpretableNode body;
	
	public ProcedureDeclarationNode(String name1, String name2, List<TypedParameterList> fp, IInterpretableNode body) {
		if (! name1.equals(name2)) {
			throw new RuntimeException("Procedure START-identifier and END-identifier aren't equals: " +name1+ " <> " +name2);
		}
		
		this.ident = name1;
		this.formalParameters = fp;
		this.body = body;
	}
	
	@Override
	public Object interpret(Environment env) {
		env.addProcedure(ident, new ApplicationProcedure(ident, formalParameters, body));
		return null;
	}
}
