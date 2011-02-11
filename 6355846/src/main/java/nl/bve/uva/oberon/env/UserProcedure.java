package nl.bve.uva.oberon.env;

import java.util.List;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.types.Type;

public class UserProcedure implements Procedure {
	private IInterpretableNode heading;
	private IInterpretableNode body;
	private List<IInterpretableNode> actualParameters;
	
	public UserProcedure(IInterpretableNode heading, IInterpretableNode body) {
		this.heading = heading;
		this.body = body;
	}
	
	@Override
	public Object interpret(Environment env) {
		System.out.println("executing procedure...");
		List<IInterpretableNode> actualParameters = this.actualParameters;
		Environment subEnv = env.getNewSubSpace();
		
		if (actualParameters != null) {
			int paramCount = 1;
			for (IInterpretableNode parameter : actualParameters) {
				Type t = (Type)parameter.interpret(subEnv);
				
				subEnv.addVariable("ACTUAL_VAR_" +paramCount, t);
				
				paramCount++;
			}
		}
		
		System.out.println("ENVIRONMENT in UserProcedure: \n" +env.toString()+ "\nEND OF ENVIRONMENT");
		
		heading.interpret(subEnv);
		body.interpret(subEnv);
		
		
		actualParameters = null;
		return null;
	}
	
	@Override
	public void setActualParameters(List<IInterpretableNode> ap) {
		System.out.println("setting actual parameters...");
		this.actualParameters = ap;
	}
}
