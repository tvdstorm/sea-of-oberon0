package randy.oberon0.test;

import org.junit.*;
import randy.oberon0.interpreter.buildinprocedures.BuildinProcedures;
import randy.oberon0.interpreter.runtime.Program;
import randy.oberon0.value.Type;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.Exception;
import randy.oberon0.exception.*;

public class TypeCheckerTest
{
	@Test
	public void test_typeChecker()
	{
		testTypeChecker("smoketest_quicksort", null, "Quicksort smoketest");
		testTypeChecker("integer_operations", null, "INTEGER operations");
		testTypeChecker("boolean_operations", null, "BOOLEAN operations");
		testTypeChecker("const_assignment_to_integer", null, "CONST assignment to INTEGER");
		
		testTypeChecker("boolean_assignment_to_integer", new TypeMismatchException(Type.BOOLEAN.getTypeText(), Type.INTEGER.getTypeText()), "BOOLEAN assignment to INTEGER");
		testTypeChecker("integer_assignment_to_boolean", new TypeMismatchException(Type.INTEGER.getTypeText(), Type.BOOLEAN.getTypeText()), "INTEGER assignment to BOOLEAN");
		testTypeChecker("integer_assignment_to_const", new ConstAssignmentException(), "INTEGER assignment to CONST");
		testTypeChecker("undeclared_variable_in_module", new UndefinedBindableException("aa"), "Undeclared variable in module");
		testTypeChecker("undeclared_variable_in_procedure", new UndefinedBindableException("aa"), "Undeclared variable in procedure");
		testTypeChecker("undeclared_procedure_in_module", new UndefinedBindableException("aa"), "Undeclared procedure in module");
		testTypeChecker("undeclared_procedure_in_procedure", new UndefinedBindableException("aa"), "Undeclared procedure in procedure");
	}
	@Ignore
	private void testTypeChecker(String testName, RuntimeException expectedExceptionMessage, String description)
	{
		try
		{
			Program program = new Program();
			program.loadProgram("src/test/java/randy/oberon0/test/testscripts/typechecker/" + testName + ".oberon0", new BuildinProcedures());
			try
			{
				program.typeCheck();
				Assert.assertTrue(description + ": Should give typecheck exception, but it doesn't.", expectedExceptionMessage == null);
			}
			catch (RuntimeException e)
			{
				Assert.assertTrue(description + ": " + e.toString(), e.toString().equals(expectedExceptionMessage.toString()));
			}
		}
		catch (Exception e)
		{
			Assert.fail(description + ": " + e.toString());
		}
	}
}
