package ast.expression;
import ast.ASTnode;
import errorhandler.OberonException;

public class ExpressionNode implements ASTnode 
{
  private ExpressionNode left;
  private ExpressionNode right;
  
  public ExpressionNode( ExpressionNode left, ExpressionNode right )
  {
    this.left = left;
    this.right = right;
  }
  
  public final void setRight( ExpressionNode right )
  { // used to set the right operator
    this.right = right;
  }
  
  public String toString( int depth )
  {
    return "";
  }
  
  public final ExpressionNode getLeft()
  {
    return this.left;
  }
  
  public final ExpressionNode getRight()
  {
    return this.right;
  }
  
  public int eval( ) throws OberonException
  { // only used to reduce the number of type conversions that I need to do
    throw new OberonException( "Expression eval should never be called." );
  }
}
