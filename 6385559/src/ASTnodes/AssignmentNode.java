package ASTnodes;

public class AssignmentNode implements StatementNode {
  public AssignmentNode( String ident, ExpressionNode expression )
  {
	this.ident = ident;
	this.expression = expression;
  }
  
  public void printNode()
  {
	System.out.print( this.ident + " := " );
	this.expression.printNode();
	System.out.println( "" );
  }
  
  private String ident = null;
  private ExpressionNode expression = null;
}
