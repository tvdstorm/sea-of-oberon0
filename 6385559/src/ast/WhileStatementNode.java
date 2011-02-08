package ast;

import ast.expression.ExpressionNode;
import errorhandler.OberonException;

public class WhileStatementNode implements StatementNode 
{
  private final ExpressionNode cond;
  private final StatementSequenceNode executionSequence;
  
  public WhileStatementNode( ExpressionNode cond, StatementSequenceNode statements )
  {
    this.cond = cond;
    this.executionSequence = statements;
  }
  
  public String toString( int depth )
  {
    String code = "";
    code += this.addWhitespace( depth );
    
    code += "WHILE ";
    if( this.cond != null )
    {
      code += this.cond.toString( 0 );
    }
    
    code += " DO\n" ;
    if( this.executionSequence != null )
    {
      code += this.executionSequence.toString( depth+2 );
    }
    
    code += this.addWhitespace( depth ) + "END;\n";
    return code;
  }
  
  private String addWhitespace( int depth )
  {
    String whitespace = "";
    for( int i = 0; i < depth; i++ )
    {
      whitespace = whitespace + " ";
    }
    return whitespace;
  }
  
  public int eval( ) throws OberonException
  {
    while( cond.eval( ) == 1 )
    {
      if( this.executionSequence != null )
      {
        this.executionSequence.eval( );
      }
    }
    return 0;
  }
}
