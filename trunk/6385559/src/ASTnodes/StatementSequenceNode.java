package ASTnodes;

public class StatementSequenceNode implements ASTnode {
  public StatementSequenceNode( StatementNode statement, StatementSequenceNode statementSequence )
  {
	this.statement = statement;
	this.statementSequence = statementSequence;
  }
  
  public void printNode( int depth )
  {
	if( this.statement != null )
	  this.statement.printNode( depth );
	if( this.statementSequence != null )
	  this.statementSequence.printNode( depth );
  }

  public int eval( String scope )
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
  
  private StatementNode statement;
  private StatementSequenceNode statementSequence;
}
