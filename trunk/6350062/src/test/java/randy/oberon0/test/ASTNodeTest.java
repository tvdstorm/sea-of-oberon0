package randy.oberon0.test;

import java.util.Random;
import org.junit.*;
import randy.oberon0.exception.Exception;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.Boolean;
import randy.oberon0.value.Integer;
import randy.oberon0.value.*;
import java.util.*;

public class ASTNodeTest
{
	private final int numTests = 1000;
	private Random random;
	private Program program;
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
		prepareTest("addition", true);
		for (int curTest=0;curTest<numTests;curTest++)
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
		prepareTest("subtraction", true);
		for (int curTest=0;curTest<numTests;curTest++)
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
		prepareTest("multiplication", true);
		for (int curTest=0;curTest<numTests;curTest++)
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
		prepareTest("division", true);
		for (int curTest=0;curTest<numTests;curTest++)
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
		prepareTest("refvar", true);
		for (int curTest=0;curTest<numTests;curTest++)
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
		prepareTest("refvararray", true);
		for (int curTest=0;curTest<numTests;curTest++)
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
		prepareTest("swap", true);
		for (int curTest=0;curTest<numTests;curTest++)
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
		prepareTest("greatersmallerthen", true);
		for (int curTest=0;curTest<numTests;curTest++)
		{
			int a = random.nextInt(10), b = random.nextInt(10);
			runTest(""+a, ""+b);

			Assert.assertTrue(functions.popOutput().equals("" + Math.max(a, b)));
			Assert.assertTrue(functions.popOutput().equals("" + Math.min(a, b)));
			Assert.assertTrue(functions.popOutput().equals((a == b)?"1":"0"));
			Assert.assertTrue(functions.popOutput().equals((a != b)?"1":"0"));
			Assert.assertTrue(functions.popOutput().equals("" + ((a <= b)?a:b)));
			Assert.assertTrue(functions.popOutput().equals("" + ((a >= b)?a:b)));
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Test
	public void test_Andor()
	{
		prepareTest("andor", true);
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
		
		Assert.assertTrue(functions.popOutput().equals("0"));
		Assert.assertTrue(functions.popOutput().equals("0"));
		Assert.assertTrue(functions.popOutput().equals("1"));
		Assert.assertTrue(functions.popOutput().equals("1"));
		
		Assert.assertTrue(functions.popOutput().equals("0"));
		Assert.assertTrue(functions.popOutput().equals("1"));
		Assert.assertTrue(functions.outputIsEmpty());
	}
	@Test
	public void test_ConstAssignment()
	{
		try
		{
			prepareTest("constassignment", false);
			program.run();
			Assert.fail("Should be throwing an ConstAssignmentException...");
		}
		catch (ConstAssignmentException e)
		{
			// Success
		}
		catch (Exception e)
		{
			Assert.fail("Should be throwing an ConstAssignmentException instead of a general Exception...");
		}
	}
	@Test
	public void test_IfNumber()
	{
		try
		{
			prepareTest("ifnumber", false);
			program.run();
			Assert.fail("Should be throwing an TypeMismatchException...");
		}
		catch (TypeMismatchException e)
		{
			// Success
		}
		catch (Exception e)
		{
			Assert.fail("Should be throwing an TypeMismatchException instead of a general Exception...");
		}
	}
	@Test
	public void test_ElseIfNumber()
	{
		try
		{
			prepareTest("elseifnumber", false);
			program.run();
			Assert.fail("Should be throwing an TypeMismatchException...");
		}
		catch (TypeMismatchException e)
		{
			// Success
		}
		catch (Exception e)
		{
			Assert.fail("Should be throwing an TypeMismatchException instead of a general Exception...");
		}
	}
	@Test
	public void test_InfixIntegerAnd()
	{
		try
		{
			prepareTest("infixintegerand", false);
			program.run();
			Assert.fail("Should be throwing an OperatorTypeUndefinedException...");
		}
		catch (OperatorTypeUndefinedException e)
		{
			// Success
		}
		catch (Exception e)
		{
			Assert.fail("Should be throwing an OperatorTypeUndefinedException instead of a general Exception...");
		}
	}
	@Test
	public void test_InfixBooleanAdd()
	{
		try
		{
			prepareTest("infixbooleanadd", false);
			program.run();
			Assert.fail("Should be throwing an OperatorTypeUndefinedException...");
		}
		catch (OperatorTypeUndefinedException e)
		{
			// Success
		}
		catch (Exception e)
		{
			Assert.fail("Should be throwing an OperatorTypeUndefinedException instead of a general Exception...");
		}
	}
	@Test
	public void test_UnknownFunction()
	{
		try
		{
			prepareTestThrowException("unknownfunction", false);
			program.run();
			Assert.fail("Should be throwing an UndefinedMethodException...");
		}
		catch (UndefinedMethodException e)
		{
			// Success
		}
		catch (Exception e)
		{
			Assert.fail("Should be throwing an UndefinedMethodException instead of a general Exception...");
		}
	}
	@Test
	public void test_FunctionCallTooManyParameters()
	{
		try
		{
			prepareTest("functioncalltoomanyparameters", false);
			program.run();
			Assert.fail("Should be throwing an IncorrectNumberOfArgumentsException...");
		}
		catch (IncorrectNumberOfArgumentsException e)
		{
			// Success
		}
		catch (Exception e)
		{
			Assert.fail("Should be throwing an IncorrectNumberOfArgumentsException instead of a general Exception...");
		}
	}
	@Test
	public void test_FunctionCallFewManyParameters()
	{
		try
		{
			prepareTest("functioncalltoofewparameters", false);
			program.run();
			Assert.fail("Should be throwing an IncorrectNumberOfArgumentsException...");
		}
		catch (IncorrectNumberOfArgumentsException e)
		{
			// Success
		}
		catch (Exception e)
		{
			Assert.fail("Should be throwing an IncorrectNumberOfArgumentsException instead of a general Exception...");
		}
	}
	@Test
	public void test_WhileIntegerExpression()
	{
		try
		{
			prepareTest("whileintegerexpression", false);
			program.run();
			Assert.fail("Should be throwing an TypeMismatchException...");
		}
		catch (TypeMismatchException e)
		{
			// Success
		}
		catch (Exception e)
		{
			Assert.fail("Should be throwing an TypeMismatchException instead of a general Exception...");
		}
	}
	@Test
	public void test_Type()
	{
		Type bool = Type.BOOLEAN;
		Type integer = Type.INTEGER;
		Type array = Type.ARRAY;
		
		Assert.assertTrue(bool.equals(Type.BOOLEAN));
		Assert.assertTrue(integer.equals(Type.INTEGER));
		Assert.assertTrue(array.equals(Type.ARRAY));
		
		Assert.assertTrue(bool.equals(bool));
		Assert.assertFalse(bool.equals(integer));
		Assert.assertFalse(bool.equals(array));
		Assert.assertFalse(integer.equals(bool));
		Assert.assertTrue(integer.equals(integer));
		Assert.assertFalse(integer.equals(array));
		Assert.assertFalse(array.equals(bool));
		Assert.assertFalse(array.equals(integer));
		Assert.assertTrue(array.equals(array));
	}
	@Test
	public void test_SmoketestQuicksort()
	{
		prepareTest("smoketest_quicksort", true);
		for (int curTest=0;curTest<numTests;curTest++)
		{
			final int numWaardes = 150;
			int numbers[] = new int[numWaardes];
			String input[] = new String[numWaardes];
			for (int n=0;n<numWaardes;n++)
			{
				numbers[n] = random.nextInt();
				input[n] = "" + numbers[n];
			}
			runTest(input);
			Arrays.sort(numbers);
			
			for (int n=0;n<numWaardes;n++)
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
			prepareTest("duplicatevariablename", false);
			program.run();
			Assert.fail("Should be throwing an DuplicateVariableException...");
		}
		catch (DuplicateVariableException e)
		{
			// Success
		}
		catch (Exception e)
		{
			Assert.fail("Should be throwing an DuplicateVariableException...");
		}
	}
	@Test
	public void test_UndefinedVariable()
	{
		try
		{
			prepareTest("undefinedvariable", false);
			program.run();
			Assert.fail("Should be throwing an UndefinedVariableException...");
		}
		catch (UndefinedVariableException e)
		{
			// Success
		}
		catch (Exception e)
		{
			Assert.fail("Should be throwing an UndefinedVariableException...");
		}
	}
	@Test
	public void test_GlobalVariable()
	{
		prepareTest("globalvariable", true);
		for (int curTest=0;curTest<numTests;curTest++)
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
			prepareTest("arrayindexboolean", false);
			program.run();
			Assert.fail("Should be throwing an SelectorException...");
		}
		catch (TypeMismatchException e)
		{
			// Success
		}
		catch (Exception e)
		{
			Assert.fail("Should be throwing an SelectorException...");
		}
	}
	@Test
	public void test_ArrayAccessorInteger()
	{
		try
		{
			prepareTest("arrayaccessoroninteger", false);
			program.run();
			Assert.fail("Should be throwing an SelectorException...");
		}
		catch (TypeMismatchException e)
		{
			// Success
		}
		catch (Exception e)
		{
			Assert.fail("Should be throwing an SelectorException...");
		}
	}
	@Test
	public void test_Functionnesting()
	{
		prepareTest("functionnesting", true);
		runTest();
		Assert.assertTrue(functions.outputIsEmpty());
	}
	@Test
	public void test_IncorrectParameterType()
	{
		try
		{
			prepareTest("incorrectparametertype", false);
			program.run();
			Assert.fail("Should be throwing an TypeMismatchException...");
		}
		catch (TypeMismatchException e)
		{
			// Success
		}
		catch (Exception e)
		{
			Assert.fail("Should be throwing an TypeMismatchException...");
		}
	}
	@Test
	public void test_ArrayParameter()
	{
		prepareTest("arrayparameter", true);
		for (int curTest=0;curTest<numTests;curTest++)
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
	@Test
	public void test_Values()
	{
		try
		{
			for (int curTest=0;curTest<numTests;curTest++)
			{
				int iRand = random.nextInt();
				Integer integer = new Integer(iRand);
				Assert.assertTrue(iRand == integer.getIntValue());
				Integer integer3 = new Integer(0);
				integer3.setValue(integer);
				Assert.assertTrue(integer.getIntValue() == integer3.getIntValue());
				Const cInteger = new Const(integer);
				Assert.assertTrue(cInteger.getType() == integer.getType());
				Assert.assertTrue(cInteger.toString().equals(integer.toString()));
				
				boolean bRand = random.nextBoolean();
				Boolean bool = new Boolean(bRand);
				Assert.assertTrue(bRand == bool.getBoolValue());
				Boolean bool3 = new Boolean(false);
				bool3.setValue(bool);
				Assert.assertTrue(bool.getBoolValue() == bool3.getBoolValue());
				Const cBool = new Const(bool);
				Assert.assertTrue(cBool.getType() == bool.getType());
				Assert.assertTrue(cBool.toString().equals(bool.toString()));
								
				Assert.assertTrue((new Integer(0)).getType() == Type.INTEGER);
				Assert.assertTrue((new Boolean(false)).getType() == Type.BOOLEAN);
				
				try
				{
					integer.setValue(bool3);
					Assert.fail("Should be throwing an TypeMismatchException...");
				}
				catch (TypeMismatchException e)
				{
					// Success
				}
				try
				{
					bool.setValue(integer3);
					Assert.fail("Should be throwing an TypeMismatchException...");
				}
				catch (TypeMismatchException e)
				{
					// Success
				}
								
				TypeRegistry typeRegistry = new TypeRegistry(null);
				typeRegistry.registerType(Type.INTEGER.getTypeText(), new PrimitiveVariableInstantiation(Type.INTEGER));
				RuntimeEnvironment environment = new RuntimeEnvironment(new VariableStack(null), new FunctionRegistry(null), typeRegistry);
				
				Value values[] = new Value[4];
				values[0] = new Integer(random.nextInt(10)+1);
				values[1] = new Boolean(bRand);
				values[2] = new Array(random.nextInt(10)+1, environment.resolveType("INTEGER"), environment);
				HashMap<String, IInstantiateableVariable> members = new HashMap<String, IInstantiateableVariable>();
				members.put("a", environment.resolveType("INTEGER"));
				members.put("b", environment.resolveType("INTEGER"));
				values[3] = new Record(members, environment);
				
				for (int i=0;i<values.length;i++)
				{
					for (int j=0;j<values.length;j++)
					{
						Value val = values[i].clone();
						Assert.assertTrue(val.toString().equals(values[j].toString()) == (i == j));
						Assert.assertTrue(val.equalsToValue(values[j]) == (i == j));
						Value ref = new Reference(val);
						Assert.assertTrue(ref.toString().equals(values[j].toString()) == (i == j));
						Assert.assertTrue(ref.equalsToValue(values[j]) == (i == j));
						Assert.assertTrue(ref.getType() == val.getType());
						Value ref2 = ref.clone();
						Assert.assertTrue(ref.toString().equals(ref2.toString()));
						Assert.assertTrue(ref.equalsToValue(ref2));
						Const con = new Const(val);
						Assert.assertTrue(con.toString().equals(values[j].toString()) == (i == j));
						Assert.assertTrue(con.equalsToValue(values[j]) == (i == j));
						Value con2 = con.clone();
						Assert.assertTrue(con.toString().equals(con2.toString()));
						Assert.assertTrue(con.equalsToValue(con2));
						
						Value copies[] = new Value[4];
						copies[0] = new Integer(random.nextInt(10)+1);
						copies[1] = new Boolean(bRand);
						copies[2] = new Array(random.nextInt(10)+1, environment.resolveType("INTEGER"), environment);
						HashMap<String, IInstantiateableVariable> copyMembers = new HashMap<String, IInstantiateableVariable>();
						copyMembers.put("a", environment.resolveType("INTEGER"));
						copyMembers.put("b", environment.resolveType("INTEGER"));
						copies[3] = new Record(copyMembers, environment);
						if (i == j)
						{
							copies[i].setValue(values[j]);
							Assert.assertTrue(copies[i].toString().equals(values[j].toString()));
							Assert.assertTrue(copies[i].equalsToValue(values[j]));
						}
						else
						{
							try
							{
								copies[i].setValue(values[j]);
								Assert.fail("Should be throwing a TypeMismatchException...");
							}
							catch (TypeMismatchException e)
							{
								// Success
							}
							catch (Exception e)
							{
								Assert.fail("Should be throwing a TypeMismatchException...");
							}
						}
					}
				}
			}
		}
		catch (Exception e)
		{
			Assert.fail("Shouldn't be throwing an Exception...");
		}
	}
	@Test
	public void test_ArrayParameterLength()
	{
		try
		{
			prepareTest("arrayparameterlength", true);
			program.run();
			Assert.fail("Should be throwing an ArrayLengthMismatch exception...");
		}	
		catch (ArrayLengthMismatch e)
		{
			// Success
		}
		catch (Exception e)
		{
			Assert.fail("Should be throwing an ArrayLengthMismatch exception...");
		}
	}
	@Test
	public void test_Prefixoperators()
	{
		prepareTest("prefixoperators", true);
		for (int curTest=0;curTest<numTests;curTest++)
		{
			int a = random.nextInt(), b = 0;
			while (b == 0)
			{
				b = random.nextInt();
			}
			runTest(""+a, ""+b);
			
			Assert.assertTrue(functions.popOutput().equals("" + (a + b)));
			Assert.assertTrue(functions.popOutput().equals("" + (a - b)));
			Assert.assertTrue(functions.popOutput().equals("" + (a * b)));
			Assert.assertTrue(functions.popOutput().equals("" + (a / b)));
			
			Assert.assertTrue(functions.popOutput().equals("" + ((-a) + b)));
			Assert.assertTrue(functions.popOutput().equals("" + ((-a) - b)));
			Assert.assertTrue(functions.popOutput().equals("" + -(a * b)));
			Assert.assertTrue(functions.popOutput().equals("" + -(a / b)));
			
			Assert.assertTrue(functions.popOutput().equals("" + (a + (-b))));
			Assert.assertTrue(functions.popOutput().equals("" + (a - (-b))));
			Assert.assertTrue(functions.popOutput().equals("" + (a * (-b))));
			Assert.assertTrue(functions.popOutput().equals("" + (a / (-b))));
			
			Assert.assertTrue(functions.popOutput().equals("" + ((-a) + (-b))));
			Assert.assertTrue(functions.popOutput().equals("" + ((-a) - (-b))));
			Assert.assertTrue(functions.popOutput().equals("" + -(a * (-b))));
			Assert.assertTrue(functions.popOutput().equals("" + -(a / (-b))));
			
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Test
	public void test_VariableScoping()
	{
		prepareTest("variablescoping", true);
		for (int curTest=0;curTest<numTests;curTest++)
		{
			int vm = random.nextInt();
			runTest(""+vm);
			
			int va = 12;
			Assert.assertTrue(functions.popOutput().equals("" + va));
			va += vm;
			Assert.assertTrue(functions.popOutput().equals("" + vm));
			
			int vaa = 123;
			Assert.assertTrue(functions.popOutput().equals("" + vaa));
			vaa += va;
			Assert.assertTrue(functions.popOutput().equals("" + va));
			vaa += vm;
			Assert.assertTrue(functions.popOutput().equals("" + vm));
			Assert.assertTrue(functions.popOutput().equals("" + vaa));
			
			int vb = 1234;
			Assert.assertTrue(functions.popOutput().equals("" + vb));
			vb += vm;
			Assert.assertTrue(functions.popOutput().equals("" + vb));
			Assert.assertTrue(functions.outputIsEmpty());
		}
		for (int i=1;i<=5;i++)
		{
			try
			{
				prepareTest("variablescopingfout" + i, false);
				functions.addInput("1");
				program.run();
				Assert.fail("Should be throwing an UndefinedVariableException...");
			}
			catch (UndefinedVariableException e)
			{
				// Success
			}
			catch (Exception e)
			{
				Assert.fail("Should be throwing an UndefinedVariableException...");
			}
		}
	}
	@Test
	public void test_Record()
	{
		prepareTest("record", true);
		for (int curTest=0;curTest<numTests;curTest++)
		{
			int a = random.nextInt(), b = random.nextInt();
			runTest(""+a, ""+b);
			
			Assert.assertTrue(functions.popOutput().equals("" + a));
			Assert.assertTrue(functions.popOutput().equals("" + b));
			Assert.assertTrue(functions.popOutput().equals(a == b?"1":"0"));
			
			Assert.assertTrue(functions.popOutput().equals("" + b));
			Assert.assertTrue(functions.popOutput().equals("" + a));
			Assert.assertTrue(functions.popOutput().equals(a == b?"1":"0"));
			Assert.assertTrue(functions.popOutput().equals("" + a));
			Assert.assertTrue(functions.popOutput().equals("" + b));
			
			Assert.assertTrue(functions.popOutput().equals("" + a));
			
			Assert.assertTrue(functions.popOutput().equals("" + a));
			Assert.assertTrue(functions.popOutput().equals("" + b));
			
			Assert.assertTrue(functions.popOutput().equals("" + (a + 4)));
			Assert.assertTrue(functions.popOutput().equals("" + (b - 3)));
			
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Test
	public void test_ArrayRecordNesting()
	{
		prepareTest("arrayrecordnesting", true);
		for (int curTest=0;curTest<numTests;curTest++)
		{
			final int lengthI = 5;
			final int lengthJ = 10;
			int array[][] = new int[lengthI][lengthJ];
			List<String> input = new LinkedList<String>();
			for (int i=0;i<lengthI;i++)
			{
				for (int j=0;j<lengthJ;j++)
				{
					array[i][j] = random.nextInt();
					input.add("" + array[i][j]);
				}
			}
			String objects[] = new String[lengthI*2];
			for (int i=0;i<lengthI;i++)
			{
				int getal = random.nextInt();
				int getal2 = random.nextInt();
				objects[i*2] = ""+getal;
				input.add(""+getal);
				objects[i*2+1] = ""+getal2;
				input.add(""+getal2);
			}
			String in[] = new String[input.size()];
			in = input.toArray(in);
			
			runTest(in);
			
			for (int i=0;i<lengthI;i++)
			{
				for (int j=0;j<lengthJ;j++)
				{
					Assert.assertTrue(functions.popOutput().equals("" + array[i][j]));
				}
			}
			
			for (int i=0;i<lengthI;i++)
			{
				for (int j=0;j<lengthJ;j++)
				{
					Assert.assertTrue(functions.popOutput().equals("" + (array[i][j]+1)));
				}
			}
			
			for (int i=0;i<lengthI;i++)
			{
				String getal = functions.popOutput();
				String getal2 = functions.popOutput();
				Assert.assertTrue(getal2.equals(""+objects[i*2]));
				Assert.assertTrue(getal.equals(""+objects[i*2+1]));
			}
			
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Test
	public void test_VariableNesting()
	{
		prepareTest("variablenesting", true);
		runTest();
		Assert.assertTrue(functions.popOutput().equals("1"));
		Assert.assertTrue(functions.outputIsEmpty());
	}
	@Test
	public void test_With()
	{
		prepareTest("with", true);
		for (int curTest=0;curTest<numTests;curTest++)
		{
			int a = random.nextInt(), b = random.nextInt();
			runTest(""+a, ""+b);
			
			Assert.assertTrue(functions.popOutput().equals("" + a));
			Assert.assertTrue(functions.popOutput().equals("" + b));
			Assert.assertTrue(functions.popOutput().equals(a == b?"1":"0"));
			
			Assert.assertTrue(functions.popOutput().equals("" + a));
			Assert.assertTrue(functions.popOutput().equals("" + b));
			Assert.assertTrue(functions.popOutput().equals(a == b?"1":"0"));
			
			Assert.assertTrue(functions.popOutput().equals("" + b));
			Assert.assertTrue(functions.popOutput().equals("" + a));
			Assert.assertTrue(functions.popOutput().equals(a == b?"1":"0"));
			Assert.assertTrue(functions.popOutput().equals("" + a));
			Assert.assertTrue(functions.popOutput().equals("" + b));
			
			Assert.assertTrue(functions.popOutput().equals("" + a));
			
			Assert.assertTrue(functions.popOutput().equals("" + a));
			Assert.assertTrue(functions.popOutput().equals("" + b));
			
			Assert.assertTrue(functions.popOutput().equals("" + (a + 4)));
			Assert.assertTrue(functions.popOutput().equals("" + (b - 3)));
			
			Assert.assertTrue(functions.outputIsEmpty());
		}
	}
	@Ignore
	private void prepareTestThrowException(String testName, boolean bIsValid) throws Exception
	{
		functions = new TestBuildinFunctions();
		program = new Program();
		program.loadProgram("src/test/java/randy/oberon0/test/testscripts/" + testName + ".oberon0", functions);
		try
		{
			program.typeCheck();
			if (!bIsValid)
			{
				System.out.println(testName + " " + bIsValid);
				System.out.println("true");
			}
			Assert.assertTrue(bIsValid);
		}
		catch (RuntimeException e)
		{
			if (bIsValid)
			{
				System.out.println(testName + " " + bIsValid);
				System.out.println("false: " + e.toString());
			}
			Assert.assertFalse(bIsValid);
		}
	}
	private void prepareTest(String testName, boolean bIsValid)
	{
		try
		{
			prepareTestThrowException(testName, bIsValid);
		}
		catch (Exception e)
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
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
		}
	}
}
