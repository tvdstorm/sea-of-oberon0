package ASTnodes;

import org.antlr.runtime.*;
import parseErrorLog.*;

public class ModuleNode implements ASTnode{
  public ModuleNode( String idn1, String idn2, DeclarationsNode declarations, StatementSequenceNode statementSequence ) throws RecognitionException
  {
	if( idn1.compareTo( idn2 ) != 0 ) // validate end and start symbols of the module
	{
	  parseErrorLog.addMessage( "Module has no end." );
	}
	
	this.declarations = declarations;
	this.statementSequence = statementSequence;
  }

  public void printNode()
  {
	System.out.println( "MODULE x;");
	if( this.declarations != null )
      this.declarations.printNode();
	if( this.statementSequence != null )
	  this.statementSequence.printNode();
	System.out.println( "END x.");
  }
  
  private DeclarationsNode declarations = null;
  private StatementSequenceNode statementSequence = null;
}
