package ast;

import errorhandler.OberonException;
import management.MemoryManager;

public class AssignmentNode implements StatementNode 
{
  private final VarNode var;
  private final ExpressionNode expression;
  
  public AssignmentNode( VarNode var, ExpressionNode expression )
  {
    this.var = var;
    this.expression = expression;
  }
  
  public String ToString( int depth )
  {
    String code = "";
    for( int i = 0; i < depth; i++ )
    {
      code += " ";
    }
    if( this.var != null )
    {
      code += this.var.ToString( 0 );
    }
    code += " := ";
    if( this.expression != null )
    {
      code += this.expression.ToString( depth );
    }
    return code + ";\n";
  }
  
  public int eval( ) throws OberonException
  {
    if( this.expression != null && this.var != null )
    { // only set the value if the expression is an valid expression
      MemoryManager.set( this.var.getVarname( ), this.expression.eval( ) );      
    }
    return 0;
  }
}
