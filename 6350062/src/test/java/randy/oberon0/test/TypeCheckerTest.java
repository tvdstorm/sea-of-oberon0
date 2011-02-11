package randy.oberon0.test;

import java.util.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;
import randy.oberon0.interpreter.buildinprocedures.BuildinProcedures;
import randy.oberon0.interpreter.runtime.Program;
import randy.oberon0.value.Type;
import randy.oberon0.exception.Exception;
import randy.oberon0.exception.*;

@RunWith(value = Parameterized.class)
public class TypeCheckerTest
{
	private final String testName;
	private final TypeCheckException expectedExceptionMessage;
	private final String description;
	
	/*public TypeCheckerTest()
	{
		testName = null;
		expectedExceptionMessage = null;
		description = null;
	}*/
	public TypeCheckerTest(String _testName, TypeCheckException _expectedExceptionMessage, String _description)
	{
		testName = _testName;
		expectedExceptionMessage = _expectedExceptionMessage;
		description = _description;
	}
	@Parameters
	public static Collection<Object[]> data()
	{
		Object[][] data = {
		{"smoketest_quicksort", null, "Quicksort smoketest"},
		{"integer_operations", null, "INTEGER operations"},
		{"boolean_operations", null, "BOOLEAN operations"},
		{"const_assignment_to_integer", null, "CONST assignment to INTEGER"},
		
		{"boolean_assignment_to_integer", new TypeMismatchException(Type.BOOLEAN.getTypeText(), Type.INTEGER.getTypeText()), "BOOLEAN assignment to INTEGER"},
		{"integer_assignment_to_boolean", new TypeMismatchException(Type.INTEGER.getTypeText(), Type.BOOLEAN.getTypeText()), "INTEGER assignment to BOOLEAN"},
		{"integer_assignment_to_const", new ConstAssignmentException(), "INTEGER assignment to CONST"},
		{"undeclared_variable_in_module", new UndefinedBindableException("aa"), "Undeclared variable in module"},
		{"undeclared_variable_in_procedure", new UndefinedBindableException("aa"), "Undeclared variable in procedure"},
		{"undeclared_procedure_in_module", new UndefinedBindableException("aa"), "Undeclared procedure in module"},
		{"undeclared_procedure_in_procedure", new UndefinedBindableException("aa"), "Undeclared procedure in procedure"},
		{"array_accessor_on_integer", new TypeMismatchException(Type.INTEGER.getTypeText(), Type.ARRAY.getTypeText()), "Array accessor on INTEGER"},
		{"array_index_boolean", new TypeMismatchException(Type.BOOLEAN.getTypeText(), Type.INTEGER.getTypeText()), "BOOLEAN as array index"},
		{"duplicate_variable_name", new DuplicateVariableException("a"), "Duplicate variabel name"},
		};
		return Arrays.asList(data);
	}
	@Test
	public void testTypeChecker()
	{
		try
		{
			Program program = new Program();
			try
			{
				program.loadProgram("src/test/java/randy/oberon0/test/testscripts/typechecker/" + testName + ".oberon0", new BuildinProcedures());
				Assert.assertTrue(description + ": Should give typecheck exception, but it doesn't.", expectedExceptionMessage == null);
			}
			catch (TypeCheckException e)
			{
				Assert.assertTrue(description + ": " + e.toString(), expectedExceptionMessage != null && e.toString().equals(expectedExceptionMessage.toString()));
			}
		}
		catch (Exception e)
		{
			Assert.fail(description + ": " + e.toString());
		}
	}
}
