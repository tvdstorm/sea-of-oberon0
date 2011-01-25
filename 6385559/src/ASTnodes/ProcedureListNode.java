package ASTnodes;

public class ProcedureListNode implements ASTnode {
  public ProcedureListNode( String procedureDeclaration, ProcedureListNode procedureList )
  {
	this.procedureDeclaration = procedureDeclaration;
	this.procedureList = procedureList;
  }
	
  public void printNode(int depth) {
    if( procedureDeclaration != null )
    {
      System.out.println();
      for( int i = 0; i < depth; i++ )
    	System.out.print( " " );
      System.out.print( this.procedureDeclaration );
      System.out.println();
      System.out.println();
    }
    if( this.procedureList != null )
      this.procedureList.printNode( depth );
  }

  private String procedureDeclaration = null;
  private ProcedureListNode procedureList = null;
}
