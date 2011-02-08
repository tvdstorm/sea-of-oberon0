package ast;

import java.util.Vector;

import ast.expression.ExpressionNode;
import ast.expression.VarNode;

import management.MemoryManager;
import management.ScopeManager;
import errorhandler.OberonException;

public class WithStatementNode implements StatementNode 
{
  private final ExpressionNode expr;
  private final StatementSequenceNode sequence;
  
  public WithStatementNode( ExpressionNode expr, StatementSequenceNode sequence )
  {
    this.expr = expr;
    this.sequence = sequence;
  }
  
  public String toString(int depth) 
  {
    return "WITH " + this.expr.toString( 0 ) + " DO\n" + this.sequence.toString( depth+2 ) + "END;\n";
  }

  public int eval() throws OberonException 
  {
    String varname = null;
    if( this.expr instanceof VarNode )
    {
      varname = ((VarNode)this.expr).getVariableName();
    }
    else
    {
      throw new OberonException( "Invalid input given on WITH DO statement." );
    }
    
    String newScope = "DOWITH_" + ScopeManager.currentScope( );
    ScopeManager.setScope( newScope );
    Vector<String> childrenList = MemoryManager.getChildren( varname );
    
    String newName = "";
    String oldName = "";
    for( int i = 0; i < childrenList.size(); i++ )
    {
      oldName = childrenList.get( i );
      newName = childrenList.get( i ).replace( varname + ".", "" );
      
      MemoryManager.allocate( newName, newScope, 0, oldName, false );
    }
    
    if( this.sequence != null )
    {
      this.sequence.eval();
    }
    
    ScopeManager.removeLastScope();
    
    return 0;
  }

}
