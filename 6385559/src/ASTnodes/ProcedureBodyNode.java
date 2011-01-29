package ASTnodes;

public class ProcedureBodyNode implements ASTnode {
  public ProcedureBodyNode( DeclarationsNode declarations, StatementSequenceNode statements, String identifier )
  {
    this.declarations = declarations;
    this.statements = statements;
    this.identifier = identifier;
  }

  public void printNode(int depth) {
    if( this.declarations != null )
      this.declarations.printNode( depth+2 );
    if( this.statements != null )
    {
      for( int i = 0; i < depth; i++ )
      {
        System.out.print( " " );
      }
      System.out.println( "BEGIN" );
      this.statements.printNode( depth+2 );
    }
    if( this.identifier != null )
    {
      for( int i = 0; i < depth; i++ )
    	System.out.print( " " );
      System.out.println( "END " + this.identifier + ";" );
    }
  }
  
  public int eval( String scope )
  {
    return 0;
  }
  
  public String getIdentifier()
  {
    return this.identifier;
  }

  private DeclarationsNode declarations = null;
  private StatementSequenceNode statements = null;
  private String identifier = null;
}
