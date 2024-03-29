package jdm.oberon0.interpreter.eval;

import java.util.HashMap;
import java.util.Map;

import jdm.oberon0.types.*;
import jdm.oberon0.ast.types.IdentifierType;
import jdm.oberon0.ast.types.TypeVisitor;
import jdm.oberon0.interpreter.InterpreterContext;

/**
 * Evaluator to convert AST types to runtime types
 */
class TypeEvaluator extends TypeVisitor<Type> {
	private InterpreterContext _context;
	private ExpressionEvaluator _exprEval;
	
	public TypeEvaluator(InterpreterContext context) {
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
		return new ArrayType(ReferenceType.getRef(elementType), size);
	}

	@Override
	public Type visitRecord(jdm.oberon0.ast.types.RecordType type) {
		Map<String, jdm.oberon0.ast.types.Type> fields = type.getFields();
		Map<String, ReferenceType> typeFields = new HashMap<String, ReferenceType>();
		
		for(String name : fields.keySet()) {
			Type t = fields.get(name).accept(this);
			typeFields.put(name, ReferenceType.getRef(t));
		}
		return new RecordType(typeFields);
	}
}
