package com.kootsjur.oberon.statement;

import java.util.LinkedList;
import java.util.List;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.evaluator.Evaluator;
import com.kootsjur.oberon.value.Bool;

public class IfStatement extends Statement {
	private Evaluator ifCondition;
	private StatementSequence thenStatementSequence;
	private List<IfStatement> elseIfStatements;
	private StatementSequence elseStatementSequence;

	public IfStatement(Evaluator ifCondition,
			StatementSequence thenStatementSequence) {
		this.ifCondition = ifCondition;
		this.thenStatementSequence = thenStatementSequence;
		this.elseIfStatements = new LinkedList<IfStatement>();
	}

	public IfStatement(Evaluator ifCondition,
			StatementSequence thenStatementSequence,
			StatementSequence elseStatementSequence) {
		this.ifCondition = ifCondition;
		this.thenStatementSequence = thenStatementSequence;
		this.elseStatementSequence = elseStatementSequence;
		this.elseIfStatements = new LinkedList<IfStatement>();
	}

	public IfStatement(Evaluator ifCondition,
			StatementSequence thenStatementSequence,
			List<IfStatement> elseIfStatements) {
		super();
		this.ifCondition = ifCondition;
		this.thenStatementSequence = thenStatementSequence;
		this.elseIfStatements = elseIfStatements;
	}

	public IfStatement(Evaluator ifCondition,
			StatementSequence thenStatementSequence,
			StatementSequence elseStatementSequence,
			List<IfStatement> elseIfStatements) {
		this.ifCondition = ifCondition;
		this.thenStatementSequence = thenStatementSequence;
		this.elseStatementSequence = elseStatementSequence;
		this.elseIfStatements = elseIfStatements;
	}

	public boolean addElseIfStatement(IfStatement elseIfStatement) {
		assert (this.elseIfStatements != null) : "Error elseIfStatement not initialized";
		return this.elseIfStatements.add(elseIfStatement);
	}

	public void setIfCondition(Evaluator ifCondition) {
		this.ifCondition = ifCondition;
	}

	public Evaluator getIfCondition() {
		return ifCondition;
	}

	public void setThenStatementSequence(StatementSequence thenStatementSequence) {
		this.thenStatementSequence = thenStatementSequence;
	}

	public StatementSequence getThenStatementSequence() {
		return thenStatementSequence;
	}

	public void setElseIfStatement(List<IfStatement> elseIfStatements) {
		this.elseIfStatements = elseIfStatements;
	}

	public List<IfStatement> getElseIfStatement() {
		return elseIfStatements;
	}

	public void setElseStatementSequence(StatementSequence elseStatementSequence) {
		this.elseStatementSequence = elseStatementSequence;
	}

	public StatementSequence getElseStatementSequence() {
		return elseStatementSequence;
	}

	@Override
	public void evaluate(Environment environment) {
		Bool ifcon = (Bool) ifCondition.evaluate(environment);
		if (ifcon.getValue()) {
			if (thenStatementSequence != null) {
				thenStatementSequence.evaluate(environment);
			}
			return; // condition true. No need to process elseIfStatements!
					// neither else statement!
		}

		if (processElseIfStatements(environment)) {
			return;// one elseIfcondition was true so no need to process else
					// statement
		}

		processElseStatements(environment);
	}

	private void processElseStatements(Environment environment) {
		if (elseStatementSequence != null && !elseStatementSequence.isEmpty()) {
			elseStatementSequence.evaluate(environment);
		}

	}

	private boolean processElseIfStatements(Environment environment) {
		boolean isElseIfs = false;
		if (!elseIfStatements.isEmpty()) {
			for (IfStatement ifStatement : elseIfStatements) {
				Evaluator ifElseConditionEvaluator = ifStatement.getIfCondition();
				Bool elseIfCondition = (Bool) ifElseConditionEvaluator.evaluate(environment);
				
				if (elseIfCondition.getValue()) {
					StatementSequence elseIfStatementSequence = ifStatement.getThenStatementSequence();
					elseIfStatementSequence.evaluate(environment);
					isElseIfs = true;
					break;
				}
			}
		}

		return isElseIfs;
	}
}
