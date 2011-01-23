package ASTnodes;

public class ElseStatementNode implements StatementNode {
  public ElseStatementNode( StatementSequenceNode sequence )
  {
	this.sequence = sequence;
  }
  
  public void printNode()
  {
	
  }
  
  private StatementSequenceNode sequence;
}
