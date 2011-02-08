package ast;

import java.util.Vector;

import errorhandler.OberonException;
import management.MemoryManager;
import management.ScopeManager;

public class IdentListNode implements ASTnode 
{
  private final String identifier;
  private final IdentListNode followup;
  
  public IdentListNode( String identifier, IdentListNode followup )
  {
    this.identifier = identifier;
    this.followup = followup;
  }
  
  public String toString( int depth ) 
  {
    String code = "";
    if( this.identifier != null )
    {
      code += this.identifier;
    }
    
    if( this.followup != null )
    {
      code += ", " + this.followup.toString( 0 );
    }
    return code;
  }
  
  public int eval( ) throws OberonException
  {
    return 0;
  }
  
  public void allocateIdentifiers( Vector<String> elements ) throws OberonException
  { // allocate the variables that we find
    if( elements != null )
    {
      for( int i = 0; i < elements.size(); i++ )
      {
        MemoryManager.allocate( this.identifier + elements.get( i ), ScopeManager.currentScope( ), 0, null, false );
      }
    }
    else
    {
      MemoryManager.allocate( this.identifier, ScopeManager.currentScope( ), 0, null, false );
    }
    if( this.followup != null )
    {
      this.followup.allocateIdentifiers( elements );
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
}
