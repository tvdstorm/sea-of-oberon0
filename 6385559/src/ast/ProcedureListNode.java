package ast;
import errorhandler.OberonException;

public class ProcedureListNode implements ASTnode {
  private final ProcedureDeclarationNode procedureDeclaration;
  private final ProcedureListNode procedureList;
  
  public ProcedureListNode( ProcedureDeclarationNode procedureDeclaration, ProcedureListNode procedureList )
  {
    this.procedureDeclaration = procedureDeclaration;
    this.procedureList = procedureList;
  }
  
  public void printNode(int depth) {
    if( procedureDeclaration != null )
    {
      this.procedureDeclaration.printNode( depth );
      System.out.println();
    }
    
    if( this.procedureList != null )
    {
      this.procedureList.printNode( depth );
    }
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
