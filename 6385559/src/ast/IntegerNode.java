package ast;
import errorhandler.OberonException;

public class IntegerNode extends ExpressionNode
{
  private final int intValue;
  
  public IntegerNode( int x )
  {
    super( null, null );
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
