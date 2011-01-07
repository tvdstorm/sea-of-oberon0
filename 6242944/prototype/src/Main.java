import interpreter.Interpreter;

import java.io.IOException;
import java.io.StringReader;

import xtc.parser.ParseException;
import xtc.parser.Result;


public class Main {
	
	public static void main(String[] args) {
		StringReader reader = new StringReader("MODULE test; BEGIN Write(42); IF 1<0 THEN Write(1) ELSIF 1<0 THEN Write(2) ELSIF 2<1 THEN Write(3) ELSE Write(4) END; WHILE 1<2 DO Write(111) END END test.");
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
