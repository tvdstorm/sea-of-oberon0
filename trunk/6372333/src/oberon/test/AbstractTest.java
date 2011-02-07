package oberon.test;

import java.util.ArrayList;
import java.util.List;

import oberon.IDataType;
import oberon.IExpression;
import oberon.IProcedure;
import oberon.IStatement;
import oberon.StatementSequence;
import oberon.VariableManager;
import oberon.data.VariableDataType;
import oberon.data.VariableIdentifier;
import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;
import oberon.expressions.ComparisonExpression;
import oberon.expressions.IComparisonOperator;
import oberon.expressions.IMathematicalOperator;
import oberon.expressions.IdentifierExpression;
import oberon.expressions.IntegerExpression;
import oberon.expressions.MathematicalExpression;
import oberon.procedures.Declaration;
import oberon.procedures.FormalParamSection;
import oberon.procedures.ProcedureBody;
import oberon.procedures.ProcedureHeading;
import oberon.statement.AssignmentStatement;

import org.junit.Before;

public abstract class AbstractTest {

	private Declaration declaration;
	private final ArrayList<IDataType> variables = new ArrayList<IDataType>();

    @Before
    public void setUp() {
    	enterNewEmptyScope();
    }
    
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
			IMathematicalOperator operator) {
				return new MathematicalExpression(new IdentifierExpression(
						new VariableIdentifier(variableName)), 
						new IntegerExpression(value), 
						operator);
			}

	protected IExpression getNewComparisonExpression(String variableName, int value,
			IComparisonOperator operatorImplementation) {
				return new ComparisonExpression(new IdentifierExpression(
						new VariableIdentifier(variableName)), 
						new IntegerExpression(value), 
						operatorImplementation);
			}

	protected IStatement getAssignmentStatement(String variableName, IExpression expression) {
		return new AssignmentStatement(new VariableIdentifier(variableName), expression);
	}

	protected void enterNewEmptyScope() {
		List<IDataType> actualProcedureParameters = new ArrayList<IDataType>();
		List<FormalParamSection> paramSections = new ArrayList<FormalParamSection>();
		List<IProcedure> procedures = new ArrayList<IProcedure>();
		List<IDataType> variables = new ArrayList<IDataType>();
		Declaration declaration = new Declaration(variables, procedures);
		List<IStatement> statementList = new ArrayList<IStatement>();
		StatementSequence statements = new StatementSequence(statementList );
		ProcedureBody body = new ProcedureBody(declaration, statements );
		IProcedure currentProcedure = new ProcedureHeading("test", paramSections, body);
		
		//enter a new scope
		VariableManager.getInstance().enterNewScope(actualProcedureParameters, currentProcedure);
	}
}
