package oberon0.statement;

import java.util.ArrayList;
import java.util.List;

import oberon0.environment.Environment;
import oberon0.expression.Expression;
import oberon0.value.BooleanValue;

public abstract class ConditionStatement implements Statement {
	
	private final ArrayList<Statement>statements;
	private final Expression condition;
	
	public ConditionStatement(Expression condition) {
		this.condition = condition;
		this.statements = new ArrayList<Statement>();
	}
	
	public void addStatements(List<Statement>statements) {
		this.statements.addAll(statements);
	}
	
	public void executeStatements(Environment env) {
		for(Statement stat : statements) {
			stat.execute(env);
		}
	}
	
	public boolean conditionTrue(Environment env) {
		BooleanValue conValue = condition.evaluate(env);
		return conValue.getBoolValue();
	}
}
