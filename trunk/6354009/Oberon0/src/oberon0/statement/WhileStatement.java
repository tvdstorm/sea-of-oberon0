package oberon0.statement;

import oberon0.environment.Environment;
import oberon0.expression.Expression;

public class WhileStatement extends ConditionStatement {

	public WhileStatement(Expression condition) {
		super(condition);
	}
	
	@Override
	public void execute(Environment env) {
		while (conditionTrue(env)) {
			executeStatements(env);
		}
	}

}
