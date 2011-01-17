package ASTnodes;

public class integerNode implements ASTnode {
  public integerNode( int x )
  {
	this.intValue = x;
  }
  
  private int intValue = 0;
}
