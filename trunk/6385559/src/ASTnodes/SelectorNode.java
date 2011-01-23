package ASTnodes;

public class SelectorNode implements ASTnode {
  public SelectorNode( String identifier )
  {
	this.identifier = identifier;
  }
	
  public void printNode()
  {
	if( this.identifier != null )
	  System.out.print( this.identifier );
  }
  
  private String identifier = null;
}
