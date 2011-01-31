package ASTnodes;

import java.util.Vector;

import errorhandler.OberonException;
import management.ParamContainer;

public class FormalParameterNode implements ASTnode {
  private final FpSectionNode fpSection;
  private final FormalParameterNode followup;
  
  public FormalParameterNode( FpSectionNode fpSection, FormalParameterNode followup )
  {
    this.fpSection = fpSection;
    this.followup = followup;
  }
  
  public void printNode(int depth) {
    if( this.fpSection != null )
    {
      this.fpSection.printNode( 0 );
    }
    if( this.followup != null )
    {
      System.out.print( "; " );
      this.followup.printNode( 0 );
    }
  }
  
  public int eval( String scope ) throws OberonException
  {
    return 0;
  }
  
  public Vector<ParamContainer> eval( String scope, Vector<ParamContainer> params ) throws OberonException
  { // overload the standard eval function because we need a Vector with the ParamContainer
    if( this.fpSection != null )
    {
      params = fpSection.eval( scope, params );
    }
    
    if( followup != null )
    {
      params = this.followup.eval( scope, params );
    }
    
    return params;
  }
}