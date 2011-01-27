package ASTnodes;

import interpreter.MemoryManager;

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
  
  public int eval( String scope )
  {
    return MemoryManager.get( this.getVarname( scope ) );
  }
  
  public String getVarname( String scope )
  {
    String varnameWithSelector = this.varname;
    if( select != null )
    {
      varnameWithSelector = varname + "[" + this.select.eval( scope ) + "]";
    }
    return varnameWithSelector;
  }

  private String varname = null;
  private ASTnode select = null;
}
