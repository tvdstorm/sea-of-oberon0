package ASTnodes;

public class IntegerNode implements ASTnode {
  public IntegerNode( int x )
  {
    this.intValue = x;
  }
  
  public void printNode( int depth )
  {
    System.out.print( this.intValue );
  }
  
  public int eval( String scope )
  {
    return this.intValue;
  }
  
  private int intValue = 0;
}
