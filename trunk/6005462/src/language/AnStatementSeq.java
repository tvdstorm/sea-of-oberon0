package language;

import java.util.List;

public class AnStatementSeq implements IAstNode {
	private List<IStatement> statementList;
	
	public AnStatementSeq(List<IStatement> statementList){
		this.statementList = statementList;
	}
	
	
	@Override
	public IAstNode eval() throws Exception {
		for (IStatement smt : statementList){
			smt.eval();
		}
		return this;
	}

}
