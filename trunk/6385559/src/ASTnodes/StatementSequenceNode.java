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
  
  private StatementNode statement;
  private StatementSequenceNode statementSequence;
}
