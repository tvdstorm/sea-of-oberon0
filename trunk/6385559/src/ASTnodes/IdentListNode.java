package ASTnodes;

import java.util.Vector;
import parseErrorLog.OberonException;
import management.MemoryManager;

public class IdentListNode implements ASTnode {
  public IdentListNode( String identifier, IdentListNode followup )
  {
    this.identifier = identifier;
    this.followup = followup;
  }
  
  public void printNode(int depth) 
  {
    if( this.identifier != null )
    {
      System.out.print( this.identifier );
    }
    
    if( this.followup != null )
    {
      System.out.print( ", " );
      this.followup.printNode( 0 );
    }
  }
  
  public int eval( String scope ) throws OberonException
  {
    return 0;
  }
  
  public void allocateIdentifiers( String scope, Vector<String> elements ) throws OberonException
  { // allocate the variables that we find
    if( elements != null )
    {
      for( int i = 0; i < elements.size(); i++ )
      {
        MemoryManager.allocate( this.identifier + elements.get( i ), scope, 0, null, false );
      }
    }
    else
    {
      MemoryManager.allocate( this.identifier, scope, 0, null, false );
    }
    if( this.followup != null )
    {
      this.followup.allocateIdentifiers( scope, elements );
    }
  }
  
  public Vector<String> getIdentList()
  { // get the identifier list if its not a direct variable but part of the RECORD type
    Vector<String> elements;
    if( this.followup == null )
    {
      elements = new Vector<String>(0);
    }
    else
    {
      elements = this.followup.getIdentList();
    }
    elements.add( "." + this.identifier ); // this will only be called for the record type
    return elements;
  }
  
  public Vector<String> getFormalIdentList()
  { // if they are part of the formal parameters get a list of all formal parameters
    Vector<String> elements;
    if( this.followup == null )
    {
      elements = new Vector<String>(0);
    }
    else
    {
      elements = this.followup.getFormalIdentList();
    }
    elements.add( this.identifier ); // this will only be called for the record type
    return elements;
  }

  private String identifier = null;
  private IdentListNode followup = null;
}
