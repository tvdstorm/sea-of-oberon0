package ASTnodes;

public class IdentListNode implements ASTnode {
  public IdentListNode( String identifier, IdentListNode followup )
  {
    this.identifier = identifier;
    this.followup = followup;
  }
	
  public void printNode(int depth) 
  {
    if( this.identifier != null )
      System.out.print( this.identifier );
    if( this.followup != null )
    {
      System.out.print( ", " );
      this.followup.printNode( 0 );
    }
  }

  private String identifier = null;
  private IdentListNode followup = null;
}
