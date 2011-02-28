package language;

import java.util.List;

public class AnSmtIf implements IStatement {

	private AnExpression condition;
	private List<IStatement> statementSeq;
	
	public AnSmtIf(AnExpression condition, List<IStatement> statementSeq){
		this.condition = condition;
		this.statementSeq = statementSeq;
	}
	
	@Override
	public IAstNode eval(AnEnvironment env) throws Exception {
		if (condition.eval(env).getBoolean().getValue()){
			for (IStatement smt : statementSeq){
				smt.eval(env);
			}
		}
		return this;
	}

	@Override
	public void typeCheck(AnEnvironment env) throws Exception {
		if (this.condition.getType() != ValueType.BOOLEAN){
			throw new Exception("Condition for ifstatement doesn't resolve to a boolean type: " + condition.toString());
		}
		this.condition.typeCheck(env);
		for (IStatement smt : this.statementSeq){
			smt.typeCheck(env);
		}
	}

}
