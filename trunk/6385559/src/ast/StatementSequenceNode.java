package ast;
import errorhandler.OberonException;

public class StatementSequenceNode implements ASTnode {
  private final StatementNode statement;
  private final StatementSequenceNode statementSequence;
  
  public StatementSequenceNode( StatementNode statement, StatementSequenceNode statementSequence )
  {
    this.statement = statement;
    this.statementSequence = statementSequence;
  }
  
  public void printNode( int depth )
  {
    if( this.statement != null )
    {
      this.statement.printNode( depth );
    }
    
    if( this.statementSequence != null )
    {
      this.statementSequence.printNode( depth );
    }
  }

  public int eval( String scope ) throws OberonException
  {
    if( this.statement != null )
    {
      this.statement.eval( scope );
    }
    if( this.statementSequence != null )
    {
      this.statementSequence.eval( scope );
    }
    return 0;
  }
}
