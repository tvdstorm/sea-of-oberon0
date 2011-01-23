package ASTnodes;

public class TermNode implements ASTnode {
  public TermNode( ASTnode factor, String operator, TermNode follow )
  {
	this.factor = factor;
	this.operator = operator;
	this.follow = follow;
  }
  
  public void printNode( int depth )
  {
	if( this.factor != null )
	  this.factor.printNode( depth );
	if( this.operator != null )
	  System.out.print( this.operator );
    if( this.follow != null )
      this.follow.printNode( depth );
  }
  
  private ASTnode factor = null;
  private String operator = null;
  private TermNode follow = null;
}
