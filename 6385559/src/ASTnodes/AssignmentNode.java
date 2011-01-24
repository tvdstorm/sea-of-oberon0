package ASTnodes;

public class AssignmentNode implements StatementNode {
  public AssignmentNode( VarNode var, ExpressionNode expression )
  {
	this.var = var;
	this.expression = expression;
  }
  
  public void printNode( int depth )
  {
	for( int i = 0; i < depth; i++ )
	  System.out.print( " " );
	if( this.var != null )
	  this.var.printNode( 0 );
	System.out.print( " := " );
	if( this.expression != null )
	  this.expression.printNode( depth );
	System.out.println( ";" );
  }
  
  private VarNode var = null;
  private ExpressionNode expression = null;
}
