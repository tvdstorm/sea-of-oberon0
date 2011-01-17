package ASTnodes;

public class IntegerNode implements ASTnode {
  public IntegerNode( int x )
  {
	System.out.println( "Integer node found!" );
	this.intValue = x;
  }
  
  private int intValue = 0;
}
