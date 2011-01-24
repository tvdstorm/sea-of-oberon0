package ASTnodes;

public class SelectorRecordNode implements ASTnode {
  public SelectorRecordNode( String ident, ASTnode selector )
  {
	this.ident = ident;
	this.selector = selector;
  }
	
  public void printNode(int depth) {
    if( this.ident != null )
      System.out.print( "." + this.ident );
    if( this.selector != null )
      this.selector.printNode( 0 );
  }

  private String ident = null;
  private ASTnode selector = null;
}
