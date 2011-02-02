package ast;
import errorhandler.OberonException;

public class ExpressionNode implements ASTnode 
{
  protected ExpressionNode left;
  protected ExpressionNode right;
  
  public ExpressionNode( ExpressionNode left, ExpressionNode right )
  {
    this.left = left;
    this.right = right;
  }
  
  public void setRight( ExpressionNode right )
  { // used to set the right operator
    this.right = right;
  }
  
  public String ToString( int depth )
  {
    return "";
  }
  
  public int eval( ) throws OberonException
  { // only used to reduce the number of type conversions that I need to do
    throw new OberonException( "Expression eval should never be called." );
  }
}
