package ast;
import errorhandler.OberonException;

public class ElseStatementNode implements StatementNode {
  private final StatementSequenceNode sequence;
  
  public ElseStatementNode( StatementSequenceNode sequence )
  {
    this.sequence = sequence;
  }
  
  public void printNode( int depth )
  {
    if( this.sequence != null )
    {
      this.sequence.printNode( depth );
    }
  }
  
  public int eval( ) throws OberonException
  {
    if( this.sequence != null )
    {
      this.sequence.eval( );
    }
    return 0;
  }
}
