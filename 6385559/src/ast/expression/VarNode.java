package ast.expression;

import ast.expression.selector.*;
import errorhandler.OberonException;
import management.MemoryManager;

public class VarNode extends ExpressionNode
{
  private final String varname;
  private final SelectorNode select;
  
  public VarNode( String varname, SelectorNode select )
  {
    super( null, null );
    assert ( varname != null && varname != "" ); // only run if the varname has been set. the selector is not mandatory
    
    this.varname = varname;
    this.select = select;
  }
  
  public String toString( int depth ) 
  {
    String code = this.varname;
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
    return this.varname + ( this.select != null ? this.select.getSelectorString( ) : "" );
  }
}
