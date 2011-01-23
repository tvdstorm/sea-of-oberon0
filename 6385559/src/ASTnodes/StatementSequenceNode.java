package ASTnodes;

public class StatementSequenceNode implements ASTnode {
  public StatementSequenceNode( StatementNode statement, StatementSequenceNode statementSequence )
  {
	this.statement = statement;
	this.statementSequence = statementSequence;
  }
  
  public void printNode()
  {
	if( this.statement != null )
	  this.statement.printNode();
	if( this.statementSequence != null )
	  this.statementSequence.printNode();
  }
  
  private StatementNode statement;
  private StatementSequenceNode statementSequence;
}
