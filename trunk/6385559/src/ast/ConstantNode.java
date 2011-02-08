package ast;

import ast.expression.ExpressionNode;
import errorhandler.OberonException;
import management.MemoryManager;
import management.ScopeManager;

public class ConstantNode implements ASTnode 
{
  private final String identifier;
  private final ExpressionNode expression;
  private final ConstantNode constant;
  
  public ConstantNode( String identifier, ExpressionNode expression, ConstantNode constant )
  {
    this.identifier = identifier;
    this.expression = expression;
    this.constant = constant;
  }
  
  public String toString( int depth ) 
  {
    String code = "";
    if( this.identifier != null )
    {
      code += this.identifier + " = ";
    }
    if( this.expression != null )
    {
      code += this.expression.toString( 0 );
    }
    code += "; ";
    if( this.constant != null )
    {
      code += this.constant.toString( 0 );
    }
    return code;
  }
  
  public int eval( ) throws OberonException
  {
    // put the Constant in the memory, give the isConstant true, makes the element not changable
    MemoryManager.allocate( this.identifier, ScopeManager.currentScope( ), this.expression.eval( ), null, true );
    if( this.constant != null )
    {
      this.constant.eval( );
    }
    return 0;
  }
}
