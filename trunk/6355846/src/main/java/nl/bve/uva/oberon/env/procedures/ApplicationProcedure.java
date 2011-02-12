package nl.bve.uva.oberon.env.procedures;

import java.util.List;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.ast.TypedParameterList;
import nl.bve.uva.oberon.env.Environment;

public class ApplicationProcedure extends Procedure {
	private String name;
	private List<TypedParameterList> formalParametersList;
	private IInterpretableNode body;	
	
	public ApplicationProcedure(String name, List<TypedParameterList> fpList, IInterpretableNode body) {
		this.name = name;
		this.formalParametersList = fpList;
		this.body = body;
	}
	
	@Override
	public List<TypedParameterList> getFormalParameters() {
		return formalParametersList;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void execute(Environment env) {
		body.interpret(env);
	}
}