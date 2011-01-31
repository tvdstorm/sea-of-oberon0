package ast;
import errorhandler.OberonException;

public class SelectorRecordNode implements ASTnode {
  private final String ident;
  private final ASTnode selector;
  
  public SelectorRecordNode( String ident, ASTnode selector )
  {
    this.ident = ident;
    this.selector = selector;
  }
  
  public void printNode(int depth) {
    if( this.ident != null )
    {
      System.out.print( "." + this.ident );
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
