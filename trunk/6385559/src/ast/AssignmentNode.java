package ast;

import errorhandler.OberonException;
import management.MemoryManager;

public class AssignmentNode implements StatementNode {
  private final VarNode var;
  private final ExpressionNode expression;
  
  public AssignmentNode( VarNode var, ExpressionNode expression )
  {
    this.var = var;
    this.expression = expression;
  }
  
  public void printNode( int depth )
  {
    for( int i = 0; i < depth; i++ )
    {
      System.out.print( " " );
    }
    if( this.var != null )
    {
      this.var.printNode( 0 );
    }
    System.out.print( " := " );
    if( this.expression != null )
    {
      this.expression.printNode( depth );
    }
    System.out.println( ";" );
  }
  
  public int eval( String scope ) throws OberonException
  {
    if( this.expression != null && this.var != null )
    { // only set the value if the expression is an valid expression
      MemoryManager.set( this.var.getVarname( scope ), this.expression.eval( scope ) );      
    }
    return 0;
  }
}
