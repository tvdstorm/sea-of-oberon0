import interpreter.Interpreter;

import java.io.IOException;
import java.io.StringReader;

import xtc.parser.ParseException;
import xtc.parser.Result;


public class Main {
	
	public static void main(String[] args) {
		StringReader reader = new StringReader("MODULE test; CONST foo = 10; bar = 12; BEGIN Write(foo); Write(bar) END test.");
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
		Interpreter interpreter = new Interpreter();
		interpreter.interpret(module);
	}
}
