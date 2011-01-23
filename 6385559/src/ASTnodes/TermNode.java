package ASTnodes;

public class TermNode implements ASTnode {
  public TermNode( ASTnode factor, String operator, TermNode follow )
  {
	this.factor = factor;
	this.operator = operator;
	this.follow = follow;
  }
  
  public void printNode()
  {
	if( this.factor != null )
	  this.factor.printNode();
	if( this.operator != null )
	  System.out.print( this.operator );
    if( this.follow != null )
      this.follow.printNode();
  }
  
  private ASTnode factor = null;
  private String operator = null;
  private TermNode follow = null;
}
