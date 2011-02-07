package oberon0.statement;

import oberon0.exception.ExecutionException;
import oberon0.expression.Expression;
import oberon0.identifier.Identifier;
import oberon0.module.Module;

public class AssigmentStatement  implements Statement {

	private Expression expression;
	private Identifier identifier;
	
	public AssigmentStatement(Identifier identifier,Expression expression) {
		this.identifier = identifier;
		this.expression = expression;
	}
	
	@Override
	public void execute(Module module) throws ExecutionException {
		//Flatten the expression
		Expression evaluatedExpr = expression.evaluate(module);
		
		//Assign it to the variable.
		module.assignExpressionToVariable(identifier,evaluatedExpr);
	}
	
}
