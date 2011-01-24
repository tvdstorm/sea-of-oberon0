package ASTnodes;

public class TypeDefNode implements ASTnode {
  public TypeDefNode( String identifier, ASTnode type, TypeDefNode followup )
  {
	this.identifier = identifier;
	this.type = type;
	this.followup = followup;
  }
	
  public void printNode(int depth) {
    if( this.identifier != null )
      System.out.print( this.identifier + " = " );
    if( this.type != null )
    {
      this.type.printNode( 0 );
      System.out.print( "; " );
    }
    if( this.followup != null )
      this.followup.printNode( 0 );
  }
  
  private String identifier = null;
  private ASTnode type = null;
  private TypeDefNode followup = null;
}
