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
  
  public void setRight( SimpleExpression right )
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
  
  public String getVariableName() throws OberonException
  { // used only to ease the use of getVariableName, not type conversions needed
    // if you get there something went terribly wrong
    throw new OberonException( "Expression getVariableName() call should never happen." );
  }
}
