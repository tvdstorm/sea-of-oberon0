package oberon;

import java.io.FileReader;
import java.io.PushbackReader;
import java.util.LinkedList;
import java.util.Queue;

import oberon.exceptions.UnsupportedException;
import oberon.interpret.ModuleInterpreter;
import oberon.lexer.Lexer;
import oberon.node.Start;
import oberon.parser.Parser;

/**
 * The Main class of the package, use this class to run the program.
 */
public class Main { 
   
   /**
    * The main method.
    *
    * @param the args supplied from the command line
 * @throws UnsupportedException 
    */
   public static void main(final String[] args) throws UnsupportedException { 
      if (args.length > 0) { 
		/* Form our AST */ 
		Lexer lexer = null;
		try {
			lexer = new Lexer (new PushbackReader( 
			   new FileReader(args[0]), 1024));
			
			final Parser parser = new Parser(lexer); 
			Start ast = null;
			ast = parser.parse();
		 
			/* Get our Interpreter going. */ 
			final ModuleInterpreter interpreter = new ModuleInterpreter();
			ast.apply(interpreter);	
			
			Scope newScope = new Scope();
			
			ReadProcedure.initialize(newScope);
			WriteCall.initialize(newScope);
			WriteLnCall.initialize(newScope);
			
			final IProcedure mainProc = interpreter.buildInterpreterResult();
			final Queue<IExpression> paramList = new LinkedList<IExpression>();
				 
			mainProc.call(newScope, paramList);
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
}