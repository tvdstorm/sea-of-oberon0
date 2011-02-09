package oberon.test;

import java.io.IOException;

import junit.framework.Assert;
import oberon.IExpression;
import oberon.IStatement;
import oberon.Scope;
import oberon.data.VariableDataType;
import oberon.exceptions.ProcedureParamaterCountMismatchException;
import oberon.exceptions.VariableNotFoundInScopeException;
import oberon.expressions.AddOperator;
import oberon.expressions.AndOperator;
import oberon.expressions.ComparisonExpression;
import oberon.expressions.EqualsOperator;
import oberon.expressions.GreaterEqualsOperator;
import oberon.expressions.GreaterThanOperator;
import oberon.expressions.IComparisonOperator;
import oberon.expressions.IntegerExpression;
import oberon.expressions.MathematicalExpression;
import oberon.expressions.MulOperator;
import oberon.expressions.NotEqualsOperator;
import oberon.expressions.ParenthesesExpression;
import oberon.expressions.SmallerEqualsOperator;
import oberon.expressions.SmallerThanOperator;

import org.junit.Test;

public class ComparisonExpressionTest extends AbstractTest {
	
	@Test
	public void test_case_AmpExpressionTest() throws ProcedureParamaterCountMismatchException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(1, testComparisonExpression(3, 3, new AndOperator()));
		Assert.assertEquals(0, testComparisonExpression(2, 3, new AndOperator()));
		Assert.assertEquals(1, testComparisonExpression(1, 1, new AndOperator()));
	}
	
	@Test
	public void test_case_ExeqExpressionTest() throws ProcedureParamaterCountMismatchException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(0, testComparisonExpression(1, 3, new EqualsOperator()));
		Assert.assertEquals(0, testComparisonExpression(2, 3, new EqualsOperator()));
		Assert.assertEquals(1, testComparisonExpression(3, 3, new EqualsOperator()));
	}
	
	@Test
	public void test_case_ExgeExpressionTest() throws ProcedureParamaterCountMismatchException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(0, testComparisonExpression(1, 3, new GreaterEqualsOperator()));
		Assert.assertEquals(1, testComparisonExpression(3, 3, new GreaterEqualsOperator()));
		Assert.assertEquals(1, testComparisonExpression(4, 3, new GreaterEqualsOperator()));
	}
	
	@Test
	public void test_case_ExgtExpressionTest() throws ProcedureParamaterCountMismatchException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(0, testComparisonExpression(1, 3, new GreaterThanOperator()));
		Assert.assertEquals(0, testComparisonExpression(3, 3, new GreaterThanOperator()));
		Assert.assertEquals(1, testComparisonExpression(4, 3, new GreaterThanOperator()));
	}
	
	@Test
	public void test_case_ExseExpressionTest() throws ProcedureParamaterCountMismatchException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(1, testComparisonExpression(1, 3, new SmallerEqualsOperator()));
		Assert.assertEquals(1, testComparisonExpression(3, 3, new SmallerEqualsOperator()));
		Assert.assertEquals(0, testComparisonExpression(4, 3, new SmallerEqualsOperator()));
	}
	
	@Test
	public void test_case_ExstExpressionTest() throws ProcedureParamaterCountMismatchException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(1, testComparisonExpression(1, 3, new SmallerThanOperator()));
		Assert.assertEquals(0, testComparisonExpression(3, 3, new SmallerThanOperator()));
		Assert.assertEquals(0, testComparisonExpression(4, 3, new SmallerThanOperator()));
	}
	
	@Test
	public void test_case_TilExpressionTest() throws ProcedureParamaterCountMismatchException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(1, testComparisonExpression(1, 3, new NotEqualsOperator()));
		Assert.assertEquals(0, testComparisonExpression(3, 3, new NotEqualsOperator()));
		Assert.assertEquals(1, testComparisonExpression(4, 3, new NotEqualsOperator()));
	}

	private int testComparisonExpression(
			int leftSide, int rightSide, IComparisonOperator expressionType)
			throws ProcedureParamaterCountMismatchException, VariableNotFoundInScopeException,
			IOException {
		IExpression expToTest = new ComparisonExpression(
				new IntegerExpression(leftSide),
				new IntegerExpression(rightSide), 
				expressionType);
		
		
		IStatement testStatement = getAssignmentStatement("result", expToTest);

		VariableDataType resultVariable = new VariableDataType("result", false);
		
		Scope newScope = new Scope();
		
		addVariableToDeclaration(resultVariable);
		loadDeclaration(newScope);
		
		testStatement.eval(newScope);
		
		return newScope.getVariable("result").getValue(newScope);
	}
	
	@Test
	public void test_case_ComplexExpressionTest() throws ProcedureParamaterCountMismatchException, VariableNotFoundInScopeException, IOException{
		//Tests the result of the expression (1 * 3) + 2 * 4
		IExpression parenthesesContent = new MathematicalExpression(
				new IntegerExpression(1),
				new IntegerExpression(3), 
				new MulOperator());
		
		IExpression parenExp = new ParenthesesExpression(parenthesesContent);
		
		IExpression multExp = new MathematicalExpression(
				new IntegerExpression(2),
				new IntegerExpression(4), 
				new MulOperator());
		
		IExpression addExp = new MathematicalExpression(
				parenExp,
				multExp, 
				new AddOperator());
		
		IStatement testStatement = getAssignmentStatement("result", addExp);

		VariableDataType resultVariable = new VariableDataType("result", false);
		
		Scope newScope = new Scope();
		
		addVariableToDeclaration(resultVariable);
		loadDeclaration(newScope);
		
		testStatement.eval(newScope);
		
		Assert.assertEquals(11, newScope.getVariable("result").getValue(newScope));
	}
}
