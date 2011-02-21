package edu.uva.sc.oberon0.Evaluators.Structural;

import java.util.List;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class WhileStatement implements IStatement {
	IEvaluator condition;
	List<IStatement> statements;
	
	public WhileStatement(IEvaluator condition, List<IStatement> statements) {
		this.condition = condition;
		this.statements = statements;
	}
	@Override
	public Object evaluate(IScope scope) {

		while((Boolean)this.condition.evaluate(scope)){
			for (IStatement sttmnt : this.statements) {
				sttmnt.evaluate(scope);
			}
		}
		return null;
	}
}
