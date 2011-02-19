package jdm.oberon0.interpreter.eval;

import jdm.oberon0.ast.expressions.*;
import jdm.oberon0.exceptions.DivisionByZeroException;
import jdm.oberon0.interpreter.InterpreterContext;
import jdm.oberon0.values.*;

/** 
 * Evaluator for Oberon0 expressions
 */
class ExpressionEvaluator extends ExpressionVisitor<Value> {
	private InterpreterContext _context;

	protected ExpressionEvaluator(InterpreterContext context) {
		_context = context;
	}
	
	protected Value eval(Expression e) {
		return e.accept(this);
	}

	/**
	 * Evaluate an expression and return as boolean.
	 */
	protected boolean evalBoolean(Expression e) {
		return e.accept(this).toBoolean().getValue();
	}
	
	/**
	 * Evaluate an expression and return an integer.
	 */
	protected int evalInteger(Expression e) {
		return e.accept(this).toInteger().getValue();
	}
	
	/**
	 * Evaluate an expression and return a reference.
	 */
	protected ReferenceValue evalRef(Expression e) {
		return ReferenceValue.getRef(e.accept(this));
	}
	
	/**
	 * Evaluate an expression and return an array.
	 */
	protected ArrayValue evalArray(Expression e) {
		return e.accept(this).toArray();
	}
	
	/**
	 * Evaluate an expression and return a record.
	 */
	protected RecordValue evalRecord(Expression e) {
		return e.accept(this).toRecord();
	}
	
	/**
	 * Helper function to wrap booleans.
	 */
	protected BooleanValue wrapBoolean(boolean b) {
		return _context.wrapBoolean(b);
	}

	/**
	 * Helper function to wrap integers.
	 */
	protected IntegerValue wrapInteger(int i) {
		return _context.wrapInteger(i);
	}

	/* -------------------
	 * Primary expressions
	 * -------------------
	 */
	
	@Override
	protected Value visitIdentifier(Identifier identifier) {
		String name = identifier.getName();
		return _context.getScope().lookupVarOrConst(name);
	}

	@Override
	protected Value visitIntegerLiteral(IntegerLiteral e) {
		return wrapInteger(e.getValue());
	}

	/* ------------------
	 * Binary expressions
	 * ------------------
	 */
	
	@Override
	protected Value visitGtExpression(GtExpression e) {
		return wrapBoolean(evalInteger(e.getLhs()) > evalInteger(e.getRhs()));
	}
	
	@Override
	protected Value visitGeExpression(GeExpression e) {
		return wrapBoolean(evalInteger(e.getLhs()) >= evalInteger(e.getRhs()));
	}

	@Override
	protected Value visitLtExpression(LtExpression e) {
		return wrapBoolean(evalInteger(e.getLhs()) < evalInteger(e.getRhs()));
	}

	@Override
	protected Value visitLeExpression(LeExpression e) {
		return wrapBoolean(evalInteger(e.getLhs()) <= evalInteger(e.getRhs()));
	}

	@Override
	protected Value visitEqExpression(EqExpression e) {
		return wrapBoolean(evalInteger(e.getLhs()) == evalInteger(e.getRhs()));
	}

	@Override
	protected Value visitNeExpression(NeExpression e) {
		return wrapBoolean(evalInteger(e.getLhs()) != evalInteger(e.getRhs()));
	}
	
	@Override
	protected Value visitAddExpression(AddExpression e) {
		return wrapInteger(evalInteger(e.getLhs()) + evalInteger(e.getRhs()));
	}

	@Override
	protected Value visitSubExpression(SubExpression e) {
		return wrapInteger(evalInteger(e.getLhs()) - evalInteger(e.getRhs()));
	}
	
	@Override
	protected Value visitMulExpression(MulExpression e) {
		return wrapInteger(evalInteger(e.getLhs()) * evalInteger(e.getRhs()));
	}

	@Override
	protected Value visitDivExpression(DivExpression e) {
		int lhs = evalInteger(e.getLhs());
		int rhs = evalInteger(e.getRhs());
		
		if (rhs == 0) {
			throw new DivisionByZeroException();
		}
		return wrapInteger(lhs / rhs);
	}

	@Override
	protected Value visitModExpression(ModExpression e) {
		int lhs = evalInteger(e.getLhs());
		int rhs = evalInteger(e.getRhs());
		
		if (rhs == 0) {
			throw new DivisionByZeroException();
		}
		return wrapInteger(lhs % rhs);
	}

	@Override
	protected Value visitAndExpression(AndExpression e) {
		return wrapBoolean(evalBoolean(e.getLhs()) && evalBoolean(e.getRhs()));
	}

	@Override
	protected Value visitOrExpression(OrExpression e) {
		return wrapBoolean(evalBoolean(e.getLhs()) || evalBoolean(e.getRhs()));
	}
	
	/* -----------------
	 * Unary expressions
	 * -----------------
	 */
	
	@Override
	protected Value visitNegExpression(NegExpression e) {
		return wrapInteger(-evalInteger(e.getArgument()));
	}

	@Override
	protected Value visitPosExpression(PosExpression e) {
		return wrapInteger(+evalInteger(e.getArgument()));
	}

	@Override
	protected Value visitNotExpression(NotExpression e) {
		return wrapBoolean(!evalBoolean(e.getArgument()));
	}
	
	/* --------------------
	 * Selector expressions
	 * --------------------
	 */
	
	@Override
	protected Value visitArraySelector(ArraySelector selector) {
		ArrayValue base = evalArray(selector.getBase());
		int index = evalInteger(selector.getIndex());
		return base.getValueAt(index);
	}
	
	@Override
	protected Value visitRecordSelector(RecordSelector selector) {
		RecordValue base = evalRecord(selector.getBase());
		return base.getFieldValue(selector.getName());
	}
}
