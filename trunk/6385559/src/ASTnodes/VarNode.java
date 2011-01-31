package ASTnodes;

import errorhandler.OberonException;
import management.MemoryManager;

public class VarNode implements ASTnode {
  private final String varname;
  private final ASTnode select;
  
  public VarNode( String varname, ASTnode select )
  {
    this.varname = varname;
    this.select = select;
  }
  
  public void printNode(int depth) 
  {
    if( this.varname != null )
    {
      System.out.print( this.varname );
    }
    
    if( this.select != null )
    {
      this.select.printNode( 0 );
    }
  }
  
  public int eval( String scope ) throws OberonException
  {
    return MemoryManager.get( this.getVarname( scope ) );
  }
  
  public String getVarname( String scope ) throws OberonException
  {
    String varnameWithSelector = this.varname;
    if( select != null )
    {
      if( this.select instanceof SelectorArrayNode )
      {
        varnameWithSelector = varname + ( (SelectorArrayNode) this.select ).getString( scope );
      }
      else if( this.select instanceof SelectorRecordNode )
      {
        varnameWithSelector = varname + ( (SelectorRecordNode) this.select).getString( scope );
      }
    }
    return varnameWithSelector;
  }
}
