package ast;

import java.util.Vector;

import errorhandler.OberonException;
import management.ParamContainer;

public class ProcedureHeadingNode implements ASTnode 
{
  private final String identifier;
  private final FormalParameterNode formalParams;
  
  public ProcedureHeadingNode( String identifier, FormalParameterNode formalParams )
  {
    this.identifier = identifier;
    this.formalParams = formalParams;
  }
  
  public String ToString( int depth ) 
  {
    String code = "";
    if( this.identifier != null )
    {
      for( int i = 0; i < depth; i++ )
      {
        code += " ";
      }
      code += "PROCEDURE " + this.identifier;
      if( this.formalParams != null )
      {
        code += "( " + this.formalParams.ToString( 0 ) + " )";
      }
      code += ";\n";
    }
    return code;
  }
  
  public int eval( )  throws OberonException
  { 
    return 0; 
  }
  
  public int eval( Vector<ParamContainer> params ) throws OberonException
  {
    // we will loop through the FormalParameterNodes and map every variable to the correstponding variable
    // in the function
    if( this.formalParams != null )
    {
      this.formalParams.eval( params );
    }
    return 0;
  }
  
  public String getIdentifier()
  {
    return this.identifier;
  }
}
