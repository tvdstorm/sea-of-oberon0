package ASTnodes;

public class WhileStatementNode implements StatementNode {
  public WhileStatementNode( String cond, StatementSequenceNode statements )
  {
	this.cond = cond;
	this.executionSequence = statements;
  }
  
  String cond = null;
  StatementSequenceNode executionSequence = null;
}
