package oberon.test;

import oberon.exceptions.UnsupportedException;
import oberon.expressions.*;
import oberon.procedures.*;
import oberon.statement.*;
import oberon.data.*;
import oberon.*;

import java.io.IOException;
import java.util.*;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class WhileTest extends TestCase {

	@Test
	public void test_case_WhileTest1() throws UnsupportedException, IOException
	{
		ComparisonExpression condition = 
			new ComparisonExpression(new IdentifierExpression(new VariableIdentifier("i")), new IntegerExpression(5), ComparisonType.Exst);
		
		LinkedList<IStatement> statementList = new LinkedList<IStatement>();
		MathematicalExpression statement = new MathematicalExpression(new IdentifierExpression(new VariableIdentifier("i")), new IntegerExpression(1), MathematicalExpressionType.Add);
		statementList.add(new AssignmentStatement(new VariableIdentifier("i"), statement));
		StatementSequence statements = new StatementSequence(statementList);
		
		List<IDataType> variables = new ArrayList<IDataType>();
		variables.add(new VariableDataType("i", false));
		Declaration declaration = new Declaration(variables, new ArrayList<IProcedure>());
		VariableManager variableManager = VariableManager.getInstance();
		variableManager.addNewDeclaration(declaration);
		
		WhileStatement whileStat = new WhileStatement(condition, statements);
		whileStat.eval();
		
		Assert.assertEquals(5, variableManager.getVariable("i").getValue());
	}
}
