package randy.ast.visitor;

import randy.ast.OArraySelector;
import randy.ast.OArrayVarDeclaration;
import randy.ast.OAssignmentStatement;
import randy.ast.OBlock;
import randy.ast.OBooleanLiteral;
import randy.ast.OConstDeclaration;
import randy.ast.OExpressionStatement;
import randy.ast.OIfStatement;
import randy.ast.OInfixExpression;
import randy.ast.OIntegerLiteral;
import randy.ast.OModule;
import randy.ast.OPrefixExpression;
import randy.ast.OProcedureCall;
import randy.ast.OProcedureDeclaration;
import randy.ast.OVarDeclaration;
import randy.ast.OVariable;
import randy.ast.OVariableSelector;
import randy.ast.OWhileStatement;
import randy.exception.Oberon0Exception;

public interface OASTNodeVisitor
{
	public void visitBefore(OArraySelector arraySelector) throws Oberon0Exception;
	public void visit(OArraySelector arraySelector) throws Oberon0Exception;
	public void visitAfter(OArraySelector arraySelector) throws Oberon0Exception;
	
	public void visitBefore(OArrayVarDeclaration arrayVarDeclaration) throws Oberon0Exception;
	public void visit(OArrayVarDeclaration arrayVarDeclaration) throws Oberon0Exception;
	public void visitAfter(OArrayVarDeclaration arrayVarDeclaration) throws Oberon0Exception;
	
	public void visitBefore(OAssignmentStatement assignmentStatement) throws Oberon0Exception;
	public void visit(OAssignmentStatement assignmentStatement) throws Oberon0Exception;
	public void visitAfter(OAssignmentStatement assignmentStatement) throws Oberon0Exception;
	
	public void visitBefore(OBlock block) throws Oberon0Exception;
	public void visit(OBlock block) throws Oberon0Exception;
	public void visitAfter(OBlock block) throws Oberon0Exception;
	
	public void visitBefore(OBooleanLiteral booleanLiteral) throws Oberon0Exception;
	public void visit(OBooleanLiteral booleanLiteral) throws Oberon0Exception;
	public void visitAfter(OBooleanLiteral booleanLiteral) throws Oberon0Exception;
	
	public void visitBefore(OConstDeclaration constDeclaration) throws Oberon0Exception;
	public void visit(OConstDeclaration constDeclaration) throws Oberon0Exception;
	public void visitAfter(OConstDeclaration constDeclaration) throws Oberon0Exception;
	
	public void visitBefore(OExpressionStatement expressionStatement) throws Oberon0Exception;
	public void visit(OExpressionStatement expressionStatement) throws Oberon0Exception;
	public void visitAfter(OExpressionStatement expressionStatement) throws Oberon0Exception;
	
	public void visitBefore(OIfStatement ifStatement) throws Oberon0Exception;
	public void visit(OIfStatement ifStatement) throws Oberon0Exception;
	public void visitAfter(OIfStatement ifStatement) throws Oberon0Exception;
	
	public void visitBefore(OInfixExpression infixExpression) throws Oberon0Exception;
	public void visit(OInfixExpression infixExpression) throws Oberon0Exception;
	public void visitAfter(OInfixExpression infixExpression) throws Oberon0Exception;
	
	public void visitBefore(OIntegerLiteral integerLiteral) throws Oberon0Exception;
	public void visit(OIntegerLiteral integerLiteral) throws Oberon0Exception;
	public void visitAfter(OIntegerLiteral integerLiteral) throws Oberon0Exception;
	
	public void visitBefore(OModule module) throws Oberon0Exception;
	public void visit(OModule module) throws Oberon0Exception;
	public void visitAfter(OModule module) throws Oberon0Exception;
	
	public void visitBefore(OPrefixExpression prefixExpression) throws Oberon0Exception;
	public void visit(OPrefixExpression prefixExpression) throws Oberon0Exception;
	public void visitAfter(OPrefixExpression prefixExpression) throws Oberon0Exception;
	
	public void visitBefore(OProcedureCall procedureCall) throws Oberon0Exception;
	public void visit(OProcedureCall procedureCall) throws Oberon0Exception;
	public void visitAfter(OProcedureCall procedureCall) throws Oberon0Exception;
	
	public void visitBefore(OProcedureDeclaration procedureDeclaration) throws Oberon0Exception;
	public void visit(OProcedureDeclaration procedureDeclaration) throws Oberon0Exception;
	public void visitAfter(OProcedureDeclaration procedureDeclaration) throws Oberon0Exception;
	
	public void visitBefore(OVarDeclaration varDeclaration) throws Oberon0Exception;
	public void visit(OVarDeclaration varDeclaration) throws Oberon0Exception;
	public void visitAfter(OVarDeclaration varDeclaration) throws Oberon0Exception;
	
	public void visitBefore(OVariable variable) throws Oberon0Exception;
	public void visit(OVariable variable) throws Oberon0Exception;
	public void visitAfter(OVariable variable) throws Oberon0Exception;
	
	public void visitBefore(OVariableSelector variableSelector) throws Oberon0Exception;
	public void visit(OVariableSelector variableSelector) throws Oberon0Exception;
	public void visitAfter(OVariableSelector variableSelector) throws Oberon0Exception;
	
	public void visitBefore(OWhileStatement whileStatement) throws Oberon0Exception;
	public void visit(OWhileStatement whileStatement) throws Oberon0Exception;
	public void visitAfter(OWhileStatement whileStatement) throws Oberon0Exception;
}