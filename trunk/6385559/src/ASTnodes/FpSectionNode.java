package ASTnodes;

public class FpSectionNode implements ASTnode {
  public FpSectionNode( String identifier, IdentListNode variables, ASTnode type )
  {
    this.type = type;
    this.variables = variables;
    this.callByRef = ( identifier != null && identifier.contentEquals("VAR") ) ? true : false ;
  }

  public void printNode(int depth) {
    if( this.callByRef == true )
      System.out.print( "VAR " );
    if( this.variables != null )
    {
      this.variables.printNode( 0 );
      System.out.print( " : " );
      if( this.type != null )
        this.type.printNode( 0 );
    }
  }

  private boolean callByRef = false;
  private IdentListNode variables = null;
  private ASTnode type = null;
}
