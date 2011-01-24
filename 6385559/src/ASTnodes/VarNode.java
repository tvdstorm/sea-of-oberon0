package ASTnodes;

public class VarNode implements ASTnode {
  public VarNode( String varname, ASTnode select )
  {
	this.varname = varname;
	this.select = select;
  }
	
  public void printNode(int depth) {
	if( this.varname != null )
      System.out.print( this.varname );
	if( this.select != null )
	  this.select.printNode( 0 );
  }

  private String varname = null;
  private ASTnode select = null;
}
