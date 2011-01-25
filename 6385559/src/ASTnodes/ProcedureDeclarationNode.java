package ASTnodes;

public class ProcedureDeclarationNode implements ASTnode {
  public ProcedureDeclarationNode( ProcedureHeadingNode heading, ProcedureBodyNode body )
  {
	this.heading = heading;
	this.body = body;
  }
	
  public void printNode(int depth) {
    if( this.heading != null )
    {
      this.heading.printNode( depth );
    }
    if( this.body != null )
    {
      this.body.printNode( depth );
    }
  }

  public void addWhitespace( int depth )
  {
	for( int i = 0; i < depth; i++ )
	  System.out.print( " " );
  }
  
  private ProcedureHeadingNode heading = null;
  private ProcedureBodyNode body = null;
}
