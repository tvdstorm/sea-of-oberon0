package ast;
import errorhandler.OberonException;

public class IntegerNode implements ASTnode 
{
  private final int intValue;
  
  public IntegerNode( int x )
  {
    this.intValue = x;
  }
  
  public String ToString( int depth )
  {
    return "" + this.intValue;
  }
  
  public int eval( ) throws OberonException
  {
    return this.intValue;
  }
}
