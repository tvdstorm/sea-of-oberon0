import ANTLR.Helper;
import AbstractSyntax.Structure.Module;


/**
 * @author Chiel Labee
 * Test class for running unit test on the Oberon0 parser and interpreter.
 */
public class Test 
{
	private static void runTest(String name, String text)
	{
		String codeBody = text;
		
		if (codeBody.indexOf("BEGIN") == -1)
			codeBody = "BEGIN " + codeBody + " END";
		
		String code = "MODULE runTest; " + codeBody + " runTest.";
		
		Module module = Helper.createModuleFromText(code);
		
		if (module == null)
		{
			System.out.println("ERROR: Unable to implode [" + name + "].");
			assert false;
			return;
		}
		
		if (module.eval() == 0)
		{
			System.out.println("ERROR: Unable to evaluate [" + name + "].");
			assert false;
			return;
		}
		
		System.out.println("OK: Test [" + name + "].");
	}
	
	/**
	 * Runs all unit tests.
	 */
	public static void testAll()
	{
		testExpressions();
		testStatements();
		testSmokeFragments();
	}
	/**
	 * Runs the Expression unit tests.
	 */
	public static void testExpressions()
	{
		runTest("Expression Equals", "Assert(1 = 1)");
		runTest("Expression Equals", "AssertFalse(1 = 0)");
		runTest("Expression Not Equals", "Assert(1 # 0)");
		runTest("Expression Not Equals", "AssertFalse(1 # 1)");
		runTest("Expression Greather Than", "Assert(1 > 0)");
		runTest("Expression Greather Than", "AssertFalse(1 > 1)");
		runTest("Expression Greather Than Or Equals", "Assert(1 >= 0)");
		runTest("Expression Greather Than Or Equals", "Assert(1 >= 1)");
		runTest("Expression Greather Than Or Equals", "AssertFalse(1 >= 2)");
		runTest("Expression Less Than", "Assert(0 < 1)");
		runTest("Expression Less Than", "Assert(0 <= 1)");
		runTest("Expression Less Than", "Assert(0 <= 0)");
		runTest("Expression Less Than", "AssertFalse(1 < 1)");

		runTest("Expression Calc Addition", "Assert(1 + 1 = 2)");
		runTest("Expression Calc Addition", "AssertFalse(1 + 1 = 3)");
		runTest("Expression Calc Subtraction", "Assert(1 - 1 = 0)");
		runTest("Expression Calc Subtraction", "AssertFalse(1 - 1 = 1)");
		runTest("Expression Calc Modulo", "Assert(5 MOD 4 = 1)");
		runTest("Expression Calc Modulo", "AssertFalse(5 MOD 4 = 0)");
		runTest("Expression Calc Multiplication", "Assert(2 * 2 = 4)");
		runTest("Expression Calc Multiplication", "AssertFalse(2 * 2 = 1)");
		runTest("Expression Calc Division", "Assert(4 DIV 2 = 2)");
		runTest("Expression Calc Division", "AssertFalse(4 DIV 2 = 1)");
		runTest("Expression Calc Division", "Assert((8 DIV 2) DIV 2 = 2)");
		runTest("Expression Calc Division", "Assert((4+(2+2)) DIV (2+(1+1)) = (1+1))");
		
		runTest("Expression And", "Assert(1 & 1)");
		runTest("Expression And", "AssertFalse(1 & 0)");
		runTest("Expression And", "Assert(1 & 0 = 0)");
		runTest("Expression And", "Assert(0 & 0 = 0)");
		runTest("Expression Or", "Assert(1 OR 1)");
		runTest("Expression Or", "Assert(1 OR 0)");
		runTest("Expression Or", "Assert(0 OR 0 = 0)");
		runTest("Expression Or", "AssertFalse(0 OR 0)");
	}
	/**
	 * Runs the Statement unit tests.
	 */
	public static void testStatements()
	{
		runTest("Statement Assign", "VAR i: INTEGER; BEGIN i:=1; Assert(i = 1) END");
		runTest("Statement Assign with Expression", "VAR i: INTEGER; BEGIN i:=2; Assert(i = 1+1) END");
		runTest("Statement Assign with Expression", "VAR i: INTEGER; BEGIN i:=1+1; Assert(i = 2) END");
		runTest("Statement Complex Assign", "VAR i,i2: INTEGER; BEGIN i2:=3; i:=i2; Assert((i = 3) & (i = i2)) END");
		runTest("Statement Complex Assign", "VAR i,i2: INTEGER; BEGIN i2:=2; i:=i2+1; Assert((i = 3) & (i # i2) & (i = i2+1)) END");
		runTest("Statement ByValue Assign", "VAR i,i2: INTEGER; " +
				"PROCEDURE SetValue(x, y :INTEGER); BEGIN x:=y END SetValue; " +
				"BEGIN i:=2; i2:=3; SetValue(i,i2); Assert((i = 2) & (i # i2)) END");
		runTest("Statement ByReference Assign", "VAR i,i2: INTEGER; " +
				"PROCEDURE SetValue(VAR x, y :INTEGER); BEGIN x:=y END SetValue; " +
				"BEGIN i2:=3; SetValue(i,i2); Assert((i = 3) & (i = i2)) END");
		runTest("Statement Array Assign with Int Index", "VAR i: ARRAY 1 OF INTEGER; BEGIN i[0]:=1; Assert(i[0] = 1) END");
		runTest("Statement Array Assign with Var Index", "VAR i: ARRAY 2 OF INTEGER; VAR i2,x: INTEGER; BEGIN i2:=1; x:=10; i[i2]:=x; Assert(i[i2] = x) END");

		runTest("Statement IF", "IF 1=1 THEN Assert(1) END");
		runTest("Statement IF with ELSE", "IF 1=1 THEN Assert(1) ELSE Assert(0) END");
		runTest("Statement IF return on ELSE", "IF 1=0 THEN Assert(0) ELSE Assert(1) END");
		runTest("Statement IF with ELSIF", "IF 1=1 THEN Assert(1) ELSIF 1=0 THEN Assert(0) END");
		runTest("Statement IF return on ELSIF", "IF 1=0 THEN Assert(0) ELSIF 1=1 THEN Assert(1) END");
		runTest("Statement IF with ELSIF and ELSE", "IF 1=1 THEN Assert(1) ELSIF 1=0 THEN Assert(0) ELSE Assert(0) END");
		runTest("Statement IF with ELSIF and ELSE", "IF 1=0 THEN Assert(0) ELSIF 1=1 THEN Assert(1) ELSE Assert(0) END");
		runTest("Statement IF with ELSIF and ELSE", "IF 1=0 THEN Assert(0) ELSIF 0=1 THEN Assert(0) ELSE Assert(1) END");

		runTest("Statement WHILE", "VAR i: INTEGER; BEGIN i:=0; WHILE i<3 DO i:=i+1 END; Assert(i = 3) END");
		runTest("Statement WHILE", "VAR i,i2: INTEGER; BEGIN i:=0; i2:=3; WHILE i<i2 DO i:=i+1 END; Assert((i = 3) & (i = i2)) END");
	}
	
	/**
	 * Runs Smoke implementation tests.
	 */
	public static void testSmokeFragments()
	{
		runTest("Fragment Swap", "VAR i, j: INTEGER; " +
				"PROCEDURE Swap(VAR x, y: INTEGER); " +
				"VAR temp: INTEGER; " +
				"BEGIN " +
				"temp := x; " +
				"x := y; " +
				"y := temp " +
				"END Swap;" +
				"BEGIN i:=0; j:=1; Swap(i,j); Assert((i = 1) & (j = 0)) END");
	}
}
