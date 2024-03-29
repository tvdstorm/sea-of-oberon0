package ast;

import ast.expression.ExpressionNode;
import ast.expression.VarNode;
import errorhandler.OberonException;
import management.MemoryManager;

public class AssignmentNode implements StatementNode 
{
  private final ExpressionNode var;
  private final ExpressionNode expression;
  
  public AssignmentNode( ExpressionNode var, ExpressionNode expression )
  {
    this.var = var;
    this.expression = expression;
  }
  
  public String toString( int depth )
  {
    String code = "";
    for( int i = 0; i < depth; i++ )
    {
      code += " ";
    }
    if( this.var != null )
    {
      code += this.var.toString( 0 );
    }
    code += " := ";
    if( this.expression != null )
    {
      code += this.expression.toString( depth );
    }
    return code + ";\n";
  }
  
  public int eval( ) throws OberonException
  {
    if( this.expression != null && this.var != null && this.var instanceof VarNode )
    { // only set the value if the expression is an valid expression
      MemoryManager.set( ((VarNode)this.var).getVariableName( ), this.expression.eval( ) );      
    }
    return 0;
  }
}
