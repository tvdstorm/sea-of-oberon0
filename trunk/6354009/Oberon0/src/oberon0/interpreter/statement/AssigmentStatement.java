package oberon0.interpreter.statement;

import oberon0.interpreter.exceptions.ExecutionException;
import oberon0.interpreter.expression.Expression;
import oberon0.interpreter.identifier.Identifier;
import oberon0.interpreter.module.Module;

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
