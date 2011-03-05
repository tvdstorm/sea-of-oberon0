package language;

public class Oberon {
	public static void main(String[] args) {
		
		tests();
	}
	
	private static void tests(){
		
		try {
			ProcedureParseFunc procPrsFunc = new ProcedureParseFunc();
			ModuleParseFunc modPrsFunc = new ModuleParseFunc();
			ExpressionParseFunc exprPrsFunc = new ExpressionParseFunc();
			
			Interpreter.run("-2 + 4 * 4 = 14", exprPrsFunc);
			Interpreter.run("-2 + 4 * 4 # 13", exprPrsFunc);
			Interpreter.run("-2 + 4 * 4 > 10", exprPrsFunc);
			Interpreter.run("-2 + 4 * 4 = 14", exprPrsFunc);
			
			Interpreter.run("PROCEDURE AssignIets;"
				+ "  VAR x: INTEGER; "
				+ "BEGIN "
				+ "  x := 1"
				+ "END Multiply;", procPrsFunc);
			
		
			Interpreter.run(
				"MODULE test;" + "\n"
				+ "VAR" + "\n"
				+ "  i: INTEGER;" + "\n"
				+ "  j: INTEGER;" + "\n"
				+ "PROCEDURE Swap(VAR x, y: INTEGER);" + "\n"
				+ "VAR" + "\n"
				+ "  temp: INTEGER;" + "\n"
				+ "BEGIN" + "\n"
				+ "  temp := x;" + "\n"
				+ "  x := y;" + "\n"
				+ "  y := temp" + "\n"
				+ "END Swap;" + "\n"
				+ "BEGIN" + "\n"
				+ "  i := 1;" + "\n"
				+ "  j := 2;" + "\n"
				+ "  Swap(i, j);" + "\n"
				+ "  ASSERT(j = 1);" + "\n"
				+ "END" + "\n"
				+ "END test.", modPrsFunc);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
