package edu.uva.sc.oberon0.Evaluators.Structural;

import java.util.LinkedList;
import java.util.List;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class IfStatement implements IStatement {
	
	SimpleIfStatement ifBlock;
	
	List<SimpleIfStatement> elseIfBlock = new LinkedList<SimpleIfStatement>();
	
	List<IStatement> elseStatements;

	@Override
	public Object evaluate(IScope scope) {
		if(!(Boolean)this.ifBlock.evaluate(scope)){
			
			Boolean isElseIf = false;
			if(this.elseIfBlock != null) {
				for (SimpleIfStatement sIfStatement : this.elseIfBlock) {
					isElseIf = (Boolean)sIfStatement.evaluate(scope);
					if(isElseIf) break;
				}
			}
			if(!isElseIf && this.elseStatements != null){
				for (IStatement elseStatement : this.elseStatements) {
					elseStatement.evaluate(scope);
				}
			}
		} 
		return null;
	}
	public void SetIfBlock(SimpleIfStatement ifBlock){
		this.ifBlock = ifBlock;
	}
	public void AddElseIf(SimpleIfStatement elseIfPart){
		this.elseIfBlock.add(elseIfPart);
	}
	public void SetElseStatements(List<IStatement> elseStatements){
		this.elseStatements = elseStatements;
	}
}
