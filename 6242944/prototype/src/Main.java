import interpreter.Context;
import interpreter.Interpreter;

import java.io.IOException;
import java.io.StringReader;

import xtc.parser.ParseException;
import xtc.parser.Result;


public class Main {
	
	public static void main(String[] args) {
		StringReader reader = new StringReader("MODULE test; " +
					"PROCEDURE f(); CONST i = 10; BEGIN Write(i); Write(i+1) END f;" +
					"BEGIN f(10); f(10); Write(11) " +
					"END test.");
		Oberon o = new Oberon(reader, "<input>");
		
		ast.Module module = null;
		
		try {
			Result result = o.pModule(0);
			module = (ast.Module)o.value(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//FIXME: move this
		Context ctx = new Context();
		Interpreter interpreter = new Interpreter(ctx);
		interpreter.initBuiltins();
		interpreter.interpret(module);
	}
}
