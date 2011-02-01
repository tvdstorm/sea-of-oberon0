package oberon.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import oberon.AssignmentStatement;
import oberon.ComparisonExpression;
import oberon.ComparisonType;
import oberon.ConstVariable;
import oberon.Declaration;
import oberon.IntegerExpression;
import oberon.MathematicalExpression;
import oberon.MathematicalExpressionType;
import oberon.ProcedureHeading;
import oberon.Statement;
import oberon.StatementSequence;
import oberon.WhileStatement;
import oberon.data.VariableManager;
import junit.framework.TestCase;

public class WhileTest extends TestCase {
	public void test_case_WhileTest1()
	{
//		ComparisonExpression condition = 
//			new ComparisonExpression(new IdentifierExpression("i"), new IntegerExpression(5), ComparisonType.Exst);
//		
//		LinkedList<Statement> statementList = new LinkedList<Statement>();
//		MathematicalExpression statement = new MathematicalExpression(new IdentifierExpression("i"), new IntegerExpression(1), MathematicalExpressionType.Add);
//		statementList.add(new AssignmentStatement("i", statement));
//		StatementSequence statements = new StatementSequence(statementList);
//		
//		List<VarDeclaration> varVariables = new ArrayList<VarDeclaration>();
//		varVariables.add(new VarDeclaration("i", VarType.Identifier));
//		Declaration declaration = new Declaration(new ArrayList<ConstVariable>(), varVariables , new ArrayList<ProcedureHeading>());
//		VariableManager.getInstance().AddNewDeclaration(declaration);
//		
//		WhileStatement whileStat = new WhileStatement(condition, statements);
//		try {
//			whileStat.Eval();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
