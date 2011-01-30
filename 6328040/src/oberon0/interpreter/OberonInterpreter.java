package oberon0.interpreter;

import generated.*;

import java.io.IOException;
import java.util.ArrayList;

import oberon0.ast.NodeChecker;
import oberon0.ast.OberonAST;
import oberon0.exceptions.UnexpectedNodeException;
import oberon0.listener.InterpreterListener;
import oberon0.routines.Routine;
import oberon0.variables.*;

import org.antlr.runtime.*;

/* TODO - returnvalue for arrays doesnt work!
 * TODO - Make const work for multiple data
 * TODO - Built-in Procedures -> Read() doesnt work yet!
 * TODO - Allow declaration of BOOLEAN in grammar (not specified directly)
 * TODO - implement -i
 * TODO - implement RECORD
 * TODO - implement TYPE
 * TODO      TYPEDECL
 * TODO      REFVAR
 * TODO      BOOLEAN		
 * 
 * TODO - Add defensive strategies (especially check typecast)
 * 					+ correct use of listener + exceptions
 *
 * TODO - finish array for multiple datatypes
 * 
 * TODO - refactor Routine
 * TODO - sort grammar + tokens
 * TODO - run tools
 */

public class OberonInterpreter{
	
    private InterpreterListener _listener = 					// default response to messages
        new InterpreterListener();
    
    OberonAST _root;               								// the AST represents our code memory
    TokenRewriteStream tokens;
    Oberon0Lexer lex;              								// lexer/parser are part of the processor
    Oberon0Parser parser;

    public void interp(ANTLRFileStream inputfile) throws RecognitionException, IOException {
        lex = new Oberon0Lexer(inputfile);
        tokens = new TokenRewriteStream(lex);
        parser = new Oberon0Parser(tokens);
        parser.setTreeAdaptor(OberonAST.Oberon0Adaptor);
        Oberon0Parser.oberonprogram_return r = parser.oberonprogram();
        
        if ( parser.getNumberOfSyntaxErrors()==0 ) {
            _root = (OberonAST)r.getTree();
            programBlock(_root);
        }
    }
    
	public void programBlock(OberonAST tree) {
        try {
			NodeChecker.checkExpectedNodeType(Oberon0Parser.OBERONPROGRAM, tree.getType());
		} catch (UnexpectedNodeException e) {
			_listener.error("not an Oberon0Program root-node "+tree.toStringTree(), e);
		}
        
        ArrayList<IReadableVar> parameterList = null;
        Routine program = new Routine("Oberon0Program", tree, null);
        program.call(parameterList);
    }
}
