package oberon0.statement;

import java.util.ArrayList;

import oberon0.environment.Environment;
import oberon0.expression.Expression;

public class IfStatement extends ConditionStatement {

	private final ArrayList<ConditionStatement> nextConditions;
	private boolean hasElseStatement;
	
	//Constructor
	public IfStatement(Expression condition) {
		super(condition);

		nextConditions = new ArrayList<ConditionStatement>();
		hasElseStatement = false;
	}
	
	public void addElsifStatement(ElsifStatement eslifStat) {
		nextConditions.add(eslifStat);
	}
	
	public void addElseStatement(ElseStatement elseStat) {
		assert(hasElseStatement == false):"Added else statement twice.";
		nextConditions.add(elseStat);
		hasElseStatement = true;
	}

	@Override
	public void execute(Environment env) {
		if (conditionTrue(env)) {
			executeStatements(env);
		}
		else {
			considerNextConditions(env);
		}
	}
	
	private void considerNextConditions(Environment env) {
		for (ConditionStatement condStat : nextConditions) {
			if (condStat.conditionTrue(env)) {
				condStat.execute(env);
				return;
			}
		}
	}
}
