package randy.test;

import java.util.Random;
import org.junit.*;
import randy.exception.Oberon0Exception;
import randy.interpreter.Oberon0Program;

public class ASTNodeTest
{
	private final int numTests = 1000;
	private Random random;
	
	public ASTNodeTest()
	{
		random = new Random();
		int seed = random.nextInt();
		System.out.println("Seed: " + seed);
		random = new Random(seed);
	}
	/*
	 * swaps
	 * r - l > 0
	 * (l + r) div 2
	 * (l <= pivot) & (r >= pivot)
	 * l := l + 1
	 * array access
	 * pointers in functies
	 * pointers in functions op array elementen als input
	 * l - 1 = pivot
	 * r + 1 = pivot
	 * if
	 * if elseif 
	 * if else
	 * if elseif else
	 */
	@Test
	public void test_Addition()
	{
		for (int i=0;i<numTests;i++)
		{
			int a = random.nextInt(), b = random.nextInt(), c = random.nextInt();
			TestBuildinFunctions functions = runTest("addition", ""+a, ""+b, ""+c);
			Assert.assertTrue(functions.popOutput().equals("" + (a+b)));
			Assert.assertTrue(functions.popOutput().equals("" + (a+b+c)));
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Test
	public void test_Subtraction()
	{
		for (int i=0;i<numTests;i++)
		{
			int a = random.nextInt(), b = random.nextInt(), c = random.nextInt();
			TestBuildinFunctions functions = runTest("subtraction", ""+a, ""+b, ""+c);
			Assert.assertTrue(functions.popOutput().equals("" + (a-b)));
			Assert.assertTrue(functions.popOutput().equals("" + (a-b-c)));
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Test
	public void test_Multiplication()
	{
		for (int i=0;i<numTests;i++)
		{
			int a = random.nextInt(), b = random.nextInt(), c = random.nextInt();
			TestBuildinFunctions functions = runTest("multiplication", ""+a, ""+b, ""+c);
			Assert.assertTrue(functions.popOutput().equals("" + (a*b)));
			Assert.assertTrue(functions.popOutput().equals("" + (a*b*c)));
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Test
	public void test_Division()
	{
		for (int i=0;i<numTests;i++)
		{
			int a = random.nextInt(), b = random.nextInt(), c = random.nextInt();
			TestBuildinFunctions functions = runTest("division", ""+a, ""+b, ""+c);
			Assert.assertTrue(functions.popOutput().equals("" + (a/b)));
			Assert.assertTrue(functions.popOutput().equals("" + (a/b/c)));
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Test
	public void test_VarRef()
	{
		for (int i=0;i<numTests;i++)
		{
			int getal = random.nextInt();
			TestBuildinFunctions functions = runTest("refvar", ""+getal);
			Assert.assertTrue(functions.popOutput().equals("" + (getal+1)));
		}
	}
	@Test
	public void test_VarRefArray()
	{
		for (int i=0;i<numTests;i++)
		{
			int a = random.nextInt(), b = random.nextInt(), c = random.nextInt();
			TestBuildinFunctions functions = runTest("refvararray", ""+a, ""+b, ""+c);
			Assert.assertTrue(functions.popOutput().equals("" + a));
			Assert.assertTrue(functions.popOutput().equals("" + (b+1)));
			Assert.assertTrue(functions.popOutput().equals("" + c));
		}
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
