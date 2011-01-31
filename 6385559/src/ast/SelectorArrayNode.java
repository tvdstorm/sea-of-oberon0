package ast;
import errorhandler.OberonException;

public class SelectorArrayNode implements ASTnode {
  private final ExpressionNode expression;
  private final ASTnode selector;
  
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
  
  public int eval( ) throws OberonException
  {
    return 0;
  }
  
  public String getString( ) throws OberonException
  {
    String returnValue = "";
    returnValue = "[" + this.expression.eval( ) + "]";
    if( this.selector != null )
    {
      if( this.selector instanceof SelectorArrayNode )
      {
        returnValue = returnValue + ( ((SelectorArrayNode) this.selector ).getString( ) );
      }
      else if( this.selector instanceof SelectorRecordNode )
      {
        returnValue = returnValue + ( ((SelectorRecordNode) this.selector ).getString( ) );
      }
    }
    return returnValue;
  }
}
