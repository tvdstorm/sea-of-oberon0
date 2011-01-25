package ASTnodes;

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

  private FpSectionNode fpSection = null;
  private FormalParameterNode followup = null;
}
