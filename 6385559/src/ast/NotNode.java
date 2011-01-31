package ast;
import errorhandler.OberonException;

public class NotNode implements ASTnode {
  private final ASTnode expression;
  
  public NotNode( ASTnode expression )
  {
    this.expression = expression;
  }
  
  public void printNode( int depth )
  {
    System.out.print( "(-" );
    this.expression.printNode( 0 );
    System.out.print( ")" );
  }
  
  public int eval( ) throws OberonException
  {
    if( this.expression != null )
    {
      return ~(this.expression.eval( ));
    }
    return 0;
  }
}
