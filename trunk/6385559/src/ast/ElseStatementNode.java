package ast;
import errorhandler.OberonException;

public class ElseStatementNode implements StatementNode 
{
  private final StatementSequenceNode sequence;
  
  public ElseStatementNode( StatementSequenceNode sequence )
  {
    this.sequence = sequence;
  }
  
  public String toString( int depth )
  {
    if( this.sequence != null )
    {
      return this.sequence.toString( depth );
    }
    return "";
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
