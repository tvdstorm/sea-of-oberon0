package randy.test;

import org.junit.*;
import randy.exception.Oberon0Exception;
import randy.interpreter.Oberon0Program;

public class ASTNodeTest
{
	@Test
	public void test_Multiplication()
	{
		TestBuildinFunctions functions = runTest("multiplication");
		Assert.assertTrue(functions.popOutput().equals("" + (12*35)));
		Assert.assertTrue(functions.popOutput().equals("" + (3*4*5*6)));
		Assert.assertTrue(functions.outputIsEmpty());
	}
	@Test
	public void test_VarRef()
	{
		int getal = 12345;
		TestBuildinFunctions functions = runTest("refvar", ""+getal);
		Assert.assertTrue(functions.popOutput().equals("" + (getal+1)));
	}
	@Ignore
	private TestBuildinFunctions runTest(String testName, String ... input)
	{
		try
		{
			Oberon0Program program = new Oberon0Program();
			program.loadProgram("src/test/java/randy/test/" + testName + ".oberon0");
			TestBuildinFunctions functions = new TestBuildinFunctions();
			for (String in : input)
			{
				functions.addInput(in);
			}
			program.setBuildinFunctions(functions);
			program.run();
			return functions;
		}
		catch (Oberon0Exception e)
		{
			Assert.fail(e.getMessage());
			return null;
		}
	}
}
