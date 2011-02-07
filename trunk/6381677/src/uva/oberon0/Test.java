package uva.oberon0;

import org.antlr.runtime.RecognitionException;

import uva.oberon0.abstractsyntax.declarations.Module;
import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.parser.Helper;
import uva.oberon0.parser.OberonParser;
import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.ValueInt;

/**
 * @author Chiel Labee Test class for running unit test on the Oberon0 parser
 *         and interpreter.
 */
public class Test {
	private static void runTest(String name, String text) {
		runTest(name, text, 1);
	}

	private static void runTest(String name, String text, int resultExpected) {
		String codeBody = text;

		if (codeBody.indexOf("BEGIN") == -1)
			codeBody = "BEGIN " + codeBody + " END";

		String code = "MODULE runTest; " + codeBody + " runTest.";

		Module module = Helper.createModuleFromText(code);

		if (module == null) {
			System.out.println("ERROR: Unable to implode [" + name + "].");
			assert false;
			return;
		}

		Scope scope = module.createScope();
		scope.putBindable(new ID("r"), new ValueInt());
		module.eval(scope);

		int result = scope.getValue(new ID("r"));
		if (result != resultExpected) {
			System.out.println("ERROR: Unable to evaluate [" + name + "].");
			assert false;
			return;
		}

		System.out.println("OK: Test [" + name + "].");
	}

	/**
	 * Runs all unit tests.
	 */
	public static void testAll() {
		testExpressions();
		testStatements();
		testSmokeFragments();
	}

	private static void runTestExpression(String name, String text,
			int resultExpected) {
		OberonParser parser = Helper.createParserFromText(text);
		int result = 0;

		try {
			result = parser.expression().eval(new Scope());
		} catch (RecognitionException e) {
			e.printStackTrace();
		}

		if (result != resultExpected) {
			System.out.println("ERROR: Unable to evaluate [" + name + "].");
			assert false;
			return;
		}

		System.out.println("OK: Test [" + name + "].");
	}

	/**
	 * Runs the Expression unit tests.
	 */
	public static void testExpressions() {
		runTestExpression("Expression Equals", "1 = 1", 1);
		runTestExpression("Expression Equals", "1 = 0", 0);
		runTestExpression("Expression Not Equals", "1 # 0", 1);
		runTestExpression("Expression Not Equals", "1 # 1", 0);
		runTestExpression("Expression Greather Than", "1 > 0", 1);
		runTestExpression("Expression Greather Than", "1 > 1", 0);
		runTestExpression("Expression Greather Than Or Equals", "1 >= 0", 1);
		runTestExpression("Expression Greather Than Or Equals", "1 >= 1", 1);
		runTestExpression("Expression Greather Than Or Equals", "1 >= 2", 0);
		runTestExpression("Expression Less Than", "0 < 1", 1);
		runTestExpression("Expression Less Than", "0 <= 1", 1);
		runTestExpression("Expression Less Than", "0 <= 0", 1);
		runTestExpression("Expression Less Than", "1 < 1", 0);

		runTestExpression("Expression Calc Addition", "1 + 1", 2);
		runTestExpression("Expression Calc Addition", "2 + 1", 3);
		runTestExpression("Expression Calc Addition", "1 + 1 = 3", 0);
		runTestExpression("Expression Calc Subtraction", "1 - 1", 0);
		runTestExpression("Expression Calc Subtraction", "5 - 1", 4);
		runTestExpression("Expression Calc Modulo", "5 MOD 4", 1);
		runTestExpression("Expression Calc Modulo", "6 MOD 4", 2);
		runTestExpression("Expression Calc Multiplication", "2 * 2", 4);
		runTestExpression("Expression Calc Multiplication", "3 * 2", 6);
		runTestExpression("Expression Calc Division", "4 DIV 2", 2);
		runTestExpression("Expression Calc Division", "(8 DIV 2) DIV 2", 2);
		runTestExpression("Expression Calc Division",
				"(4+(2+2)) DIV (2+(1+1))", 2);

		runTestExpression("Expression And", "1 & 1", 1);
		runTestExpression("Expression And", "1 & 0", 0);
		runTestExpression("Expression And", "1 & 0 = 0", 1);
		runTestExpression("Expression And", "0 & 0 = 0", 1);
		runTestExpression("Expression Or", "1 OR 1", 1);
		runTestExpression("Expression Or", "1 OR 0", 1);
		runTestExpression("Expression Or", "0 OR 0 = 0", 1);
		runTestExpression("Expression Or", "0 OR 0", 0);
	}

	/**
	 * Runs the Statement unit tests.
	 */
	public static void testStatements() {
		runTest("Statement Assign", "r:=1", 1);
		runTest("Statement Assign with Expression", "r:=1+1", 2);
		runTest("Statement Multiple Assign",
				"VAR i,i2,i3: INTEGER; BEGIN i:=1;i2:=2; i3:=3; r:=((i = 1) & (i2 = 2) & (i3 = 3)) END");
		runTest("Statement Complex Assign",
				"VAR i,i2: INTEGER; BEGIN i2:=3; i:=i2; r:=((i = 3) & (i = i2)) END");
		runTest("Statement Complex Assign",
				"VAR i,i2: INTEGER; BEGIN i2:=2; i:=i2+1; r:=((i = 3) & (i # i2) & (i = i2+1)) END");
		runTest("Statement Array Assign",
				"VAR array: ARRAY 1 OF INTEGER; BEGIN array[0]:=1; r:=array[0] END");
		runTest("Statement Array Assign",
				"VAR array: ARRAY 2 OF INTEGER; i: INTEGER; BEGIN i:=1; array[i]:=1; r:=array[i] END");
		runTest("Statement Record Assign",
				"VAR i: RECORD test: INTEGER END; BEGIN i.test:=1; r:=i.test END");
		runTest("Statement Complex Record Assign",
				"VAR i: RECORD test1,test2: INTEGER END; BEGIN i.test1:=1; i.test2:=2; r:=((i.test1=1) & (i.test2=2)) END");
		runTest("Statement Type Record Assign",
				"TYPE rec=RECORD test1,test2: INTEGER END; VAR i: rec; BEGIN i.test1:=1; i.test2:=2; r:=((i.test1=1) & (i.test2=2)) END");
		runTest("Statement ByValue Assign",
				"VAR i,i2: INTEGER; "
						+ "PROCEDURE SetValue(x, y :INTEGER); BEGIN x:=y END SetValue; "
						+ "BEGIN i:=2; i2:=3; SetValue(i,i2); r:=((i = 2) & (i # i2)) END");
		runTest("Statement ByReference Assign",
				"VAR i,i2: INTEGER; "
						+ "PROCEDURE SetValue(VAR x, y :INTEGER); BEGIN x:=y END SetValue; "
						+ "BEGIN i2:=3; SetValue(i,i2); r:=((i = 3) & (i = i2)) END");
		runTest("Statement Array Assign with Int Index",
				"VAR i: ARRAY 1 OF INTEGER; BEGIN i[0]:=1; r:=(i[0] = 1) END");
		runTest("Statement Array Assign with Var Index",
				"VAR i: ARRAY 2 OF INTEGER; VAR i2,x: INTEGER; BEGIN i2:=1; x:=10; i[i2]:=x; r:=(i[i2] = x) END");

		runTest("Statement IF", "IF 1=1 THEN r:=(1) END");
		runTest("Statement IF with ELSE", "IF 1=1 THEN r:=(1) ELSE r:=(0) END");
		runTest("Statement IF return on ELSE",
				"IF 1=0 THEN r:=(0) ELSE r:=(1) END");
		runTest("Statement IF with ELSIF",
				"IF 1=1 THEN r:=(1) ELSIF 1=0 THEN r:=(0) END");
		runTest("Statement IF return on ELSIF",
				"IF 1=0 THEN r:=(0) ELSIF 1=1 THEN r:=(1) END");
		runTest("Statement IF with ELSIF and ELSE",
				"IF 1=1 THEN r:=(1) ELSIF 1=0 THEN r:=(0) ELSE r:=(0) END");
		runTest("Statement IF with ELSIF and ELSE",
				"IF 1=0 THEN r:=(0) ELSIF 1=1 THEN r:=(1) ELSE r:=(0) END");
		runTest("Statement IF with ELSIF and ELSE",
				"IF 1=0 THEN r:=(0) ELSIF 0=1 THEN r:=(0) ELSE r:=(1) END");

		runTest("Statement WHILE",
				"VAR i: INTEGER; BEGIN i:=0; WHILE i<3 DO i:=i+1 END; r:=(i = 3) END");
		runTest("Statement WHILE",
				"VAR i,i2: INTEGER; BEGIN i:=0; i2:=3; WHILE i<i2 DO i:=i+1 END; r:=((i = 3) & (i = i2)) END");
	}

	/**
	 * Runs Smoke implementation tests.
	 */
	public static void testSmokeFragments() {
		runTest("Fragment Swap", "VAR i, j: INTEGER; "
				+ "PROCEDURE Swap(VAR x, y: INTEGER); " + "VAR temp: INTEGER; "
				+ "BEGIN " + "temp := x; " + "x := y; " + "y := temp "
				+ "END Swap;"
				+ "BEGIN i:=0; j:=1; Swap(i,j); r:=((i = 1) & (j = 0)) END");
	}
}
