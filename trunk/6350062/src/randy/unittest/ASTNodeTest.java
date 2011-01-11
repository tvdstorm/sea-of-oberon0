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
			Oberon0Program program = new Oberon0Program();
			program.loadProgram("src/randy/unittest/multiplication.oberon0");
			// TODO: read/write functies maken waarmee geunittest kan worden
		}
		catch (Oberon0Exception e)
		{
			Assert.fail(e.getMessage());
		}
	}
}
