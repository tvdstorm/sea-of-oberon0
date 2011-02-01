package ast;

import java.util.Vector;

import errorhandler.OberonException;

import management.ParamContainer;
import management.ProcedureManager;
import management.ScopeManager;

public class ProcedureCallNode implements StatementNode 
{
  private final String identifier;
  private final ParamNode params;
  
  public ProcedureCallNode( String identifier, ParamNode params )
  {
    this.identifier = identifier;
    this.params = params;
  }
  
  public String ToString( int depth )
  {
    String code = "";
    for( int i = 0; i < depth; i++ )
    { // print the correct depth
      code += " ";
    }
  
    if( this.identifier != null )
    {
      code += this.identifier;
    }
  
    if( this.params != null )
    {
      code += "( " + params.ToString( 0 ) + " )";
    }
  
    return code + ";\n";
  }
  
  public int eval( ) throws OberonException
  {
    ProcedureDeclarationNode declaration = ProcedureManager.getProcedure( this.identifier );
    // build the parameter list
    Vector<ParamContainer> params = null;
    if( this.params != null )
    {
      params = this.params.getVarValueList( );
      // first parameter is the last in the vector list
    }
    
    if( declaration != null )
    {
      String newScope = this.identifier + "_" + ScopeManager.currentScope( );
      ScopeManager.setScope( newScope );
      declaration.eval( params );
      ScopeManager.removeLastScope( );
    }
    return 0;
  }
}
