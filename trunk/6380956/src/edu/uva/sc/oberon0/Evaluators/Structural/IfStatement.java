package edu.uva.sc.oberon0.Evaluators.Structural;

import java.util.List;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class IfStatement implements IStatement {
	IEvaluator ifCondition;
	List<IStatement> ifStatements;
	
	List<IEvaluator> elseIfConditions;
	List<List<IStatement>> elseIfStatements;
	
	List<IStatement> elseStatements;

	@Override
	public Object evaluate(IScope scope) {
		// TODO Auto-generated method stub
		return null;
	}
}
