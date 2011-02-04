package eu.wietsevenema.lang.oberon.ast.visitors;

import xtc.tree.Visitor;
import eu.wietsevenema.lang.oberon.ast.expressions.ArraySelector;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.interpreter.SymbolTable;
import eu.wietsevenema.lang.oberon.interpreter.ValueReference;
import eu.wietsevenema.lang.oberon.interpreter.values.ArrayValue;
import eu.wietsevenema.lang.oberon.interpreter.values.IntegerValue;

public class ValueReferenceResolver extends Visitor {

	private SymbolTable symbolTable;

	public ValueReferenceResolver(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
	}

	public ValueReference visit( Identifier id ){
		return symbolTable.lookupValueReference(id.getName());
	}
	
	public ValueReference visit( ArraySelector selector ) throws ValueUndefinedException{
		// 1. Get reference to left ArrayValue.
		ExpressionEvaluator exprEval = new ExpressionEvaluator(symbolTable);
		ArrayValue left = (ArrayValue) exprEval.dispatch(selector.getLeft());
		
		// 2. Evaluate right side to get index
		IntegerValue index = (IntegerValue) exprEval.dispatch(selector.getIndex());
		
		return left.getReference(index.getValue());
	}
}
