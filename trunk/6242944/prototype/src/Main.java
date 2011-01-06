import java.io.IOException;
import java.io.StringReader;

import xtc.parser.ParseException;
import xtc.parser.Result;


public class Main {
	
	public static void main(String[] args) {
		StringReader reader = new StringReader("MODULE test; PROCEDURE foo; BEGIN a := 0; b := 1 END foo;");
		Oberon o = new Oberon(reader, "<input>");
		
		Result result;
		try {
			result = o.pModule(0);
			ast.Module module = (ast.Module)o.value(result);
			System.out.println(module);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
