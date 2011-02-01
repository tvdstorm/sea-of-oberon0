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
  
  public String ToString( int depth )
  {
    String code = "";
    if( this.statement != null )
    {
      code += this.statement.ToString( depth );
    }
    
    if( this.statementSequence != null )
    {
      code += this.statementSequence.ToString( depth );
    }
    return code;
  }

  public int eval( ) throws OberonException
  {
    if( this.statement != null )
    {
      this.statement.eval( );
    }
    if( this.statementSequence != null )
    {
      this.statementSequence.eval( );
    }
    return 0;
  }
}
