package ASTnodes;

public class IntegerNode implements ASTnode {
  public IntegerNode( int x )
  {
	this.intValue = x;
  }
  
  private int intValue = 0;
}
