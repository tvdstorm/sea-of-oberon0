package ast;
import errorhandler.OberonException;

public class SelectorArrayNode implements ASTnode 
{
  private final ExpressionNode expression;
  private final ASTnode selector;
  
  public SelectorArrayNode( ExpressionNode expression, ASTnode selector )
  {
    this.expression = expression;
    this.selector = selector;
  }
  
  public String ToString( int depth ) 
  {
    String code = "";
    if( this.expression != null )
    {
      code += "[" + this.expression.ToString( 0 ) + "]";
    }
    
    if( this.selector != null )
    {
      code += this.selector.ToString( 0 );
    }
    return code;
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
