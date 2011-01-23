package randy.test;

import java.util.Random;
import org.junit.*;
import randy.exception.*;
import randy.interpreter.Oberon0Program;
import randy.value.Type;
import java.util.*;

public class ASTNodeTest
{
	private final int numTests = 1000;
	private Random random;
	private Oberon0Program program;
	private TestBuildinFunctions functions;
	
	public ASTNodeTest()
	{
		random = new Random();
		int seed = random.nextInt();
		System.out.println("Seed: " + seed);
		random = new Random(seed);
		program = null;
	}
	@Test
	public void test_Addition()
	{
		prepareTest("addition");
		for (int i=0;i<numTests;i++)
		{
			int a = random.nextInt(), b = random.nextInt(), c = random.nextInt();
			runTest(""+a, ""+b, ""+c);
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
			runTest(""+a, ""+b, ""+c);
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
			runTest(""+a, ""+b, ""+c);
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
			runTest(""+a, ""+b, ""+c);
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
			runTest(""+getal);
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
			runTest(""+a, ""+b, ""+c);
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
			runTest(""+a, ""+b);
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
			int a = random.nextInt(10), b = random.nextInt(10);
			runTest(""+a, ""+b);

			Assert.assertTrue(functions.popOutput().equals("" + Math.max(a, b)));
			Assert.assertTrue(functions.popOutput().equals("" + Math.min(a, b)));
			Assert.assertTrue(functions.popOutput().equals((a == b)?"1":"0"));
			Assert.assertTrue(functions.popOutput().equals("" + ((a <= b)?a:b)));
			Assert.assertTrue(functions.popOutput().equals("" + ((a >= b)?a:b)));
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Test
	public void test_Andor()
	{
		prepareTest("andor");
		runTest();

		Assert.assertTrue(functions.popOutput().equals("1"));
		Assert.assertTrue(functions.popOutput().equals("0"));
		Assert.assertTrue(functions.popOutput().equals("0"));
		Assert.assertTrue(functions.popOutput().equals("0"));
		
		Assert.assertTrue(functions.popOutput().equals("1"));
		Assert.assertTrue(functions.popOutput().equals("1"));
		Assert.assertTrue(functions.popOutput().equals("1"));
		Assert.assertTrue(functions.popOutput().equals("0"));

		Assert.assertTrue(functions.popOutput().equals("1"));
		Assert.assertTrue(functions.popOutput().equals("1"));
		Assert.assertTrue(functions.popOutput().equals("0"));
		Assert.assertTrue(functions.popOutput().equals("0"));
		Assert.assertTrue(functions.outputIsEmpty());
	}
	@Test
	public void test_ConstAssignment()
	{
		try
		{
			prepareTest("constassignment");
			program.run();
			Assert.fail("Should be throwing an Oberon0ConstAssignmentException...");
		}
		catch (Oberon0ConstAssignmentException e)
		{
			// Success
		}
		catch (Oberon0Exception e)
		{
			Assert.fail("Should be throwing an Oberon0ConstAssignmentException instead of a general Oberon0Exception...");
		}
	}
	@Test
	public void test_IfNumber()
	{
		try
		{
			prepareTest("ifnumber");
			program.run();
			Assert.fail("Should be throwing an Oberon0TypeMismatchException...");
		}
		catch (Oberon0TypeMismatchException e)
		{
			// Success
		}
		catch (Oberon0Exception e)
		{
			Assert.fail("Should be throwing an Oberon0TypeMismatchException instead of a general Oberon0Exception...");
		}
	}
	@Test
	public void test_ElseIfNumber()
	{
		try
		{
			prepareTest("elseifnumber");
			program.run();
			Assert.fail("Should be throwing an Oberon0TypeMismatchException...");
		}
		catch (Oberon0TypeMismatchException e)
		{
			// Success
		}
		catch (Oberon0Exception e)
		{
			Assert.fail("Should be throwing an Oberon0TypeMismatchException instead of a general Oberon0Exception...");
		}
	}
	@Test
	public void test_InfixIntegerAnd()
	{
		try
		{
			prepareTest("infixintegerand");
			program.run();
			Assert.fail("Should be throwing an Oberon0OperatorTypeUndefinedException...");
		}
		catch (Oberon0OperatorTypeUndefinedException e)
		{
			// Success
		}
		catch (Oberon0Exception e)
		{
			Assert.fail("Should be throwing an Oberon0OperatorTypeUndefinedException instead of a general Oberon0Exception...");
		}
	}
	@Test
	public void test_InfixBooleanAdd()
	{
		try
		{
			prepareTest("infixbooleanadd");
			program.run();
			Assert.fail("Should be throwing an Oberon0OperatorTypeUndefinedException...");
		}
		catch (Oberon0OperatorTypeUndefinedException e)
		{
			// Success
		}
		catch (Oberon0Exception e)
		{
			Assert.fail("Should be throwing an Oberon0OperatorTypeUndefinedException instead of a general Oberon0Exception...");
		}
	}
	@Test
	public void test_UnknownFunction()
	{
		try
		{
			prepareTestThrowException("unknownfunction");
			program.run();
			Assert.fail("Should be throwing an Oberon0UndefinedMethodException...");
		}
		catch (Oberon0UndefinedMethodException e)
		{
			// Success
		}
		catch (Oberon0Exception e)
		{
			Assert.fail("Should be throwing an Oberon0UndefinedMethodException instead of a general Oberon0Exception...");
		}
	}
	@Test
	public void test_FunctionCallTooManyParameters()
	{
		try
		{
			prepareTest("functioncalltoomanyparameters");
			program.run();
			Assert.fail("Should be throwing an Oberon0IncorrectNumberOfArgumentsException...");
		}
		catch (Oberon0IncorrectNumberOfArgumentsException e)
		{
			// Success
		}
		catch (Oberon0Exception e)
		{
			Assert.fail("Should be throwing an Oberon0IncorrectNumberOfArgumentsException instead of a general Oberon0Exception...");
		}
	}
	@Test
	public void test_FunctionCallFewManyParameters()
	{
		try
		{
			prepareTest("functioncalltoofewparameters");
			program.run();
			Assert.fail("Should be throwing an Oberon0IncorrectNumberOfArgumentsException...");
		}
		catch (Oberon0IncorrectNumberOfArgumentsException e)
		{
			// Success
		}
		catch (Oberon0Exception e)
		{
			Assert.fail("Should be throwing an Oberon0IncorrectNumberOfArgumentsException instead of a general Oberon0Exception...");
		}
	}
	@Test
	public void test_WhileIntegerExpression()
	{
		try
		{
			prepareTest("whileintegerexpression");
			program.run();
			Assert.fail("Should be throwing an Oberon0TypeMismatchException...");
		}
		catch (Oberon0TypeMismatchException e)
		{
			// Success
		}
		catch (Oberon0Exception e)
		{
			Assert.fail("Should be throwing an Oberon0TypeMismatchException instead of a general Oberon0Exception...");
		}
	}
	@Test
	public void test_Type()
	{
		try
		{
			Type bool = Type.BOOL;
			Type integer = Type.INTEGER;
			Type array = Type.ARRAY;
			
			Assert.assertTrue(bool.equals(new Type("BOOL")));
			Assert.assertTrue(integer.equals(new Type("INTEGER")));
			Assert.assertTrue(array.equals(new Type("ARRAY")));
			
			Assert.assertTrue(bool.equals(new Type(bool.toString())));
			Assert.assertTrue(integer.equals(new Type(integer.toString())));
			Assert.assertTrue(array.equals(new Type(array.toString())));
			
			Assert.assertTrue(bool.equals(bool));
			Assert.assertFalse(bool.equals(integer));
			Assert.assertFalse(bool.equals(array));
			Assert.assertFalse(integer.equals(bool));
			Assert.assertTrue(integer.equals(integer));
			Assert.assertFalse(integer.equals(array));
			Assert.assertFalse(array.equals(bool));
			Assert.assertFalse(array.equals(integer));
			Assert.assertTrue(array.equals(array));
			
			Assert.assertTrue(bool.getType() == Type.TYPES.BOOL);
			Assert.assertTrue(integer.getType() == Type.TYPES.INTEGER);
			Assert.assertTrue(array.getType() == Type.TYPES.ARRAY);
			
			Assert.assertTrue(bool.isBool());
			Assert.assertFalse(bool.isInteger());
			Assert.assertFalse(bool.isArray());
			Assert.assertFalse(integer.isBool());
			Assert.assertTrue(integer.isInteger());
			Assert.assertFalse(integer.isArray());
			Assert.assertFalse(array.isBool());
			Assert.assertFalse(array.isInteger());
			Assert.assertTrue(array.isArray());
		}
		catch (Oberon0Exception e)
		{
			Assert.fail("Shouldn't be throwing an Oberon0Exception...");
		}
		try
		{
			new Type("BLAAT");
			Assert.fail("Should be throwing an Oberon0UnknownTypeException...");
		}
		catch (Oberon0UnknownTypeException e)
		{
			// Success
		}
		catch (Oberon0Exception e)
		{
			Assert.fail("Shouldn't be throwing an Oberon0Exception...");
		}
	}
	@Test
	public void test_SmoketestQuicksort()
	{
		prepareTest("smoketest_quicksort");
		for (int i=0;i<numTests;i++)
		{
			int numbers[] = new int[5];
			for (int n=0;n<5;n++)
			{
				numbers[n] = random.nextInt();
			}
			runTest(""+numbers[0], ""+numbers[1], ""+numbers[2], ""+numbers[3], ""+numbers[4]);
			Arrays.sort(numbers);
			
			for (int n=0;n<5;n++)
			{
				Assert.assertTrue(functions.popOutput().equals("" + numbers[n]));
				Assert.assertTrue(functions.popOutput() == null);
			}
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Test
	public void test_DuplicateVariableName()
	{
		try
		{
			prepareTest("duplicatevariablename");
			program.run();
			Assert.fail("Should be throwing an Oberon0DuplicateVariableException...");
		}
		catch (Oberon0DuplicateVariableException e)
		{
			// Success
		}
		catch (Oberon0Exception e)
		{
			Assert.fail("Should be throwing an Oberon0DuplicateVariableException...");
		}
	}
	@Test
	public void test_UndefinedVariable()
	{
		try
		{
			prepareTest("undefinedvariable");
			program.run();
			Assert.fail("Should be throwing an Oberon0UndefinedVariableException...");
		}
		catch (Oberon0UndefinedVariableException e)
		{
			// Success
		}
		catch (Oberon0Exception e)
		{
			Assert.fail("Should be throwing an Oberon0UndefinedVariableException...");
		}
	}
	@Test
	public void test_GlobalVariable()
	{
		prepareTest("globalvariable");
		for (int i=0;i<numTests;i++)
		{
			int a = random.nextInt(), b = random.nextInt(), c = random.nextInt();
			runTest(""+a, ""+b, ""+c);
			
			Assert.assertTrue(functions.popOutput().equals("" + a));
			Assert.assertTrue(functions.popOutput().equals("" + b));
			Assert.assertTrue(functions.popOutput().equals("" + ((a + 1) + (b + 1))));
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Test
	public void test_ArrayIndexBoolean()
	{
		try
		{
			prepareTest("arrayindexboolean");
			program.run();
			Assert.fail("Should be throwing an Oberon0SelectorException...");
		}
		catch (Oberon0SelectorException e)
		{
			// Success
		}
		catch (Oberon0Exception e)
		{
			Assert.fail("Should be throwing an Oberon0SelectorException...");
		}
	}
	@Test
	public void test_ArrayAccessorInteger()
	{
		try
		{
			prepareTest("arrayaccessoroninteger");
			program.run();
			Assert.fail("Should be throwing an Oberon0SelectorException...");
		}
		catch (Oberon0SelectorException e)
		{
			// Success
		}
		catch (Oberon0Exception e)
		{
			Assert.fail("Should be throwing an Oberon0SelectorException...");
		}
	}
	@Test
	public void test_Functionnesting()
	{
		prepareTest("functionnesting");
		runTest();
		Assert.assertTrue(functions.outputIsEmpty());
	}
	@Test
	public void test_IncorrectParameterType()
	{
		try
		{
			prepareTest("incorrectparametertype");
			program.run();
			Assert.fail("Should be throwing an Oberon0TypeMismatchException...");
		}
		catch (Oberon0TypeMismatchException e)
		{
			// Success
		}
		catch (Oberon0Exception e)
		{
			Assert.fail("Should be throwing an Oberon0TypeMismatchException...");
		}
	}
	@Test
	public void test_ArrayParameter()
	{
		prepareTest("arrayparameter");
		for (int i=0;i<numTests;i++)
		{
			int a = random.nextInt(), b = random.nextInt(), c = random.nextInt(), d = random.nextInt(), e = random.nextInt();
			runTest(""+a, ""+b, ""+c, ""+d, ""+e);
			
			Assert.assertTrue(functions.popOutput().equals("" + a));
			Assert.assertTrue(functions.popOutput().equals("" + b));
			Assert.assertTrue(functions.popOutput().equals("" + c));
			Assert.assertTrue(functions.popOutput().equals("" + d));
			Assert.assertTrue(functions.popOutput().equals("" + e));
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	/*@Test
	public void test_ArrayParameterLength()
	{
		prepareTest("arrayparameterlength");
		for (int i=0;i<numTests;i++)
		{
			int a = random.nextInt(), b = random.nextInt(), c = random.nextInt(), d = random.nextInt(), e = random.nextInt();
			runTest(""+a, ""+b, ""+c, ""+d, ""+e);
			
			Assert.fail("Should be throwing an Exception..."); // TODO: exceptie specificeren en code verbeteren.
		}
	}*/
	// TODO: test to check if an const array can be modified
	
	@Ignore
	private void prepareTestThrowException(String testName) throws Oberon0Exception
	{
		functions = new TestBuildinFunctions();
		program = new Oberon0Program();
		program.loadProgram("src/test/java/randy/test/testscripts/" + testName + ".oberon0", functions);
	}
	private void prepareTest(String testName)
	{
		try
		{
			prepareTestThrowException(testName);
		}
		catch (Oberon0Exception e)
		{
			Assert.fail(e.getMessage());
		}
	}
	@Ignore
	private void runTest(String... input)
	{
		Assert.assertTrue(functions.outputIsEmpty());
		try
		{
			for (String in : input)
			{
				functions.addInput(in);
			}
			program.setBuildinFunctions(functions);
			program.run();
		}
		catch (Oberon0Exception e)
		{
			Assert.fail(e.getMessage());
		}
	}
}