package ASTnodes;

public class IfStatementNode implements StatementNode {
  public IfStatementNode( ExpressionNode expression, StatementSequenceNode sequence, StatementNode elseStatement )
  {
	this.expression = expression;
	this.sequence = sequence;
	this.elseStatement = elseStatement;
  }
  
  public void printNode( int depth )
  {
	for( int i = 0; i < depth; i++ )
	  System.out.print( " " );
	
	System.out.print( "IF " );
	if( this.expression != null )
	  expression.printNode( depth );
	System.out.println( " THEN" );
	if( this.sequence != null )
	  this.sequence.printNode( depth+2 );
	if( this.elseStatement != null )
	{
	  for( int i = 0; i < depth; i++ )
		System.out.print( " " );
	  System.out.println( "ELSE" );
	  this.elseStatement.printNode(depth+2);
	}
	for( int i = 0; i < depth; i++ )
	  System.out.print( " " );
	System.out.println( "END;" );
  }
  
  public int eval( String scope )
  {
	if( this.expression.eval( scope ) == 1 )
	{
      if( this.sequence != null )
      {
	    this.sequence.eval( scope );
      }
	}
	else if( this.elseStatement != null )
	{
	  this.elseStatement.eval( scope );
	}
    return 0;
  }
  
  private ExpressionNode expression = null;
  private StatementSequenceNode sequence = null;
  private StatementNode elseStatement = null;
}
