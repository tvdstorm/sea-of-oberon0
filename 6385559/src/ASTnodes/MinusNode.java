package ASTnodes;

public class MinusNode implements ASTnode {
  public MinusNode( TermNode e )
  {
	this.child = e;
  }
  
  public void printNode()
  {
	System.out.print( "(-" );
	this.child.printNode();
	System.out.print( ')' );
  }
  
  private TermNode child = null;
}
