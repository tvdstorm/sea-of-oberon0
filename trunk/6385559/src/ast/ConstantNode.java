package ast;

import errorhandler.OberonException;
import management.MemoryManager;
import management.ScopeManager;

public class ConstantNode implements ASTnode {
  private final String identifier;
  private final ExpressionNode expression;
  private final ConstantNode constant;
  
  public ConstantNode( String identifier, ExpressionNode expression, ConstantNode constant )
  {
    this.identifier = identifier;
    this.expression = expression;
    this.constant = constant;
  }
  
  public void printNode(int depth) {
    if( this.identifier != null )
    {
      System.out.print( this.identifier + " = " );
    }
    if( this.expression != null )
    {
      this.expression.printNode( 0 );
    }
    System.out.print( "; " );
    if( this.constant != null )
    {
      this.constant.printNode( 0 );
    }
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
