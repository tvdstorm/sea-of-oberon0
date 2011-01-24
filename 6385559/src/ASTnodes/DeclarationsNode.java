package ASTnodes;

public class DeclarationsNode implements ASTnode {
  public DeclarationsNode( ConstantNode constant, TypeDefNode typeDefs )
  {
	this.constant = constant;
	this.typeDefs = typeDefs;
  }
  
  public void printNode( int depth )
  {
	if( this.constant != null )
	{
	  this.addWhitespace( depth );
	  System.out.print( "CONST " );
	  this.constant.printNode( depth );
	  System.out.println();
	  this.addWhitespace( depth );
	  System.out.print( "TYPE ");
	  this.typeDefs.printNode( depth );
	  System.out.println();
	}
  }
  
  private void addWhitespace( int depth )
  {
	for( int i = 0; i < depth; i++ )
	  System.out.print( " " );
  }
  
  private ConstantNode constant = null;
  private TypeDefNode typeDefs = null; 
}
