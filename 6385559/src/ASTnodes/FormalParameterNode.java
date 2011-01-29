package ASTnodes;

import java.util.Vector;
import interpreter.ParamContainer;

public class FormalParameterNode implements ASTnode {
  public FormalParameterNode( FpSectionNode fpSection, FormalParameterNode followup )
  {
    this.fpSection = fpSection;
    this.followup = followup;
  }
	@Override
  public void printNode(int depth) {
    if( this.fpSection != null )
      this.fpSection.printNode( 0 );
    if( this.followup != null )
    {
      System.out.print( "; " );
      this.followup.printNode( 0 );
    }
  }
	
  public int eval( String scope )
  {
    return 0;
  }
  
  public Vector<ParamContainer> declare( String scope, Vector<ParamContainer> params )
  {
	if( this.fpSection != null )
	{
      params = fpSection.declare( scope, params );
	}
	if( followup != null )
    {
      params = this.followup.declare( scope, params );
    }
	return params;
  }

  private FpSectionNode fpSection = null;
  private FormalParameterNode followup = null;
}
