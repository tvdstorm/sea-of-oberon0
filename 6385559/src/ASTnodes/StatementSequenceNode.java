package ASTnodes;

public class StatementSequenceNode implements ASTnode {
  public StatementSequenceNode( String statement, StatementSequenceNode statementSequence )
  {
	this.statement = statement;
	this.statementSequence = statementSequence;
  }
  
  public String statement;
  public StatementSequenceNode statementSequence;
}
