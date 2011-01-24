package ASTnodes;

public class ArrayNode implements ASTnode {
  public ArrayNode( ExpressionNode expression, ASTnode type )
  {
	this.expression = expression;
	this.type = type;
  }
	
  public void printNode(int depth) {
    if( this.expression != null )
    {
      System.out.print( "ARRAY " );
      this.expression.printNode( 0 );
      System.out.print( " OF " );
    }
    if( this.type != null )
      this.type.printNode( 0 );
  }

  private ExpressionNode expression = null;
  private ASTnode type = null;
}
