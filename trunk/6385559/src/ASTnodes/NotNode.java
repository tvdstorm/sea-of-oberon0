package ASTnodes;

public class NotNode implements ASTnode {
  public NotNode( ASTnode expression )
  {
	this.expression = expression;
  }
  
  public void printNode()
  {
	
  }
  
  private ASTnode expression;
}
