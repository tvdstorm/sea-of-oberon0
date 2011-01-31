package ASTnodes;

import management.MemoryManager;
import parseErrorLog.OberonException;

public class ConstantNode implements ASTnode {
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
  
  public int eval( String scope ) throws OberonException
  {
    // put the Constant in the memory, give the isConstant true, makes the element not changable
    MemoryManager.allocate( this.identifier, scope, this.expression.eval(scope), null, true );
    if( this.constant != null )
    {
      this.constant.eval( scope );
    }
    return 0;
  }

  private String identifier = null;
  private ExpressionNode expression = null;
  private ConstantNode constant = null;
}
