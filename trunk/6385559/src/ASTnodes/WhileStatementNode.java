package ASTnodes;

public class WhileStatementNode implements StatementNode {
  public WhileStatementNode( ExpressionNode cond, StatementSequenceNode statements )
  {
	this.cond = cond;
	this.executionSequence = statements;
  }
  
  public void printNode()
  {
	System.out.print( "WHILE " );
	if( this.cond != null )
	  this.cond.printNode();
	System.out.println( " DO" );
	if( this.executionSequence != null )
	  this.executionSequence.printNode();
	System.out.println( "END;");
  }
  
  private ExpressionNode cond = null;
  private StatementSequenceNode executionSequence = null;
}
