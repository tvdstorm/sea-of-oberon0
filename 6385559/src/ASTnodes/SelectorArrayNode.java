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
    {
      this.selector.printNode( 0 );
    }
  }
  
  public int eval( String scope )
  {
    return 0;
  }
  
  public String getString( String scope )
  {
    String returnValue = "";
    returnValue = "[" + this.expression.eval( scope ) + "]";
    if( this.selector != null )
    {
      if( this.selector instanceof SelectorArrayNode )
      {
        returnValue = returnValue + ( ((SelectorArrayNode) this.selector ).getString( scope ) );
      }
      else if( this.selector instanceof SelectorRecordNode )
      {
        returnValue = returnValue + ( ((SelectorRecordNode) this.selector ).getString( scope ) );
      }
    }
    return returnValue;
  }

  private ExpressionNode expression = null;
  private ASTnode selector = null;
}
