package ASTnodes;

public class DeclarationsNode implements ASTnode {
  public DeclarationsNode( ConstantNode constant, TypeDefNode typeDefs, FieldsNode vars, ProcedureListNode procedureList )
  {
	this.constant = constant;
	this.typeDefs = typeDefs;
	this.vars = vars;
	this.procedureList = procedureList;
  }
  
  public void printNode( int depth )
  {
	if( this.constant != null )
	{
	  this.addWhitespace( depth );
	  System.out.print( "CONST " );
	  this.constant.printNode( depth );
	  System.out.println();
	}
	
	if( this.typeDefs != null )
	{
	  this.addWhitespace( depth );
	  System.out.print( "TYPE ");
	  this.typeDefs.printNode( depth );
	  System.out.println();
	}
	
	if( this.vars != null )
	{
	  this.addWhitespace( depth );
	  System.out.print( "VAR ");
	  this.vars.printNode( depth );
	  System.out.println();
	}
	
	if( this.procedureList != null )
	{
	  System.out.println();
	  this.procedureList.printNode( depth );
	}
  }
  
  private void addWhitespace( int depth )
  {
	for( int i = 0; i < depth; i++ )
	  System.out.print( " " );
  }
  
  public int eval( String scope )
  {
	if( this.constant != null )
	{
      this.constant.eval( scope );
	}
	
	if( this.typeDefs != null )
	{
      this.typeDefs.eval( scope );
	}
	
    if( this.vars != null )
    {
      this.vars.eval( scope );
    }
    
    if( this.procedureList != null )
    {
      this.procedureList.eval( scope );
    }
    return 0;
  }
  
  private ConstantNode constant = null;
  private TypeDefNode typeDefs = null; 
  private FieldsNode vars = null;
  private ProcedureListNode procedureList = null;
}
