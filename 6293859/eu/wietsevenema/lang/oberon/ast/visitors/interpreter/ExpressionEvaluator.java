package eu.wietsevenema.lang.oberon.ast.visitors.interpreter;

import xtc.tree.Visitor;
import eu.wietsevenema.lang.oberon.ast.declarations.RecordSelector;
import eu.wietsevenema.lang.oberon.ast.expressions.AdditiveExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.ArraySelector;
import eu.wietsevenema.lang.oberon.ast.expressions.BooleanConstant;
import eu.wietsevenema.lang.oberon.ast.expressions.DivisiveExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.EqualityExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
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
import eu.wietsevenema.lang.oberon.exceptions.SymbolNotDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.exceptions.VariableUndefinedException;
import eu.wietsevenema.lang.oberon.interpreter.InterpreterScope;
import eu.wietsevenema.lang.oberon.interpreter.ValueReference;
import eu.wietsevenema.lang.oberon.interpreter.values.BooleanValue;
import eu.wietsevenema.lang.oberon.interpreter.values.IntegerValue;
import eu.wietsevenema.lang.oberon.interpreter.values.Value;

public class ExpressionEvaluator extends Visitor {

	InterpreterScope scope;

	public ExpressionEvaluator(InterpreterScope scope) {
		this.scope = scope;
	}

	public IntegerValue visit(AdditiveExpression ae) throws ClassCastException, ValueUndefinedException {
		try {
			Integer left = ((IntegerValue) dispatch(ae.getLeft())).getValue();
			Integer right = ((IntegerValue) dispatch(ae.getRight())).getValue();
			return new IntegerValue(left + right);
		} catch (ValueUndefinedException e) {
			throw new ValueUndefinedException("Value undefined at " + ae.getLocation());
		}

	}

	public IntegerValue visit(SubtractiveExpression se) throws ValueUndefinedException {
		Integer left = ((IntegerValue) dispatch(se.getLeft())).getValue();
		Integer right = ((IntegerValue) dispatch(se.getRight())).getValue();

		return new IntegerValue(left - right);
	}

	public BooleanValue visit(BooleanConstant bc) {
		return new BooleanValue(bc.getValue());
	}

	public BooleanValue visit(GreaterOrEqualExpression ee) throws ValueUndefinedException {
		Integer left = ((IntegerValue) dispatch(ee.getLeft())).getValue();
		Integer right = ((IntegerValue) dispatch(ee.getRight())).getValue();

		return new BooleanValue(left >= right);
	}

	public BooleanValue visit(GreaterExpression ee) throws ValueUndefinedException {
		Integer left = ((IntegerValue) dispatch(ee.getLeft())).getValue();
		Integer right = ((IntegerValue) dispatch(ee.getRight())).getValue();

		return new BooleanValue(left > right);
	}

	public BooleanValue visit(LessOrEqualExpression ee) throws ValueUndefinedException {
		Integer left = ((IntegerValue) dispatch(ee.getLeft())).getValue();
		Integer right = ((IntegerValue) dispatch(ee.getRight())).getValue();

		return new BooleanValue(left <= right);
	}

	public BooleanValue visit(NotExpression ee) throws ValueUndefinedException {
		Integer left = ((IntegerValue) dispatch(ee.getLeft())).getValue();
		Integer right = ((IntegerValue) dispatch(ee.getRight())).getValue();

		return new BooleanValue(left != right);
	}

	public BooleanValue visit(LessExpression ee) throws ValueUndefinedException {
		Integer left = ((IntegerValue) dispatch(ee.getLeft())).getValue();
		Integer right = ((IntegerValue) dispatch(ee.getRight())).getValue();

		return new BooleanValue(left < right);
	}


	public BooleanValue visit(EqualityExpression ee) throws ValueUndefinedException {
		Integer left = ((IntegerValue) dispatch(ee.getLeft())).getValue();
		Integer right = ((IntegerValue) dispatch(ee.getRight())).getValue();

		return new BooleanValue(left == right);
	}

	public BooleanValue visit(LogicalConjunctiveExpression lce) throws ValueUndefinedException {
		return new BooleanValue(((BooleanValue) dispatch(lce.getLeft())).getValue()
				&& ((BooleanValue) dispatch(lce.getRight())).getValue());
	}

	public BooleanValue visit(LogicalDisjunctiveExpression lde) throws ValueUndefinedException {
		return new BooleanValue(((BooleanValue) dispatch(lde.getLeft())).getValue()
				|| ((BooleanValue) dispatch(lde.getRight())).getValue());
	}

	public BooleanValue visit(LogicalNegationExpression lne) throws ValueUndefinedException {
		Expression exp = lne.getChild();
		Boolean value = ((BooleanValue) dispatch(exp)).getValue();
		return new BooleanValue(!value);
	}

	public IntegerValue visit(MultiplicativeExpression me) throws ValueUndefinedException {
		Integer left = ((IntegerValue) dispatch(me.getLeft())).getValue();
		Integer right = ((IntegerValue) dispatch(me.getRight())).getValue();

		Integer result = left * right;

		return new IntegerValue(result);
	}

	public IntegerValue visit(DivisiveExpression de) throws ValueUndefinedException {
		Integer left = ((IntegerValue) dispatch(de.getLeft())).getValue();
		Integer right = ((IntegerValue) dispatch(de.getRight())).getValue();

		Integer result = (int) (left / right);
		return new IntegerValue(result);
	}

	public IntegerValue visit(ModulusExpression me) throws ValueUndefinedException {
		Integer left = ((IntegerValue) dispatch(me.getLeft())).getValue();
		Integer right = ((IntegerValue) dispatch(me.getRight())).getValue();

		Integer result = (int) (left % right);
		return new IntegerValue(result);
	}

	public Value visit(ArraySelector as) {
		ValueReferenceResolver resolver = new ValueReferenceResolver(scope);
		ValueReference result = (ValueReference) resolver.dispatch(as);
		return result.getValue();
	}
	
	public Value visit(RecordSelector rs) {
		ValueReferenceResolver resolver = new ValueReferenceResolver(scope);
		ValueReference result = (ValueReference) resolver.dispatch(rs);
		return result.getValue();
	}

	public IntegerValue visit(UnaryMinExpression um) {
		IntegerValue result = (IntegerValue) dispatch(um.getChild());
		return result;
	}

	public IntegerValue visit(IntegerConstant ic) {
		return new IntegerValue(ic.getValue());
	}

	public Value visit(Identifier id) throws VariableUndefinedException, SymbolNotDeclaredException {
		Value result = (Value) this.scope.lookupValue(id.getName());

		if (result == null) {
			throw new VariableUndefinedException(id.getName() + "undefined.");
		}
		return result;
	}

}
