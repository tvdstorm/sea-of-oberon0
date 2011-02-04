package eu.wietsevenema.lang.oberon.ast.visitors;

import xtc.tree.Visitor;
import eu.wietsevenema.lang.oberon.ast.expressions.AdditiveExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.ArraySelector;
import eu.wietsevenema.lang.oberon.ast.expressions.BooleanConstant;
import eu.wietsevenema.lang.oberon.ast.expressions.EqualityExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.expressions.IntegerConstant;
import eu.wietsevenema.lang.oberon.ast.expressions.LogicalConjunctiveExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.LogicalDisjunctiveExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.LogicalNegationExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.MultiplicativeExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.UnaryMinExpression;
import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.exceptions.VariableNotDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.VariableUndefinedException;
import eu.wietsevenema.lang.oberon.interpreter.SymbolTable;
import eu.wietsevenema.lang.oberon.interpreter.ValueReference;
import eu.wietsevenema.lang.oberon.interpreter.values.BooleanValue;
import eu.wietsevenema.lang.oberon.interpreter.values.IntegerValue;
import eu.wietsevenema.lang.oberon.interpreter.values.Value;

public class ExpressionEvaluator extends Visitor {

	SymbolTable symbolTable;

	public ExpressionEvaluator(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
	}

	
	public IntegerValue visit(AdditiveExpression ae) throws ClassCastException, ValueUndefinedException {
		Integer left 	= ((IntegerValue) dispatch(ae.getLeft()	)).getValue();
		Integer right 	= ((IntegerValue) dispatch(ae.getRight()	)).getValue();
				
		if (ae.getToken() == "+") {
			return new IntegerValue(left + right);
		} else if (ae.getToken() == "-") {
			return new IntegerValue(left - right);
		} else {
			throw new IllegalStateException("Token not recognized");
		}
	}
	

	public BooleanValue visit(BooleanConstant bc) {
		return new BooleanValue(bc.getValue());
	}

	public BooleanValue visit(EqualityExpression ee) throws ValueUndefinedException {
		Integer left 	= ((IntegerValue) dispatch(ee.getLeft()	)).getValue();
		Integer right 	= ((IntegerValue) dispatch(ee.getRight())).getValue();
		boolean result;
		if(ee.getToken() == "="){
			result = left == right;
		} else if (ee.getToken() == "#"){
			result = left != right;
		} else if (ee.getToken() == "<"){
			result = left < right;
		} else if (ee.getToken() == "<="){
			result = left <= right;
		} else if (ee.getToken() == ">"){
			result = left > right;
		} else if (ee.getToken() == ">="){
			result = left >= right;
		} else {
			throw new IllegalStateException("Token not recognized");
		}
		return new BooleanValue(result);
	}

	//FIXME lazy eval
	public BooleanValue visit(LogicalConjunctiveExpression lce) throws ValueUndefinedException {
		Boolean left 	= ((BooleanValue) dispatch(lce.getLeft()	)).getValue();
		Boolean right 	= ((BooleanValue) dispatch(lce.getRight()	)).getValue();
		return new BooleanValue(left && right);
	}

	//FIXME lazy eval
	public BooleanValue visit(LogicalDisjunctiveExpression lde) throws ValueUndefinedException {
		Boolean left 	= ((BooleanValue) dispatch(lde.getLeft()	)).getValue();
		Boolean right 	= ((BooleanValue) dispatch(lde.getRight()	)).getValue();
		return new BooleanValue(left || right);
	}

	public BooleanValue visit(LogicalNegationExpression lne) throws ValueUndefinedException {
		Expression exp = lne.getChild();
		Boolean value = ((BooleanValue) dispatch(exp)).getValue();
		return new BooleanValue(!value);
	}

	public IntegerValue visit(MultiplicativeExpression me) throws ValueUndefinedException {
		Integer left 	= ((IntegerValue) dispatch(me.getLeft()	)).getValue();
		Integer right 	= ((IntegerValue) dispatch(me.getRight())).getValue();

		Integer result; 
		if (me.getToken() == "*") {
			result = left * right; 
		} else if (me.getToken() == "DIV") {
			result = (int)( left / right );
		} else if (me.getToken() == "MOD") {
			result = (int)(left % right );
		} else {
			throw new IllegalStateException("Token not recognized");
		}
		return new IntegerValue(result);
	}
	
	public Value visit( ArraySelector as ){
		ValueReferenceResolver resolv = new ValueReferenceResolver(symbolTable);
		ValueReference result = (ValueReference)resolv.dispatch(as);
		return result.getValue();
	}

	public IntegerValue visit(UnaryMinExpression um) {
		IntegerValue result = (IntegerValue) dispatch(um.getChild());
		return result;
	}

	public IntegerValue visit(IntegerConstant ic) {
		return new IntegerValue(ic.getValue());
	}
	
	
	public Value visit(Identifier id) throws VariableUndefinedException, VariableNotDeclaredException {
		Value result = (Value) this.symbolTable.lookupValue(id.getName());
		
		if (result == null) {
			throw new VariableUndefinedException(id.getName() + "undefined.");
		}
		return result;
	}

}
