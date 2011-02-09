package oberon.test;

import java.io.IOException;
import java.util.LinkedList;

import junit.framework.Assert;
import oberon.IExpression;
import oberon.IStatement;
import oberon.Scope;
import oberon.StatementSequence;
import oberon.data.VariableDataType;
import oberon.exceptions.ProcedureParamaterCountMismatchException;
import oberon.exceptions.VariableNotFoundInScopeException;
import oberon.expressions.AddOperator;
import oberon.expressions.SmallerThanOperator;
import oberon.statement.WhileStatement;

import org.junit.Test;

public class WhileTest extends AbstractTest {
	
	@Test
	public void test_case_WhileTestWithValidCondition() throws ProcedureParamaterCountMismatchException, IOException, VariableNotFoundInScopeException
	{
		//Get the condition, "i <= 5"
		IExpression condition = getNewComparisonExpression("i", 5, new SmallerThanOperator());
		
		LinkedList<IStatement> statementList = new LinkedList<IStatement>();
		//Get the expression, "i + 1"
		IExpression expression = getNewMathematicalExpression("i", 1, new AddOperator());
		//Assign the result of the statement, "i = i + 1"
		IStatement statement = getAssignmentStatement("i", expression);
		
		statementList.add(statement);
		StatementSequence statements = new StatementSequence(statementList);
		
		//Declare the variable i
		VariableDataType inputVariable = new VariableDataType("i", false);
		
		Scope newScope = new Scope();
		
		addVariableToDeclaration(inputVariable);
		loadDeclaration(newScope);
		
		//Create new while statement
		WhileStatement whileStat = new WhileStatement(condition, statements);
		whileStat.eval(newScope);
		
		Assert.assertEquals(5, newScope.getVariable("i").getValue(newScope));
	}

	@Test
	public void test_case_WhileTestWithImmediatelyTrueCondition() throws ProcedureParamaterCountMismatchException, IOException, VariableNotFoundInScopeException
	{
		//Get the condition, "i <= 5"
		IExpression condition = getNewComparisonExpression("trueConst", 5, new SmallerThanOperator());
		
		LinkedList<IStatement> statementList = new LinkedList<IStatement>();
		//Get the expression, "i + 1"
		IExpression expression = getNewMathematicalExpression("i", 1, new AddOperator());
		//Assign the result of the statement, "i = i + 1"
		IStatement statement = getAssignmentStatement("i", expression);
		
		statementList.add(statement);
		StatementSequence statements = new StatementSequence(statementList);
		
		//Declare the variable i
		VariableDataType inputVariable = new VariableDataType("i", false);
		VariableDataType trueConst = new VariableDataType("trueConst", 6, true);
		
		Scope newScope = new Scope();
		
		addVariableToDeclaration(inputVariable);
		addVariableToDeclaration(trueConst);
		loadDeclaration(newScope);
		
		//Create new while statement
		WhileStatement whileStat = new WhileStatement(condition, statements);
		whileStat.eval(newScope);
		
		//i should be 0 as the body of the while is never executed
		Assert.assertEquals(0, newScope.getVariable("i").getValue(newScope));
	}
}
