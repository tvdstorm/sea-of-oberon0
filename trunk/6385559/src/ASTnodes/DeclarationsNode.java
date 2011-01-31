package ASTnodes;
import errorhandler.OberonException;

public class DeclarationsNode implements ASTnode {
  private final ConstantNode constant;
  private final TypeDefNode typeDefs; 
  private final FieldsNode vars;
  private final ProcedureListNode procedureList;
  
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
  { // used for the print function to make sure that the correct idention is used
    for( int i = 0; i < depth; i++ )
    {
      System.out.print( " " );
    }
  }
  
  public int eval( String scope ) throws OberonException
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
}
