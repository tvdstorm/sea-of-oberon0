package eu.wietsevenema.lang.oberon.ast.visitors.typechecker;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import xtc.tree.Visitor;
import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.expressions.ProcedureUndefinedException;
import eu.wietsevenema.lang.oberon.ast.statements.AssignmentStatement;
import eu.wietsevenema.lang.oberon.ast.statements.ElseIfStatement;
import eu.wietsevenema.lang.oberon.ast.statements.IfStatement;
import eu.wietsevenema.lang.oberon.ast.statements.ProcedureCallStatement;
import eu.wietsevenema.lang.oberon.ast.statements.Statement;
import eu.wietsevenema.lang.oberon.ast.statements.WhileStatement;
import eu.wietsevenema.lang.oberon.ast.statements.WithStatement;
import eu.wietsevenema.lang.oberon.ast.types.BooleanType;
import eu.wietsevenema.lang.oberon.ast.types.RecordType;
import eu.wietsevenema.lang.oberon.ast.types.VarType;
import eu.wietsevenema.lang.oberon.exceptions.IdentifierExpectedInParamList;
import eu.wietsevenema.lang.oberon.exceptions.ImmutableException;
import eu.wietsevenema.lang.oberon.exceptions.SymbolAlreadyDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.SymbolNotDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.TypeMismatchException;
import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.exceptions.WrongNumberOfArgsException;
import eu.wietsevenema.lang.oberon.interpreter.Formal;
import eu.wietsevenema.lang.oberon.interpreter.Procedure;
import eu.wietsevenema.lang.oberon.typechecker.TypeCheckerScope;

public class StatementChecker extends Visitor {

	TypeCheckerScope scope;

	public StatementChecker(TypeCheckerScope scope) {
		this.scope = scope;
	}

	public void visit(AssignmentStatement assign) throws SymbolNotDeclaredException, TypeMismatchException,
			ImmutableException {

		ExpressionChecker exprChecker = new ExpressionChecker(scope);

		// 1. Retrieve type of left hand side.
		VarType leftType = (VarType) exprChecker.dispatch(assign.getIdentifier());

		// 2. Evaluate expression
		VarType rightType = (VarType) exprChecker.dispatch(assign.getExpression());

		// 3. Do deep comparison.
		
		if (!typeResolvedEquals(leftType, rightType, scope)) {
			throw new TypeMismatchException(assign.getLocation() + ": Type mismatch in assignment.");
		}
	}
	
	private boolean typeResolvedEquals(VarType left, VarType right, TypeCheckerScope scope){
		TypeAliasResolver resolver = new TypeAliasResolver(scope);
		left = (VarType) resolver.dispatch(left);
		right = (VarType) resolver.dispatch(right);
		return left.equals(right);
	}
	

	public void visit(ProcedureCallStatement pCall) throws WrongNumberOfArgsException, IdentifierExpectedInParamList,
			SymbolAlreadyDeclaredException, SymbolNotDeclaredException, TypeMismatchException,
			ProcedureUndefinedException, ValueUndefinedException, ImmutableException {

		// Find procedure node.
		Procedure procedure = (Procedure) scope.lookupProc(pCall.getIdentifier().getName());

		if (procedure == null) {
			throw new ProcedureUndefinedException("Procedure " + pCall.getIdentifier().getName() + " undefined.");
		}

		// Enter scope.
		scope = new TypeCheckerScope(scope);

		ExpressionChecker exprChecker = new ExpressionChecker(scope);

		List<Expression> parameters = pCall.getParameters();
		List<Formal> formals = procedure.getFormals();

		if (formals.size() != parameters.size()) {
			throw new WrongNumberOfArgsException();
		}
		for (int i = 0; i < formals.size(); i++) {
			Formal formal = formals.get(i);
			Expression parameter = parameters.get(i);

			// Resolve type of parameter
			VarType paramType = (VarType) exprChecker.dispatch(parameter);

			// Check type of parameter matches type of Formal.
			typeResolvedEquals(formal.getVarType(), paramType, scope);

			// Declare parameter in local scope.
			String symbol = formal.getIdentifier().getName();
			scope.declareValueType(symbol, paramType);
		}

		// Exit scope
		scope = scope.getParent();

	}

	public void visit(WithStatement withStatement) throws SymbolAlreadyDeclaredException, TypeMismatchException {
		ExpressionChecker exprChecker = new ExpressionChecker(scope);
		VarType type = (VarType) exprChecker.dispatch(withStatement.getRecord());
		
		if (!(type instanceof RecordType)) {
			throw new TypeMismatchException(withStatement.getRecord().getLocation() + ": expected RECORD");
		}
		RecordType recordType = (RecordType) type;

		// Enter new scope and expose members of record.
		scope = new TypeCheckerScope(scope);
		for (Entry<Identifier, VarType> entry : recordType.entrySet()) {
			Identifier id = entry.getKey();
			VarType valueType = entry.getValue();
			String symbol = id.getName();
			scope.declareValueType(symbol, valueType);
		}

		// Check all statements
		visitStatements(withStatement.getStatements());

		// Exit scope
		scope = scope.getParent();

	}

	public void visit(IfStatement ifStatement) throws TypeMismatchException, ValueUndefinedException {

		visitStatements(ifStatement.getTrueStatements());

		for (Iterator<ElseIfStatement> iterator = ifStatement.getElseIfs().iterator(); iterator.hasNext();) {
			ElseIfStatement elseif = (ElseIfStatement) iterator.next();

			checkCondition(elseif.getCondition());
			visitStatements(elseif.getTrueStatements());
		}

		visitStatements(ifStatement.getFalseStatements());

	}

	private void visitStatements(List<Statement> statements) {
		if (!statements.isEmpty()) {
			StatementChecker statChecker = new StatementChecker(scope);
			for (Statement stat : statements) {
				statChecker.dispatch(stat);
			}
		}
	}

	private void checkCondition(Expression exp) throws TypeMismatchException {
		ExpressionChecker exprChecker = new ExpressionChecker(scope);
		VarType type = (VarType) exprChecker.dispatch(exp);
		if (!(type instanceof BooleanType)) {
			throw new TypeMismatchException(exp.getLocation() + ": expected BOOLEAN");
		}
	}

	public void visit(WhileStatement whilestat) throws TypeMismatchException {
		checkCondition(whilestat.getCondition());
		visitStatements(whilestat.getStatements());
	}

}
