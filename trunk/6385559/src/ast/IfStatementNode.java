package ast;
import errorhandler.OberonException;

public class IfStatementNode implements StatementNode {
  private final ExpressionNode expression;
  private final StatementSequenceNode sequence;
  private final StatementNode elseStatement;
  
  public IfStatementNode( ExpressionNode expression, StatementSequenceNode sequence, StatementNode elseStatement )
  {
    this.expression = expression;
    this.sequence = sequence;
    this.elseStatement = elseStatement;
  }
  
  public void printNode( int depth )
  {
    for( int i = 0; i < depth; i++ )
    { // print the depth
      System.out.print( " " );
    }
  
    System.out.print( "IF " );
    if( this.expression != null )
    {
      expression.printNode( depth );
    }
  
    System.out.println( " THEN" );
    if( this.sequence != null )
    {
      this.sequence.printNode( depth+2 );
    }
  
    if( this.elseStatement != null )
    {
      for( int i = 0; i < depth; i++ )
      { // print the needed depth
        System.out.print( " " );
      }
      System.out.println( "ELSE" );
      this.elseStatement.printNode(depth+2);
    }
  
    for( int i = 0; i < depth; i++ )
    {
      System.out.print( " " );
    }
    System.out.println( "END;" );
  }
  
  public int eval( ) throws OberonException
  {
    if( this.expression.eval( ) == 1 )
    {
      if( this.sequence != null )
      {
        this.sequence.eval( );
      }
    }
    else if( this.elseStatement != null )
    {
      this.elseStatement.eval( );
    }
    return 0;
  }
}
