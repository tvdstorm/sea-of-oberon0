package edu.uva.sc.oberon0.Evaluators.Conditional;

import java.util.List;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Structural.IScope;
import edu.uva.sc.oberon0.Evaluators.Structural.IStatement;

public class WhileStatement implements IStatement {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
