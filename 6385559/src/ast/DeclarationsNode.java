package ast;
import errorhandler.OberonException;

public class DeclarationsNode implements ASTnode 
{
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
  
  public String toString( int depth )
  {
    String code = "";
    if( this.constant != null )
    {
      code += this.addWhitespace( depth ) + "CONST " + this.constant.toString( depth ) + "\n";
    }
  
    if( this.typeDefs != null )
    {
      code += this.addWhitespace( depth ) + "TYPE " + this.typeDefs.toString( depth ) + "\n";
    }
  
    if( this.vars != null )
    {
      code += this.addWhitespace( depth ) + "VAR " + this.vars.toString( depth ) + "\n";
    }
  
    if( this.procedureList != null )
    {
      code += "\n" + this.procedureList.toString( depth );
    }
    return code;
  }
  
  private String addWhitespace( int depth )
  { // used for the print function to make sure that the correct idention is used
    String code = "";
    for( int i = 0; i < depth; i++ )
    {
      code += " ";
    }
    return code;
  }
  
  public int eval( ) throws OberonException
  {
    if( this.constant != null )
    {
      this.constant.eval( );
    }
  
    if( this.typeDefs != null )
    {
      this.typeDefs.eval( );
    }
  
    if( this.vars != null )
    {
      this.vars.eval( );
    }
    
    if( this.procedureList != null )
    {
      this.procedureList.eval( );
    }
    return 0;
  }
}
