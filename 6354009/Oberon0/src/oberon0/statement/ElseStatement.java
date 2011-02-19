package oberon0.statement;

import oberon0.environment.Environment;

public class ElseStatement extends ConditionStatement {

	public ElseStatement() {
		super(null);
	}
	
	@Override
	public boolean conditionTrue(Environment env) {
		return true;
	}
	
	@Override
	public void execute(Environment env) {
		executeStatements(env);
	}
}
