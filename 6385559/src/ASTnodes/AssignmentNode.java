package ASTnodes;

public class AssignmentNode implements StatementNode {
  public AssignmentNode( String ident, ExpressionNode expression )
  {
	this.ident = ident;
	this.expression = expression;
  }
  
  public void printNode( int depth )
  {
	for( int i = 0; i < depth; i++ )
	  System.out.print( " " );
	System.out.print( this.ident + " := " );
	this.expression.printNode( depth );
	System.out.println( "" );
  }
  
  private String ident = null;
  private ExpressionNode expression = null;
}
