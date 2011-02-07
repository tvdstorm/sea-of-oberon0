package oberon.test;

import java.io.IOException;

import junit.framework.Assert;
import oberon.IExpression;
import oberon.IStatement;
import oberon.VariableManager;
import oberon.data.VariableDataType;
import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;
import oberon.expressions.AddOperator;
import oberon.expressions.DivOperator;
import oberon.expressions.IMathematicalOperator;
import oberon.expressions.IntegerExpression;
import oberon.expressions.MathematicalExpression;
import oberon.expressions.ModOperator;
import oberon.expressions.MulOperator;
import oberon.expressions.ParenthesesExpression;
import oberon.expressions.SubOperator;

import org.junit.Test;

public class MathematicalExpressionTest extends AbstractTest {
	
	@Test
	public void test_case_MulExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(3, testMathematicalExpression(1, 3, new MulOperator()));
		Assert.assertEquals(6, testMathematicalExpression(2, 3, new MulOperator()));
	}
	
	@Test
	public void test_case_SubExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(-2, testMathematicalExpression(1, 3, new SubOperator()));
		Assert.assertEquals(-1, testMathematicalExpression(2, 3, new SubOperator()));
	}
	
	@Test
	public void test_case_AddExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(4, testMathematicalExpression(1, 3, new AddOperator()));
		Assert.assertEquals(5, testMathematicalExpression(2, 3, new AddOperator()));
	}
	
	@Test
	public void test_case_DivExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(3, testMathematicalExpression(6, 2, new DivOperator()));
		//check rounding
		Assert.assertEquals(1, testMathematicalExpression(3, 2, new DivOperator()));
		Assert.assertEquals(5, testMathematicalExpression(35, 6, new DivOperator()));
		Assert.assertEquals(1, testMathematicalExpression(6, 5, new DivOperator()));
	}
	
	@Test
	public void test_case_ModExpressionTest() throws UnsupportedException, VariableNotFoundInScopeException, IOException{
		Assert.assertEquals(2, testMathematicalExpression(14, 3, new ModOperator()));
		Assert.assertEquals(0, testMathematicalExpression(15, 3, new ModOperator()));
	}

	private int testMathematicalExpression(
			int leftSide, int rightSide, IMathematicalOperator mathOperator)
			throws UnsupportedException, VariableNotFoundInScopeException,
			IOException {
		IExpression expToTest = new MathematicalExpression(
				new IntegerExpression(leftSide),
				new IntegerExpression(rightSide), 
				mathOperator);
		
		
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
		
		addVariableToDeclaration(resultVariable);
		loadDeclaration();
		
		testStatement.eval();
		
		Assert.assertEquals(11, VariableManager.getInstance().getVariable("result").getValue());
	}
}
