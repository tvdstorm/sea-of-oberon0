package jdm.oberon0.interpreter.eval;

import java.util.HashMap;

import jdm.oberon0.types.*;
import jdm.oberon0.ast.types.IdentifierType;
import jdm.oberon0.ast.types.TypeVisitor;
import jdm.oberon0.interpreter.Context;

/**
 * Evaluator to convert AST types to runtime types
 */
class TypeEvaluator extends TypeVisitor<Type> {
	private Context _context;
	private ExpressionEvaluator _exprEval;
	
	public TypeEvaluator(Context context) {
		_context = context;
		_exprEval = new ExpressionEvaluator(context);
	}
	
	@Override
	public jdm.oberon0.types.Type visitIdentifierType(IdentifierType type) {
		return _context.getScope().lookupType(type.getName());
	}

	@Override
	public Type visitArray(jdm.oberon0.ast.types.ArrayType type) {
		Type elementType = type.getElementType().accept(this);
		int size = _exprEval.evalInteger(type.getSize());
		return new ArrayType(elementType, size);
	}

	@Override
	public Type visitRecord(jdm.oberon0.ast.types.RecordType type) {
		HashMap<String, jdm.oberon0.ast.types.Type> fields = type.getFields();
		HashMap<String, Type> typeFields = new HashMap<String, Type>();
		
		for(String name : fields.keySet()) {
			Type t = fields.get(name).accept(this);
			typeFields.put(name, t);
		}
		return new RecordType(typeFields);
	}
}
