package oberon.test;

import java.io.IOException;

import junit.framework.Assert;
import oberon.IExpression;
import oberon.IStatement;
import oberon.VariableManager;
import oberon.data.VariableDataType;
import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;
import oberon.expressions.AndOperator;
import oberon.expressions.ComparisonExpression;
import oberon.expressions.EqualsOperator;
import oberon.expressions.GreaterEqualsOperator;
import oberon.expressions.GreaterThanOperator;
import oberon.expressions.IComparisonOperatorImplementation;
import oberon.expressions.IntegerExpression;
import oberon.expressions.MathematicalExpression;
import oberon.expressions.MathematicalExpressionType;
import oberon.expressions.NotEqualsOperator;
import oberon.expressions.ParenthesesExpression;
import oberon.expressions.SmallerEqualsOperator;
import oberon.expressions.SmallerThanOperator;

import org.junit.Test;

public class ComparisonExpressionTest extends AbstractTest {
	
	@Test
	public void test_case_AmpExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(1, testComparisonExpression(3, 3, new AndOperator()));
		Assert.assertEquals(0, testComparisonExpression(2, 3, new AndOperator()));
		Assert.assertEquals(1, testComparisonExpression(1, 1, new AndOperator()));
	}
	
	@Test
	public void test_case_ExeqExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(0, testComparisonExpression(1, 3, new EqualsOperator()));
		Assert.assertEquals(0, testComparisonExpression(2, 3, new EqualsOperator()));
		Assert.assertEquals(1, testComparisonExpression(3, 3, new EqualsOperator()));
	}
	
	@Test
	public void test_case_ExgeExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(0, testComparisonExpression(1, 3, new GreaterEqualsOperator()));
		Assert.assertEquals(1, testComparisonExpression(3, 3, new GreaterEqualsOperator()));
		Assert.assertEquals(1, testComparisonExpression(4, 3, new GreaterEqualsOperator()));
	}
	
	@Test
	public void test_case_ExgtExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(0, testComparisonExpression(1, 3, new GreaterThanOperator()));
		Assert.assertEquals(0, testComparisonExpression(3, 3, new GreaterThanOperator()));
		Assert.assertEquals(1, testComparisonExpression(4, 3, new GreaterThanOperator()));
	}
	
	@Test
	public void test_case_ExseExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(1, testComparisonExpression(1, 3, new SmallerEqualsOperator()));
		Assert.assertEquals(1, testComparisonExpression(3, 3, new SmallerEqualsOperator()));
		Assert.assertEquals(0, testComparisonExpression(4, 3, new SmallerEqualsOperator()));
	}
	
	@Test
	public void test_case_ExstExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(1, testComparisonExpression(1, 3, new SmallerThanOperator()));
		Assert.assertEquals(0, testComparisonExpression(3, 3, new SmallerThanOperator()));
		Assert.assertEquals(0, testComparisonExpression(4, 3, new SmallerThanOperator()));
	}
	
	@Test
	public void test_case_TilExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(1, testComparisonExpression(1, 3, new NotEqualsOperator()));
		Assert.assertEquals(0, testComparisonExpression(3, 3, new NotEqualsOperator()));
		Assert.assertEquals(1, testComparisonExpression(4, 3, new NotEqualsOperator()));
	}

	private int testComparisonExpression(
			int leftSide, int rightSide, IComparisonOperatorImplementation expressionType)
			throws UnsupportedException, VariableNotFoundInScopeException,
			IOException {
		IExpression expToTest = new ComparisonExpression(
				new IntegerExpression(leftSide),
				new IntegerExpression(rightSide), 
				expressionType);
		
		
		IStatement testStatement = getAssignmentStatement("result", expToTest);

		VariableDataType resultVariable = new VariableDataType("result", false);
		
		addVariableToDeclaration(resultVariable);
		loadDeclaration();
		
		testStatement.eval();
		
		return VariableManager.getInstance().getVariable("result").getValue();
	}
	
	@Test
	public void test_case_ComplexExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		//Tests the result of the expression (1 * 3) + 2 * 4
		IExpression parenthesesContent = new MathematicalExpression(
				new IntegerExpression(1),
				new IntegerExpression(3), 
				MathematicalExpressionType.Mul);
		
		IExpression parenExp = new ParenthesesExpression(parenthesesContent);
		
		IExpression multExp = new MathematicalExpression(
				new IntegerExpression(2),
				new IntegerExpression(4), 
				MathematicalExpressionType.Mul);
		
		IExpression addExp = new MathematicalExpression(
				parenExp,
				multExp, 
				MathematicalExpressionType.Add);
		
		IStatement testStatement = getAssignmentStatement("result", addExp);

		VariableDataType resultVariable = new VariableDataType("result", false);
		
		addVariableToDeclaration(resultVariable);
		loadDeclaration();
		
		testStatement.eval();
		
		Assert.assertEquals(11, VariableManager.getInstance().getVariable("result").getValue());
	}
}
