package eu.wietsevenema.lang.oberon.ast.visitors.interpreter;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import xtc.tree.Visitor;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.types.ArrayType;
import eu.wietsevenema.lang.oberon.ast.types.BooleanType;
import eu.wietsevenema.lang.oberon.ast.types.IntegerType;
import eu.wietsevenema.lang.oberon.ast.types.RecordType;
import eu.wietsevenema.lang.oberon.ast.types.TypeAlias;
import eu.wietsevenema.lang.oberon.ast.types.VarType;
import eu.wietsevenema.lang.oberon.exceptions.TypeNotDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.interpreter.InterpreterScope;
import eu.wietsevenema.lang.oberon.interpreter.ValueReference;
import eu.wietsevenema.lang.oberon.interpreter.values.ArrayValue;
import eu.wietsevenema.lang.oberon.interpreter.values.BooleanValue;
import eu.wietsevenema.lang.oberon.interpreter.values.IntegerValue;
import eu.wietsevenema.lang.oberon.interpreter.values.RecordValue;
import eu.wietsevenema.lang.oberon.interpreter.values.Value;

public class ValueBuilder extends Visitor {

	private InterpreterScope scope;

	public ValueBuilder(InterpreterScope scope) {
		this.scope = scope;
	}

	public IntegerValue visit(IntegerType integerType) {
		return new IntegerValue(null);
	}

	public BooleanValue visit(BooleanType booleanType) {
		return new BooleanValue(null);
	}

	public Value visit(TypeAlias typeAlias) throws TypeNotDeclaredException {
		VarType type = scope.lookupType(typeAlias.getIdentifier().getName());
		return (Value) dispatch(type);
	}
	
	public RecordValue visit(RecordType recordType ){
		Map<Identifier, ValueReference> values = new TreeMap<Identifier, ValueReference>();
		for(Entry<Identifier, VarType> entry: recordType.entrySet()){
			Value dispatch = (Value)dispatch(entry.getValue());
			dispatch.init();
			ValueReference ref = new ValueReference(dispatch);
			values.put(entry.getKey(), ref); 
		}
		return new RecordValue(values);
	}

	public ArrayValue visit(ArrayType arrayType) throws ValueUndefinedException {
		ExpressionEvaluator exprEval = new ExpressionEvaluator(scope);
		IntegerValue sizeValue = (IntegerValue) exprEval.dispatch(arrayType.getExpression());
		Integer size = sizeValue.getValue();
		Value template = (Value) this.dispatch(arrayType.getType());
		template.init();
		ArrayValue result = new ArrayValue(template, size);
		return result;
	}

}
