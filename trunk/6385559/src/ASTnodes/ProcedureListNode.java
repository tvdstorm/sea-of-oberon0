package ASTnodes;

public class ProcedureListNode implements ASTnode {
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
      this.procedureList.printNode( depth );
  }

  private ProcedureDeclarationNode procedureDeclaration = null;
  private ProcedureListNode procedureList = null;
}
