package oberon.test;

import java.io.IOException;

import junit.framework.Assert;
import oberon.IExpression;
import oberon.IStatement;
import oberon.VariableManager;
import oberon.data.VariableDataType;
import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;
import oberon.expressions.ComparisonExpression;
import oberon.expressions.ComparisonType;
import oberon.expressions.IntegerExpression;
import oberon.expressions.MathematicalExpression;
import oberon.expressions.MathematicalExpressionType;
import oberon.expressions.ParenthesesExpression;

import org.junit.Test;

public class ComparisonExpressionTest extends AbstractTest {
	
	@Test
	public void test_case_AmpExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(1, testComparisonExpression(3, 3, ComparisonType.Amp));
		Assert.assertEquals(0, testComparisonExpression(2, 3, ComparisonType.Amp));
		Assert.assertEquals(1, testComparisonExpression(1, 1, ComparisonType.Amp));
	}
	
	@Test
	public void test_case_ExeqExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(0, testComparisonExpression(1, 3, ComparisonType.Exeq));
		Assert.assertEquals(0, testComparisonExpression(2, 3, ComparisonType.Exeq));
		Assert.assertEquals(1, testComparisonExpression(3, 3, ComparisonType.Exeq));
	}
	
	@Test
	public void test_case_ExgeExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(0, testComparisonExpression(1, 3, ComparisonType.Exge));
		Assert.assertEquals(1, testComparisonExpression(3, 3, ComparisonType.Exge));
		Assert.assertEquals(1, testComparisonExpression(4, 3, ComparisonType.Exge));
	}
	
	@Test
	public void test_case_ExgtExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(0, testComparisonExpression(1, 3, ComparisonType.Exgt));
		Assert.assertEquals(0, testComparisonExpression(3, 3, ComparisonType.Exgt));
		Assert.assertEquals(1, testComparisonExpression(4, 3, ComparisonType.Exgt));
	}
	
	@Test
	public void test_case_ExseExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(1, testComparisonExpression(1, 3, ComparisonType.Exse));
		Assert.assertEquals(1, testComparisonExpression(3, 3, ComparisonType.Exse));
		Assert.assertEquals(0, testComparisonExpression(4, 3, ComparisonType.Exse));
	}
	
	@Test
	public void test_case_ExstExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(1, testComparisonExpression(1, 3, ComparisonType.Exst));
		Assert.assertEquals(0, testComparisonExpression(3, 3, ComparisonType.Exst));
		Assert.assertEquals(0, testComparisonExpression(4, 3, ComparisonType.Exst));
	}
	
	@Test
	public void test_case_TilExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(1, testComparisonExpression(1, 3, ComparisonType.Til));
		Assert.assertEquals(0, testComparisonExpression(3, 3, ComparisonType.Til));
		Assert.assertEquals(1, testComparisonExpression(4, 3, ComparisonType.Til));
	}

	private int testComparisonExpression(
			int leftSide, int rightSide, ComparisonType expressionType)
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
