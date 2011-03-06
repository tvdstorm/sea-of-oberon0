package eu.wietsevenema.lang.oberon.ast.visitors.interpreter;

import xtc.tree.Visitor;
import eu.wietsevenema.lang.oberon.ast.declarations.RecordSelector;
import eu.wietsevenema.lang.oberon.ast.expressions.ArraySelector;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.exceptions.SymbolNotDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.interpreter.InterpreterScope;
import eu.wietsevenema.lang.oberon.interpreter.ValueReference;
import eu.wietsevenema.lang.oberon.interpreter.values.ArrayValue;
import eu.wietsevenema.lang.oberon.interpreter.values.IntegerValue;
import eu.wietsevenema.lang.oberon.interpreter.values.RecordValue;

public class ValueReferenceResolver extends Visitor {

	private InterpreterScope scope;

	public ValueReferenceResolver(InterpreterScope scope) {
		this.scope = scope;
	}

	public ValueReference visit(Identifier id) throws SymbolNotDeclaredException {
		return scope.lookupValueReference(id.getName());
	}

	public ValueReference visit(ArraySelector selector) throws ValueUndefinedException {
		// 1. Get reference to left ArrayValue.
		ExpressionEvaluator exprEval = new ExpressionEvaluator(scope);
		ArrayValue left = (ArrayValue) exprEval.dispatch(selector.getLeft());

		// 2. Evaluate right side to get index
		IntegerValue index = (IntegerValue) exprEval.dispatch(selector.getIndex());

		return left.getReference(index.getValue());
	}
	
	
	public ValueReference visit(RecordSelector selector) throws ValueUndefinedException {
		ExpressionEvaluator exprEval = new ExpressionEvaluator(scope);
		RecordValue record = (RecordValue) exprEval.dispatch(selector.getLeft());
		return record.getReference(selector.getKey());
	}
}
