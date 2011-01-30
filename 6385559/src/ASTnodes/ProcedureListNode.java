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
    {
      this.procedureList.printNode( depth );
    }
  }
  
  public int eval( String scope )
  {
    if( this.procedureDeclaration != null )
    {
      this.procedureDeclaration.eval( scope );
    }
    if( this.procedureList != null )
    {
      this.procedureList.eval( scope );
    }
    return 0;
  }

  private ProcedureDeclarationNode procedureDeclaration = null;
  private ProcedureListNode procedureList = null;
}
