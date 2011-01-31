package ASTnodes;

import errorhandler.OberonException;

public class WhileStatementNode implements StatementNode {
  private final ExpressionNode cond;
  private final StatementSequenceNode executionSequence;
  
  public WhileStatementNode( ExpressionNode cond, StatementSequenceNode statements )
  {
    this.cond = cond;
    this.executionSequence = statements;
  }
  
  public void printNode( int depth )
  {
    for( int i = 0; i < depth; i++ )
    { // print the needed depth
      System.out.print( " " );
    }
    
    System.out.print( "WHILE " );
    if( this.cond != null )
    {
      this.cond.printNode( 0 );
    }
    
    System.out.println( " DO" );
    if( this.executionSequence != null )
    {
      this.executionSequence.printNode( depth+2 );
    }
    
    for( int i = 0; i < depth; i++ )
    {
      System.out.print( " " );
    }
    System.out.println( "END;");
  }
  
  public int eval( String scope ) throws OberonException
  {
    while( cond.eval( scope ) == 1 )
    {
      if( this.executionSequence != null )
      {
        this.executionSequence.eval( scope );
      }
    }
    return 0;
  }
}
