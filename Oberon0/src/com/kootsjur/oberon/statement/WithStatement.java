package com.kootsjur.oberon.statement;

import java.util.Map;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.environment.Reference;
import com.kootsjur.oberon.evaluator.Evaluator;
import com.kootsjur.oberon.value.Record;
import com.kootsjur.oberon.value.Value;

public class WithStatement extends Statement {

	private Evaluator recordExpression;
	private StatementSequence statementSequence;

	public WithStatement(Evaluator recordExpression,
			StatementSequence statementSequence) {

		this.recordExpression = recordExpression;
		this.statementSequence = statementSequence;
	}

	private boolean checkRecordExpression(Environment environment) {
		Value value = recordExpression.evaluate(environment);
		return (value instanceof Record);

	}

	@SuppressWarnings("rawtypes")
	@Override
	public void evaluate(Environment environment) {
		assert (checkRecordExpression(environment)) : "Error! With expression is not a Record!";

		Record record = (Record) recordExpression.evaluate(environment);
		Environment withEnvironment = new Environment(environment);
		Map<String, Reference> fieldReferenceMap = record.getFields();
		for (String field : fieldReferenceMap.keySet()) {
			Reference reference = fieldReferenceMap.get(field);
			withEnvironment.declareVarByReference(field, reference);
		}
		statementSequence.evaluate(withEnvironment);
	}

}
