package edu.uva.sc.oberon0.Evaluators.Conditional;

import java.util.List;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Structural.IScope;
import edu.uva.sc.oberon0.Evaluators.Structural.IStatement;

public class SimpleIfStatement implements IStatement {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
