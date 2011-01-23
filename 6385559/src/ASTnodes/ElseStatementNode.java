package ASTnodes;

public class ElseStatementNode implements StatementNode {
  public ElseStatementNode( StatementSequenceNode sequence )
  {
	this.sequence = sequence;
  }
  
  public void printNode( int depth )
  {
	if( this.sequence != null )
	  this.sequence.printNode( depth );
  }
  
  private StatementSequenceNode sequence;
}
