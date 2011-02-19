package jdm.oberon0.typechecker.typecheck;

import java.util.HashMap;
import java.util.Map;

import jdm.oberon0.typechecker.TypeCheckerContext;
import jdm.oberon0.types.*;
import jdm.oberon0.ast.types.IdentifierType;
import jdm.oberon0.ast.types.TypeVisitor;

/**
 * Evaluator to convert AST types to runtime types
 */
class TypeChecker extends TypeVisitor<Type> {
	private TypeCheckerContext _context;
	private ExpressionChecker _exprChecker;
	
	public TypeChecker(TypeCheckerContext context) {
		_context = context;
		_exprChecker = new ExpressionChecker(context);
	}
	
	@Override
	public jdm.oberon0.types.Type visitIdentifierType(IdentifierType type) {
		return _context.getScope().lookupType(type.getName());
	}

	@Override
	public Type visitArray(jdm.oberon0.ast.types.ArrayType type) {
		Type elementType = type.getElementType().accept(this);
		_exprChecker.checkInteger(type.getSize());
		return new ArrayType(ReferenceType.getRef(elementType), -1);
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
