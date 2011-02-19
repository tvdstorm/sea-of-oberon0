package oberon0.statement;

import java.util.List;

import oberon0.declaration.ProcedureDeclaration;
import oberon0.environment.Environment;
import oberon0.expression.Expression;

public class ProcedureCallStatement  implements Statement {

	private final String identifier;
	private List<Expression> actualParameterExpressions;
	
	public ProcedureCallStatement(String identifier) {
		this.identifier = identifier;
		
	}
	
	public void setActualParameters(List<Expression> actualParameterExpressions) {
		this.actualParameterExpressions = actualParameterExpressions;
	}
	
	@Override
	public void execute(Environment env){
		ProcedureDeclaration procedure = env.getProcedure(identifier);
		procedure.start(env, actualParameterExpressions);
	}
}
