package ASTnodes;

import java.util.Vector;

import management.ParamContainer;

public class ProcedureHeadingNode implements ASTnode {
  public ProcedureHeadingNode( String identifier, FormalParameterNode formalParams )
  {
    this.identifier = identifier;
    this.formalParams = formalParams;
  }
  
  public void printNode(int depth) {
    if( this.identifier != null )
    {
      for( int i = 0; i < depth; i++ )
      {
        System.out.print( " " );
      }
      System.out.print( "PROCEDURE " + this.identifier );
      if( this.formalParams != null )
      {
        System.out.print( "( " );
        this.formalParams.printNode( 0 ); 
        System.out.print( " )" );
      }
      System.out.println( ";" );
    }
  }
  
  public int eval( String scope ) 
  { 
    return 0; 
  }
  
  public int eval( String scope, Vector<ParamContainer> params )
  {
    // we will loop through the FormalParameterNodes and map every variable to the correstponding variable
    // in the function
    if( this.formalParams != null )
    {
      this.formalParams.eval( scope, params );
    }
    return 0;
  }
  
  public String getIdentifier()
  {
    return this.identifier;
  }

  private String identifier = null;
  private FormalParameterNode formalParams = null;
}