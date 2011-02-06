package oberon.test;

import java.util.ArrayList;

import junit.framework.TestCase;
import oberon.IDataType;
import oberon.IExpression;
import oberon.IProcedure;
import oberon.IStatement;
import oberon.VariableManager;
import oberon.data.VariableDataType;
import oberon.data.VariableIdentifier;
import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;
import oberon.expressions.ComparisonExpression;
import oberon.expressions.ComparisonType;
import oberon.expressions.IdentifierExpression;
import oberon.expressions.IntegerExpression;
import oberon.expressions.MathematicalExpression;
import oberon.expressions.MathematicalExpressionType;
import oberon.procedures.Declaration;
import oberon.statement.AssignmentStatement;

public abstract class AbstractTest {

	private Declaration declaration;
	private final ArrayList<IDataType> variables = new ArrayList<IDataType>();


	protected void loadDeclaration() throws UnsupportedException, VariableNotFoundInScopeException {
		declaration = new Declaration(variables, new ArrayList<IProcedure>());
		VariableManager variableManager = VariableManager.getInstance();
		variableManager.addNewDeclaration(declaration);
	}

	protected void addVariableToDeclaration(
			VariableDataType inputVariable) {
		variables.add(inputVariable);
	}

	protected IExpression getNewMathematicalExpression(String variableName, int value,
			MathematicalExpressionType type) {
				return new MathematicalExpression(new IdentifierExpression(
						new VariableIdentifier(variableName)), 
						new IntegerExpression(value), 
						type);
			}

	protected IExpression getNewComparisonExpression(String variableName, int value,
			ComparisonType type) {
				return new ComparisonExpression(new IdentifierExpression(
						new VariableIdentifier(variableName)), 
						new IntegerExpression(value), 
						type);
			}

	protected IStatement getAssignmentStatement(String variableName, IExpression expression) {
		return new AssignmentStatement(new VariableIdentifier("i"), expression);
	}
}
