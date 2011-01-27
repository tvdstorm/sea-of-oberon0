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
  
  public int eval( String scope )
  {
	if( this.sequence != null )
	{
	  this.sequence.eval( scope );
	}
    return 0;
  }
  
  private StatementSequenceNode sequence = null;
}
