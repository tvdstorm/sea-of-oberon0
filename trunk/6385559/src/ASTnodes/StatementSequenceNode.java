package ASTnodes;

public class StatementSequenceNode implements ASTnode {
  public StatementSequenceNode( StatementNode statement, StatementSequenceNode statementSequence )
  {
	this.statement = statement;
	this.statementSequence = statementSequence;
  }
  
  public StatementNode statement;
  public StatementSequenceNode statementSequence;
}
