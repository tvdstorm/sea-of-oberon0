package oberon.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;
import oberon.IDataType;
import oberon.IProcedure;
import oberon.IStatement;
import oberon.StatementSequence;
import oberon.VariableManager;
import oberon.data.VariableDataType;
import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;
import oberon.procedures.Declaration;
import oberon.procedures.FormalParamSection;
import oberon.procedures.ProcedureBody;
import oberon.procedures.ProcedureHeading;

import org.junit.Test;


public class VariableManagerTest extends AbstractTest {
	
	@Test
	public void test_case_VariableManagerAddVariableToScopeAndRetrieve() throws UnsupportedException, VariableNotFoundInScopeException{
		VariableDataType trueConst = new VariableDataType("trueConst", 6, true);
		
		addVariableToDeclaration(trueConst);
		loadDeclaration();
		
		//should be 6 as the trueconst variable should be within the current scope
		Assert.assertEquals(6, VariableManager.getInstance().getVariable("trueConst").getValue());
	}
	
	@Test(expected=VariableNotFoundInScopeException.class)
	public void test_case_VariableManagerAddVariableToScopeAndRetrieveAfterEnteringNewScope() 
	throws UnsupportedException, VariableNotFoundInScopeException{
		VariableDataType trueConst = new VariableDataType("trueConst", 6, true);
		
		addVariableToDeclaration(trueConst);
		loadDeclaration();
		
		List<IDataType> actualProcedureParameters = new ArrayList<IDataType>();
		List<FormalParamSection> paramSections = new ArrayList<FormalParamSection>();
		List<IProcedure> procedures = new ArrayList<IProcedure>();
		List<IDataType> variables = new ArrayList<IDataType>();
		Declaration declaration = new Declaration(variables, procedures);
		List<IStatement> statementList = new ArrayList<IStatement>();
		StatementSequence statements = new StatementSequence(statementList );
		ProcedureBody body = new ProcedureBody(declaration, statements );
		IProcedure currentProcedure = new ProcedureHeading("test", paramSections, body);
		VariableManager.getInstance().enterNewScope(actualProcedureParameters, currentProcedure);
		
		//should be 0 as the trueconst variable should not be within the current scope
		Assert.assertEquals(0, VariableManager.getInstance().getVariable("trueConst").getValue());
	}
	
	@Test
	public void test_case_VariableManagerVariablesInPreviousScopeAreRestoredAfterLeavingTheScope() 
	throws UnsupportedException, VariableNotFoundInScopeException{
		VariableDataType trueConst = new VariableDataType("trueConst", 6, true);
		
		addVariableToDeclaration(trueConst);
		loadDeclaration();
		
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
		
		//leave the scope
		VariableManager.getInstance().leaveScope();
		
		//should be 6 as the trueconst variable should be within the current scope
		Assert.assertEquals(6, VariableManager.getInstance().getVariable("trueConst").getValue());
	}
}
