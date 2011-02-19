package jdm.oberon0.typechecker.typecheck;

import jdm.oberon0.ast.expressions.Expression;
import jdm.oberon0.ast.statements.*;
import jdm.oberon0.exceptions.InvalidArgumentCountException;
import jdm.oberon0.exceptions.InvalidTypeException;
import jdm.oberon0.typechecker.TypeCheckerContext;
import jdm.oberon0.types.ProcedureType;
import jdm.oberon0.types.RecordType;
import jdm.oberon0.types.ReferenceType;
import jdm.oberon0.types.Type;

/**
 * Evaluator for Oberon0 statements
 */
class StatementChecker extends StatementVisitor {
	private TypeCheckerContext _context;
	private ExpressionChecker _exprChecker;
	
	public StatementChecker(TypeCheckerContext context) {
		_context = context;
		_exprChecker = new ExpressionChecker(context);
	}

	@Override
	protected void visitAssignment(Assignment assignment) {
		Type rhsType = assignment.getRhs().accept(_exprChecker);
		Type lhsType = _exprChecker.checkReference(assignment.getLhs());
		
		if (!lhsType.equals(rhsType)) {
			throw new InvalidTypeException(lhsType.toString());
		}
	}

	@Override
	protected void visitProcedureCall(ProcedureCall procedureCall) {
		// check whether actual arguments match formal arguments
		String name = procedureCall.getName();
		ProcedureType type = _context.getScope().lookupProcedure(name);
		
		Type[] formalTypes = type.getArgumentTypes();
		
		// create arguments for procedure
		Expression[] argExprs = procedureCall.getArgs();

		// evaluate actual argument types
		Type[] actualTypes = new Type[argExprs.length];
		
		for(int i=0; i<argExprs.length; i++) {
			actualTypes[i] = argExprs[i].accept(_exprChecker);
		}

		
		if (formalTypes.length != actualTypes.length) {
			throw new InvalidArgumentCountException(actualTypes.length, formalTypes.length);
		}
		
		for(int i=0; i<formalTypes.length; i++) {
			Type formal = formalTypes[i];
			Type actual = actualTypes[i];
			
			if (formal instanceof ReferenceType) {
				if (!(actual instanceof ReferenceType)) {
					throw new InvalidTypeException("reference");
				}
				formal = ((ReferenceType)formal).getType();
				actual = ((ReferenceType)actual).getType();
			}
			if (!formal.equals(actual)) {
				throw new InvalidTypeException(formal.toString());
			}
		}
	}

	@Override
	protected void visitStatementSequence(StatementSequence sequence) {
		for (Statement s : sequence.getStatements()) {
			check(s);
		}
	}
	
	@Override
	protected void visitIfStatement(IfStatement statement) {
		_exprChecker.checkBoolean(statement.getTest());
		check(statement.getThen());
		
		if (statement.getElse() != null) {
			check(statement.getElse());
		}
	}

	@Override
	protected void visitWhileStatement(WhileStatement statement) {
		_exprChecker.checkBoolean(statement.getTest());
		check(statement.getBody());
	}

	@Override
	protected void visitWithStatement(WithStatement statement) {
		// check that value is a record
		RecordType record = _exprChecker.checkRecord(statement.getValue());
		
		// import fields in new scope
		_context.pushScope();
		
		for(String field : record.getFields()) {
			_context.getScope().defineVar(field, record.getFieldType(field));
		}
		
		check(statement.getBody());
		_context.popScope();
	}
	
	protected void check(Statement s) {
		s.accept(this);
	}
}
