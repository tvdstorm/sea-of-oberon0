package jdm.oberon0.typechecker.typecheck;

import jdm.oberon0.ast.expressions.*;
import jdm.oberon0.exceptions.InvalidTypeException;
import jdm.oberon0.exceptions.UndefinedFieldException;
import jdm.oberon0.typechecker.TypeCheckerContext;
import jdm.oberon0.types.*;

/** 
 * Evaluator for Oberon0 expressions
 */
class ExpressionChecker extends ExpressionVisitor<Type> {
	private TypeCheckerContext _context;

	protected ExpressionChecker(TypeCheckerContext context) {
		_context = context;
	}
	
	@Override
	protected Type visitIdentifier(Identifier identifier) {
		String name = identifier.getName();
		return _context.getScope().lookupVarOrConst(name);
	}

	@Override
	protected Type visitIntegerLiteral(IntegerLiteral e) {
		return PrimitiveType.Integer;
	}

	/* ------------------
	 * Binary expressions
	 * ------------------
	 */
	protected ArrayType checkArray(Expression e) {
		Type t = e.accept(this);
		if (t instanceof ReferenceType) { //XXX!!!
			t = ((ReferenceType)t).getType();
		}
		if (!(t instanceof ArrayType)) {
			throw new InvalidTypeException("array");
		}
		return (ArrayType)t;
	}
	
	protected RecordType checkRecord(Expression e) {
		Type t = e.accept(this);
		if (t instanceof ReferenceType) { //XXX!!!
			t = ((ReferenceType)t).getType();
		}
		if (!(t instanceof RecordType)) {
			throw new InvalidTypeException("record");
		}
		return (RecordType)t;
	}
	
	protected void check(Expression e, Type expected) {
		Type actual = e.accept(this);
		if (!actual.equals(expected)) {
			throw new InvalidTypeException(expected.toString()); 
		}
	}
	
	protected void checkInteger(Expression e) {
		check(e, PrimitiveType.Integer);
	}

	protected void checkBoolean(Expression e) {
		check(e, PrimitiveType.Boolean);
	}
	
	protected Type checkRelational(BinaryExpression e) {
		checkInteger(e.getLhs());
		checkInteger(e.getRhs());
		return PrimitiveType.Boolean;
	}
	
	protected Type checkArithmetic(BinaryExpression e) {
		checkInteger(e.getLhs());
		checkInteger(e.getRhs());
		return PrimitiveType.Integer;
	}

	protected Type checkAndOr(BinaryExpression e) {
		checkBoolean(e.getLhs());
		checkBoolean(e.getRhs());
		return PrimitiveType.Boolean;
	}
	
	@Override
	protected Type visitGtExpression(GtExpression e) {
		return checkRelational(e);
	}
	
	@Override
	protected Type visitGeExpression(GeExpression e) {
		return checkRelational(e);
	}

	@Override
	protected Type visitLtExpression(LtExpression e) {
		return checkRelational(e);
	}

	@Override
	protected Type visitLeExpression(LeExpression e) {
		return checkRelational(e);
	}

	@Override
	protected Type visitEqExpression(EqExpression e) {
		return checkRelational(e);
	}

	@Override
	protected Type visitNeExpression(NeExpression e) {
		return checkRelational(e);
	}
	
	@Override
	protected Type visitAddExpression(AddExpression e) {
		return checkArithmetic(e);
	}

	@Override
	protected Type visitSubExpression(SubExpression e) {
		return checkArithmetic(e);
	}
	
	@Override
	protected Type visitMulExpression(MulExpression e) {
		return checkArithmetic(e);
	}

	@Override
	protected Type visitDivExpression(DivExpression e) {
		return checkArithmetic(e);
	}

	@Override
	protected Type visitModExpression(ModExpression e) {
		return checkArithmetic(e);
	}

	@Override
	protected Type visitAndExpression(AndExpression e) {
		return checkAndOr(e);
	}

	@Override
	protected Type visitOrExpression(OrExpression e) {
		return checkAndOr(e);
	}
	
	/* -----------------
	 * Unary expressions
	 * -----------------
	 */
	
	@Override
	protected Type visitNegExpression(NegExpression e) {
		checkInteger(e.getArgument());
		return PrimitiveType.Integer;
	}

	@Override
	protected Type visitPosExpression(PosExpression e) {
		checkInteger(e.getArgument());
		return PrimitiveType.Integer;
	}

	@Override
	protected Type visitNotExpression(NotExpression e) {
		checkBoolean(e.getArgument());
		return PrimitiveType.Boolean;
	}
	
	/* --------------------
	 * Selector expressions
	 * --------------------
	 */
	
	@Override
	protected Type visitArraySelector(ArraySelector selector) {
		// check base is an array and index is an integer
		ArrayType base = checkArray(selector.getBase());
		checkInteger(selector.getIndex());
		return base.getElementType();
	}
	
	@Override
	protected Type visitRecordSelector(RecordSelector selector) {
		// check that base is a record and contains this field
		RecordType base = checkRecord(selector.getBase());
		String name = selector.getName();
		
		if (!base.getFields().contains(name)) {
			throw new UndefinedFieldException(name);
		}
		return base.getFieldType(name);
	}
	
	/**
	 * Check that e is a reference and return referenced type.
	 */
	public Type checkReference(Expression e) {
		Type t = e.accept(this);
		if (!(t instanceof ReferenceType)) {
			throw new InvalidTypeException("reference");
		}
		return ((ReferenceType)t).getType();
	}
}
