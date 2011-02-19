package oberon0.statement;

import oberon0.environment.Environment;
import oberon0.expression.Expression;

public class ElsifStatement extends ConditionStatement{

	public ElsifStatement(Expression condition) {
		super(condition);
	}
	
	@Override
	public void execute(Environment env) {
		if (conditionTrue(env)) {
			executeStatements(env);
		}
	}
}
