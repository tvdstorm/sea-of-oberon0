package ASTnodes;

public class DeclarationsNode implements ASTnode {
  public DeclarationsNode( ConstantNode constant )
  {
	this.constant = constant;
  }
  
  public void printNode( int depth )
  {
	if( this.constant != null )
	{
	  this.addWhitespace( depth );
	  System.out.print( "CONST " );
	  this.constant.printNode( depth );
	}
  }
  
  private void addWhitespace( int depth )
  {
	for( int i = 0; i < depth; i++ )
	  System.out.print( " " );
  }
  
  private ConstantNode constant;
}
