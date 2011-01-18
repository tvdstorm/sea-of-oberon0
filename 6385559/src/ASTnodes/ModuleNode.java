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
  
  public DeclarationsNode declarations = null;
  public StatementSequenceNode statementSequence = null;
}
