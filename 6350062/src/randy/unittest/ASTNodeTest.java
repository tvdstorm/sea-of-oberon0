package randy.unittest;

import org.junit.*;
import randy.exception.Oberon0Exception;
import randy.interpreter.Oberon0Program;

public class ASTNodeTest
{
	@Test
	public void test_Multiplication()
	{
		try
		{
			TestBuildinFunctions functions = runTest("multiplication");
			Assert.assertTrue(functions.popOutput().equals("" + (12*35)));
			Assert.assertTrue(functions.popOutput().equals("" + (3*4*5*6)));
			Assert.assertTrue(functions.outputIsEmpty());
			// TODO: read/write functies maken waarmee geunittest kan worden
		}
		catch (Oberon0Exception e)
		{
			Assert.fail(e.getMessage());
		}
	}
	private TestBuildinFunctions runTest(String testName) throws Oberon0Exception
	{
		Oberon0Program program = new Oberon0Program();
		program.loadProgram("src/randy/unittest/" + testName + ".oberon0");
		TestBuildinFunctions functions = new TestBuildinFunctions();
		program.setBuildinFunctions(functions);
		program.run();
		return functions;
	}
}
