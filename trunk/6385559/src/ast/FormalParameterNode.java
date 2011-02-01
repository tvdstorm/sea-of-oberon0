package ast;

import java.util.Vector;

import errorhandler.OberonException;
import management.ParamContainer;

public class FormalParameterNode implements ASTnode 
{
  private final FpSectionNode fpSection;
  private final FormalParameterNode followup;
  
  public FormalParameterNode( FpSectionNode fpSection, FormalParameterNode followup )
  {
    this.fpSection = fpSection;
    this.followup = followup;
  }
  
  public String ToString( int depth ) 
  {
    String code = "";
    if( this.fpSection != null )
    {
      code += this.fpSection.ToString( 0 );
    }
    if( this.followup != null )
    {
      code += "; " + this.followup.ToString( 0 );
    }
    return code;
  }
  
  public int eval( ) throws OberonException
  {
    return 0;
  }
  
  public Vector<ParamContainer> eval( Vector<ParamContainer> params ) throws OberonException
  { // overload the standard eval function because we need a Vector with the ParamContainer
    if( this.fpSection != null )
    {
      params = fpSection.eval( params );
    }
    
    if( followup != null )
    {
      params = this.followup.eval( params );
    }
    
    return params;
  }
}