package com.kootsjur.oberon.statement;

import com.kootsjur.oberon.environment.Environment;

public abstract class Statement {
	public enum StatementType {
		PROCEDURECALL, ASSIGNMENT, IFSTATEMENT, WHILESTATEMENT
	}

	public Statement() {

	}

	public abstract void evaluate(Environment environment);
}
