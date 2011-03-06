package eu.wietsevenema.lang.oberon.ast.visitors.typechecker;

import xtc.tree.Node;
import xtc.tree.Visitor;
import eu.wietsevenema.lang.oberon.ast.declarations.RecordSelector;
import eu.wietsevenema.lang.oberon.ast.expressions.AdditiveExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.ArraySelector;
import eu.wietsevenema.lang.oberon.ast.expressions.BinaryExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.BooleanConstant;
import eu.wietsevenema.lang.oberon.ast.expressions.DivisiveExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.EqualityExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.GreaterExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.GreaterOrEqualExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.expressions.IntegerConstant;
import eu.wietsevenema.lang.oberon.ast.expressions.LessExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.LessOrEqualExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.LogicalConjunctiveExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.LogicalDisjunctiveExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.LogicalNegationExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.ModulusExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.MultiplicativeExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.NotExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.SubtractiveExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.UnaryMinExpression;
import eu.wietsevenema.lang.oberon.ast.types.ArrayType;
import eu.wietsevenema.lang.oberon.ast.types.BooleanType;
import eu.wietsevenema.lang.oberon.ast.types.IntegerType;
import eu.wietsevenema.lang.oberon.ast.types.RecordType;
import eu.wietsevenema.lang.oberon.ast.types.VarType;
import eu.wietsevenema.lang.oberon.exceptions.SymbolNotDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.TypeMismatchException;
import eu.wietsevenema.lang.oberon.exceptions.TypeNotDeclaredException;
import eu.wietsevenema.lang.oberon.typechecker.TypeCheckerScope;

public class ExpressionChecker extends Visitor {

	TypeCheckerScope scope;

	public ExpressionChecker(TypeCheckerScope scope) {
		this.scope = scope;
	}

	public IntegerType visit(AdditiveExpression ae) throws TypeMismatchException {
		return visitArithmeticExpression(ae);
	}

	private IntegerType visitArithmeticExpression(BinaryExpression be) throws TypeMismatchException {
		if (assertInteger(dispatch(be.getLeft())) && assertInteger(dispatch(be.getRight()))) {
			return new IntegerType();
		} else {
			throw new TypeMismatchException(be.getLocation() + ": expected INTEGER");
		}
	}

	private BooleanType visitComparisonExpression(BinaryExpression be) throws TypeMismatchException {
		if (assertInteger(dispatch(be.getLeft())) && assertInteger(dispatch(be.getRight()))) {
			return new BooleanType();
		} else {
			throw new TypeMismatchException(be.getLocation() + ": expected BOOLEAN");
		}
	}

	private boolean assertInteger(Object dispatch) {
		TypeAliasResolver resolv = new TypeAliasResolver(scope);
		dispatch = resolv.dispatch((Node)dispatch);
		return IntegerType.class.equals(dispatch.getClass());
	}

	private boolean assertBoolean(Object dispatch) {
		TypeAliasResolver resolv = new TypeAliasResolver(scope);
		dispatch = resolv.dispatch((Node)dispatch);
		return BooleanType.class.equals(dispatch.getClass());
	}

	public IntegerType visit(SubtractiveExpression se) throws TypeMismatchException {
		return visitArithmeticExpression(se);
	}

	public IntegerType visit(MultiplicativeExpression me) throws TypeMismatchException {
		return visitArithmeticExpression(me);
	}

	public IntegerType visit(DivisiveExpression de) throws TypeMismatchException {
		return visitArithmeticExpression(de);
	}

	public IntegerType visit(ModulusExpression me) throws TypeMismatchException {
		return visitArithmeticExpression(me);
	}

	public BooleanType visit(BooleanConstant bc) {
		return new BooleanType();
	}

	public BooleanType visit(GreaterOrEqualExpression ee) throws TypeMismatchException {
		return visitComparisonExpression(ee);
	}

	public BooleanType visit(GreaterExpression ee) throws TypeMismatchException {
		return visitComparisonExpression(ee);
	}

	public BooleanType visit(LessOrEqualExpression ee) throws TypeMismatchException {
		return visitComparisonExpression(ee);
	}

	public BooleanType visit(NotExpression ee) throws TypeMismatchException {
		return visitComparisonExpression(ee);
	}

	public BooleanType visit(LessExpression ee) throws TypeMismatchException {
		return visitComparisonExpression(ee);
	}

	public BooleanType visit(EqualityExpression ee) throws TypeMismatchException {
		return visitComparisonExpression(ee);
	}

	public BooleanType visit(LogicalConjunctiveExpression lce) throws TypeMismatchException {
		return visitComparisonExpression(lce);
	}

	public BooleanType visit(LogicalDisjunctiveExpression lde) throws TypeMismatchException {
		return visitComparisonExpression(lde);
	}

	public BooleanType visit(LogicalNegationExpression lne) throws TypeMismatchException {
		if (assertBoolean(dispatch(lne.getChild()))) {
			return new BooleanType();
		} else {
			throw new TypeMismatchException(lne.getLocation() + ": expected BOOLEAN");
		}
	}


	public VarType visit(ArraySelector as) throws TypeMismatchException {
		// Evaluate index, assertInteger
		if (!assertInteger(dispatch(as.getIndex()))) {
			throw new TypeMismatchException(as.getIndex().getLocation() + ": expected INTEGER");
		}
		// Evaluate lhs, assert ArrayType.
		VarType type = (VarType) dispatch(as.getLeft());
		
		TypeAliasResolver resolv = new TypeAliasResolver(scope);
		Object left = resolv.dispatch(type);
		
		if (!left.getClass().equals(ArrayType.class)) {
			throw new TypeMismatchException(as.getLeft().getLocation() + ": expected ARRAY");
		} else {
		// Return subtype. 	
			return ((ArrayType) left).getType();
		}
	}


	public VarType visit(RecordSelector rs) throws TypeMismatchException {
		VarType type = (VarType) dispatch(rs.getLeft());
		
		TypeAliasResolver resolv = new TypeAliasResolver(scope);
		Object left = resolv.dispatch(type);
		
		if (!left.getClass().equals(RecordType.class)) {
			throw new TypeMismatchException(rs.getLeft().getLocation() + ": expected RECORD, got " + type.getClass().getSimpleName());
		} else {
			RecordType rt = (RecordType) left; 
			return rt.get(rs.getKey());
		}
	}

	public IntegerType visit(UnaryMinExpression um) throws TypeMismatchException {
		if (assertInteger(dispatch(um.getChild()))) {
			return new IntegerType();
		} else {
			throw new TypeMismatchException(um.getLocation() + ": expected INTEGER");
		}
	}

	public IntegerType visit(IntegerConstant ic) {
		return new IntegerType();
	}

	public VarType visit(Identifier id) throws TypeNotDeclaredException, SymbolNotDeclaredException {
		VarType type = scope.lookupValueType(id.getName()); 
		TypeAliasResolver resolv = new TypeAliasResolver(scope);
		return (VarType) resolv.dispatch(type); 
	}

}
