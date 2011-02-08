package ast;
import errorhandler.OberonException;

public class ProcedureListNode implements ASTnode 
{
  private final ProcedureDeclarationNode procedureDeclaration;
  private final ProcedureListNode procedureList;
  
  public ProcedureListNode( ProcedureDeclarationNode procedureDeclaration, ProcedureListNode procedureList )
  {
    this.procedureDeclaration = procedureDeclaration;
    this.procedureList = procedureList;
  }
  
  public String toString( int depth ) 
  {
    String code = "";
    if( procedureDeclaration != null )
    {
      code += this.procedureDeclaration.toString( depth ) + "\n";
    }
    
    if( this.procedureList != null )
    {
      code += this.procedureList.toString( depth );
    }
    return code;
  }
  
  public int eval( ) throws OberonException
  {
    if( this.procedureDeclaration != null )
    {
      this.procedureDeclaration.eval( );
    }
    if( this.procedureList != null )
    {
      this.procedureList.eval( );
    }
    return 0;
  }
}
