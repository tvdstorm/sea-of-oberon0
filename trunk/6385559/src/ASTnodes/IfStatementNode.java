package ASTnodes;

public class IfStatementNode implements StatementNode {
  public IfStatementNode( ExpressionNode expression, StatementSequenceNode sequence, StatementNode elseStatement )
  {
	this.expression = expression;
	this.sequence = sequence;
	this.elseStatement = elseStatement;
  }
  
  public void printNode()
  {
	
  }
  
  private ExpressionNode expression = null;
  private StatementSequenceNode sequence = null;
  private StatementNode elseStatement = null;
}
