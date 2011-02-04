package eu.wietsevenema.lang.oberon.ast.visitors;

import xtc.tree.Visitor;
import eu.wietsevenema.lang.oberon.ast.types.ArrayType;
import eu.wietsevenema.lang.oberon.ast.types.BooleanType;
import eu.wietsevenema.lang.oberon.ast.types.IntegerType;
import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.interpreter.SymbolTable;
import eu.wietsevenema.lang.oberon.interpreter.values.ArrayValue;
import eu.wietsevenema.lang.oberon.interpreter.values.BooleanValue;
import eu.wietsevenema.lang.oberon.interpreter.values.IntegerValue;
import eu.wietsevenema.lang.oberon.interpreter.values.Value;

public class ValueBuilder extends Visitor {
	
	private SymbolTable symbolTable;

	public ValueBuilder(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
	}

	public IntegerValue visit( IntegerType integerType){
		return new IntegerValue( null );
	}
	
	public BooleanValue visit( BooleanType booleanType){
		return new BooleanValue( null );
	}
	
	public ArrayValue visit( ArrayType arrayType ) throws ValueUndefinedException{
		ExpressionEvaluator exprEval = new ExpressionEvaluator(symbolTable);
		IntegerValue sizeValue = (IntegerValue) exprEval.dispatch(arrayType.getExpression());
		Integer size = sizeValue.getValue();
		Value template = (Value)this.dispatch(arrayType.getType());
		ArrayValue result = new ArrayValue( template, size);
		
		return result;
		
	}

	
	
}
