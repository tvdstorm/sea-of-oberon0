package ast.expression;

import ast.ASTnode;
import ast.expression.selector.SelectorArrayNode;
import ast.expression.selector.SelectorRecordNode;
import errorhandler.OberonException;
import management.MemoryManager;

public class VarNode extends ExpressionNode
{
  private final String varname;
  private final ASTnode select;
  
  public VarNode( String varname, ASTnode select )
  {
    super( null, null );
    this.varname = varname;
    this.select = select;
  }
  
  public String toString( int depth ) 
  {
    String code = "";
    if( this.varname != null )
    {
      code += this.varname;
    }
    
    if( this.select != null )
    {
      code += this.select.toString( 0 );
    }
    return code;
  }
  
  public int eval( ) throws OberonException
  {
    return MemoryManager.get( this.getVariableName( ) );
  }
  
  public String getVariableName( ) throws OberonException
  {
    String varnameWithSelector = this.varname;
    if( select != null )
    {
      if( this.select instanceof SelectorArrayNode )
      {
        varnameWithSelector = varname + ( (SelectorArrayNode) this.select ).getString( );
      }
      else if( this.select instanceof SelectorRecordNode )
      {
        varnameWithSelector = varname + ( (SelectorRecordNode) this.select).getString( );
      }
    }
    return varnameWithSelector;
  }
}
