package ASTnodes;

public class SimpleExpression implements ASTnode {
  public SimpleExpression( String operator, ASTnode term, SimpleExpression followup )
  {
	this.operator = operator;
	this.term = term;
	this.followup = followup;
  }
  
  public void printNode()
  {
	if( this.term != null )
      this.term.printNode();
    if( this.operator != null )
      System.out.print( this.operator );
    if( this.followup != null )
      this.followup.printNode();
  }
  
  private String operator = null;
  private ASTnode term = null;
  private SimpleExpression followup = null;
}