package ASTnodes;

public class SelectorArrayNode implements ASTnode {
  public SelectorArrayNode( ExpressionNode expression, ASTnode selector )
  {
	this.expression = expression;
	this.selector = selector;
  }
	
  public void printNode(int depth) {
    if( this.expression != null )
    {
      System.out.print( "[" );
      this.expression.printNode( 0 );
      System.out.print( "]" );
    }
    if( this.selector != null )
      this.selector.printNode( 0 );
  }

  private ExpressionNode expression = null;
  private ASTnode selector = null;
}
