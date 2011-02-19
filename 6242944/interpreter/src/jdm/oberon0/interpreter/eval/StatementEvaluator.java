package jdm.oberon0.interpreter.eval;

import jdm.oberon0.ast.expressions.Expression;
import jdm.oberon0.ast.statements.*;
import jdm.oberon0.interpreter.Callable;
import jdm.oberon0.interpreter.InterpreterContext;
import jdm.oberon0.values.RecordValue;
import jdm.oberon0.values.ReferenceValue;
import jdm.oberon0.values.Value;

/**
 * Evaluator for Oberon0 statements
 */
class StatementEvaluator extends StatementVisitor {
	private InterpreterContext _context;
	private ExpressionEvaluator _exprEval;
	
	public StatementEvaluator(InterpreterContext context) {
		_context = context;
		_exprEval = new ExpressionEvaluator(context);
	}

	@Override
	protected void visitAssignment(Assignment assignment) {
		// Note: setValue ensures correct types
		ReferenceValue lhs = _exprEval.evalRef(assignment.getLhs());
		Value rhs = _exprEval.eval(assignment.getRhs());
		lhs.setValue(rhs);
	}

	@Override
	protected void visitProcedureCall(ProcedureCall procedureCall) {		
		// get callable
		String name = procedureCall.getName();
		Callable callable = _context.getScope().lookupProcedure(name);

		// create arguments for procedure
		// note: type checker has checked argument count and argument types
		Expression[] argExprs = procedureCall.getArgs();
		
		// evaluate actual arguments
		Value[] args = new Value[argExprs.length];
		
		for(int i=0; i<argExprs.length; i++) {
			args[i] = _exprEval.eval(argExprs[i]);
		}
		
		// execute the procedure
		callable.execute(_context, args);
	}

	@Override
	protected void visitStatementSequence(StatementSequence sequence) {
		for (Statement s : sequence.getStatements()) {
			execute(s);
		}
	}
	
	@Override
	protected void visitIfStatement(IfStatement statement) {
		if (_exprEval.evalBoolean(statement.getTest())) {
			execute(statement.getThen());
		} else if (statement.getElse() != null) {
			execute(statement.getElse());
		}
	}

	@Override
	protected void visitWhileStatement(WhileStatement statement) {
		while(_exprEval.evalBoolean(statement.getTest())) {
			execute(statement.getBody());
		}
	}

	@Override
	protected void visitWithStatement(WithStatement statement) {
		RecordValue record = _exprEval.evalRecord(statement.getValue());
		_context.pushScope();
		for(String field : record.getFields()) {
			_context.getScope().defineVar(field, record.getFieldValue(field));
		}
		statement.getBody().accept(this);
		_context.popScope();
	}
	
	protected void execute(Statement s) {
		s.accept(this);
	}
}
