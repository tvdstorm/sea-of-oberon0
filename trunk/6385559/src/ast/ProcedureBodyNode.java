package ast;

import errorhandler.OberonException;

public class ProcedureBodyNode implements ASTnode {
  private final DeclarationsNode declarations;
  private final StatementSequenceNode statements;
  private final String identifier;
  
  public ProcedureBodyNode( DeclarationsNode declarations, StatementSequenceNode statements, String identifier )
  {
    this.declarations = declarations;
    this.statements = statements;
    this.identifier = identifier;
  }

  public void printNode(int depth) 
  {
    if( this.declarations != null )
    {
      this.declarations.printNode( depth+2 );
    }
    
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
  
  public int eval( ) throws OberonException
  {
    if( this.declarations != null )
    {
      declarations.eval( );
    }
    
    if( this.statements != null )
    {
      this.statements.eval( );
    }
    return 0;
  }
  
  public String getIdentifier()
  { // return the identifier to be able to get it from the procedureManager
    return this.identifier;
  }
}
