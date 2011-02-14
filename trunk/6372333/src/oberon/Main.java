package oberon;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.util.ArrayList;
import java.util.List;

import oberon.convert.ModuleConverter;
import oberon.exceptions.ProcedureParamaterCountMismatchException;
import oberon.lexer.Lexer;
import oberon.lexer.LexerException;
import oberon.node.Start;
import oberon.parser.Parser;
import oberon.parser.ParserException;

/**
 * The Main class of the package, use this class to run the program.
 */
public class Main { 
   
   /**
    * The main method.
    *
    * @param the args supplied from the command line
 * @throws ProcedureParamaterCountMismatchException 
    */
   public static void main(final String[] args) { 
      if (args.length > 0) { 
		/* Form our AST */ 
		Lexer lexer = null;
		try {
			lexer = new Lexer (new PushbackReader( 
			   new FileReader(args[0]), 1024));
			
			runParser(lexer);
		}			
		catch (Exception e) {
			e.printStackTrace();
		}
      } 
      else { 
         System.err.println("usage: java simpleAdder inputFile"); 
         System.exit(1); 
      } 
   }
   
	/**
	 * Run parser.
	 *
	 * @param lexer the lexer
	 * @return the i procedure
	 * @throws ParserException the parser exception
	 * @throws LexerException the lexer exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static IProcedure runParser(Lexer lexer) throws ParserException,
			LexerException, IOException {
		IProcedure mainProc = getMain(lexer);
		
		Scope newScope = new Scope();
		final List<IExpression> paramList = new ArrayList<IExpression>();
			 
		for (IProcedure sysProc : ModuleConverter.getSystemProcedures()){
			newScope.addSystemProcedure(sysProc);
		}
		
		mainProc.call(newScope, paramList);
		
		return mainProc;
	}

	public static IProcedure getMain(Lexer lexer) throws ParserException, LexerException, IOException {
		final Parser parser = new Parser(lexer); 
		Start ast = null;
		ast = parser.parse();
	 
		/* Get our Interpreter going. */ 
		final ModuleConverter converter = new ModuleConverter();
		ast.apply(converter);	
		
		final IProcedure mainProc = converter.buildInterpreterResult();
		
		return mainProc;
	}
}