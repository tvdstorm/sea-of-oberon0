package edu.uva.sc.oberon0.Evaluators.Structural;

import java.util.List;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class SimpleIfStatement implements IStatement {
	IEvaluator ifCondition;
	List<IStatement> ifStatements;

	public SimpleIfStatement(IEvaluator ifCondition, List<IStatement> ifStatements){
		this.ifCondition = ifCondition;
		this.ifStatements = ifStatements;
	}
	
	@Override
	public Object evaluate(IScope scope) {
		if((Boolean)this.ifCondition.evaluate(scope)){
			for (IStatement sttmnt : ifStatements) {
				sttmnt.evaluate(scope);
			}
			return true;
		}
		return false;
	}
}
