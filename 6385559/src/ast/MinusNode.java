package ast;
import errorhandler.OberonException;

public class MinusNode implements ASTnode 
{
  private final TermNode child;
  
  public MinusNode( TermNode child )
  {
    this.child = child;
  }
  
  public String ToString( int depth )
  {
    return "(-" + this.child.ToString( 0 ) + ")";
  }
  
  public int eval( ) throws OberonException
  {
    return -1 * this.child.eval( );
  }
}
