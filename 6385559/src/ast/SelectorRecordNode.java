package ast;
import errorhandler.OberonException;

public class SelectorRecordNode implements ASTnode 
{
  private final String ident;
  private final ASTnode selector;
  
  public SelectorRecordNode( String ident, ASTnode selector )
  {
    this.ident = ident;
    this.selector = selector;
  }
  
  public String ToString( int depth ) 
  {
    String code = "";
    if( this.ident != null )
    {
      code += "." + this.ident;
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
    String returnValue = "." + this.ident;
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
