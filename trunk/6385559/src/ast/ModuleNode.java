package ast;

import management.ScopeManager;

import org.antlr.runtime.*;

import errorhandler.*;

public class ModuleNode implements ASTnode
{
  private final DeclarationsNode declarations;
  private final StatementSequenceNode statementSequence;
  private final String ModuleName;
  
  public ModuleNode( String idn1, String idn2, DeclarationsNode declarations, StatementSequenceNode statementSequence ) throws RecognitionException
  {
    if( idn1.compareTo( idn2 ) != 0 ) 
    { // validate end and start symbols of the module to force correct code
      Errorlog.addMessage( "Module " + idn1 + " has ended with " + idn2 + "." );
    }
  
    this.ModuleName = idn1;
    this.declarations = declarations;
    this.statementSequence = statementSequence;
  }

  public String toString( int depth )
  {
    String code = "MODULE " + this.ModuleName + ";";
    if( this.declarations != null )
    {
      code += this.declarations.toString( depth+2 );
    }
  
    code += "BEGIN";
    if( this.statementSequence != null )
    {
      code += this.statementSequence.toString( depth+2 );
    }
  
    return code + "END " + this.ModuleName + ".";
  }
  
  public int eval( ) throws OberonException
  {
    ScopeManager.setScope( this.ModuleName );
    if( this.declarations != null )
    {
      declarations.eval( );
    }
    
    if( this.statementSequence != null )
    {
      this.statementSequence.eval( );
    }
    
    return 0;
  }
}
