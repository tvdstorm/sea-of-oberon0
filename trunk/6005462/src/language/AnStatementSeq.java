package language;

import java.util.List;

public class AnStatementSeq implements IAstNode {
	private List<IStatement> statementList;
	
	public AnStatementSeq(List<IStatement> statementList){
		this.statementList = statementList;
	}
	
	
	@Override
	public IAstNode eval(AnEnvironment env) throws Exception {
		for (IStatement smt : statementList){
			smt.eval(env);
		}
		return this;
	}

}
