package ASTnodes;

public class SelectorRecordNode implements ASTnode {
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
  
  public int eval( String scope )
  {
    return 0;
  }
  
  public String getString( String scope )
  {
    String returnValue = "." + this.ident;
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

  private String ident = null;
  private ASTnode selector = null;
}