package randy.test;

import java.util.Random;
import org.junit.*;
import randy.exception.Oberon0Exception;
import randy.interpreter.Oberon0Program;

public class ASTNodeTest
{
	private final int numTests = 1000;
	private Random random;
	private Oberon0Program program;
	
	public ASTNodeTest()
	{
		random = new Random();
		int seed = random.nextInt();
		System.out.println("Seed: " + seed);
		random = new Random(seed);
		program = null;
	}
	/*
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
		prepareTest("addition");
		for (int i=0;i<numTests;i++)
		{
			int a = random.nextInt(), b = random.nextInt(), c = random.nextInt();
			TestBuildinFunctions functions = runTest(""+a, ""+b, ""+c);
			Assert.assertTrue(functions.popOutput().equals("" + (a+b)));
			Assert.assertTrue(functions.popOutput().equals("" + (a+b+c)));
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Test
	public void test_Subtraction()
	{
		prepareTest("subtraction");
		for (int i=0;i<numTests;i++)
		{
			int a = random.nextInt(), b = random.nextInt(), c = random.nextInt();
			TestBuildinFunctions functions = runTest(""+a, ""+b, ""+c);
			Assert.assertTrue(functions.popOutput().equals("" + (a-b)));
			Assert.assertTrue(functions.popOutput().equals("" + (a-b-c)));
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Test
	public void test_Multiplication()
	{
		prepareTest("multiplication");
		for (int i=0;i<numTests;i++)
		{
			int a = random.nextInt(), b = random.nextInt(), c = random.nextInt();
			TestBuildinFunctions functions = runTest(""+a, ""+b, ""+c);
			Assert.assertTrue(functions.popOutput().equals("" + (a*b)));
			Assert.assertTrue(functions.popOutput().equals("" + (a*b*c)));
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Test
	public void test_Division()
	{
		prepareTest("division");
		for (int i=0;i<numTests;i++)
		{
			int a = random.nextInt(), b = random.nextInt(), c = random.nextInt();
			TestBuildinFunctions functions = runTest(""+a, ""+b, ""+c);
			Assert.assertTrue(functions.popOutput().equals("" + (a/b)));
			Assert.assertTrue(functions.popOutput().equals("" + (a/b/c)));
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Test
	public void test_VarRef()
	{
		prepareTest("refvar");
		for (int i=0;i<numTests;i++)
		{
			int getal = random.nextInt();
			TestBuildinFunctions functions = runTest(""+getal);
			Assert.assertTrue(functions.popOutput().equals("" + (getal+1)));
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Test
	public void test_VarRefArray()
	{
		prepareTest("refvararray");
		for (int i=0;i<numTests;i++)
		{
			int a = random.nextInt(), b = random.nextInt(), c = random.nextInt();
			TestBuildinFunctions functions = runTest(""+a, ""+b, ""+c);
			Assert.assertTrue(functions.popOutput().equals("" + a));
			Assert.assertTrue(functions.popOutput().equals("" + (b+1)));
			Assert.assertTrue(functions.popOutput().equals("" + c));
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Test
	public void test_Swap()
	{
		prepareTest("swap");
		for (int i=0;i<numTests;i++)
		{
			int a = random.nextInt(), b = random.nextInt();
			TestBuildinFunctions functions = runTest(""+a, ""+b);
			// Integer
			Assert.assertTrue(functions.popOutput().equals("" + a));
			Assert.assertTrue(functions.popOutput().equals("" + b));
			// Swap
			Assert.assertTrue(functions.popOutput().equals("" + b));
			Assert.assertTrue(functions.popOutput().equals("" + a));
			
			// Array
			Assert.assertTrue(functions.popOutput().equals("" + a));
			Assert.assertTrue(functions.popOutput().equals("" + b));
			// Swap
			Assert.assertTrue(functions.popOutput().equals("" + b));
			Assert.assertTrue(functions.popOutput().equals("" + a));
			
			// Check
			Assert.assertTrue(functions.popOutput().equals("" + a));
			Assert.assertTrue(functions.popOutput().equals("" + b));
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Test
	public void test_GreaterSmallerThen()
	{
		prepareTest("greatersmallerthen");
		for (int i=0;i<numTests;i++)
		{
			int a = random.nextInt(), b = random.nextInt();
			TestBuildinFunctions functions = runTest(""+a, ""+b);

			Assert.assertTrue(functions.popOutput().equals("" + Math.max(a, b)));
			Assert.assertTrue(functions.popOutput().equals("" + Math.min(a, b)));
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Ignore
	private void prepareTest(String testName)
	{
		try
		{
			program = new Oberon0Program();
			program.loadProgram("src/test/java/randy/test/" + testName + ".oberon0");
		}
		catch (Oberon0Exception e)
		{
			Assert.fail(e.getMessage());
		}
	}
	@Ignore
	private TestBuildinFunctions runTest(String... input)
	{
		try
		{
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
