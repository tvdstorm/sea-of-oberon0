package ast.expression.selector;
import ast.ASTnode;
import ast.expression.ExpressionNode;
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
  
  public String toString( int depth ) 
  {
    String code = "";
    if( this.expression != null )
    {
      code += "[" + this.expression.toString( 0 ) + "]";
    }
    
    if( this.selector != null )
    {
      code += this.selector.toString( 0 );
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
