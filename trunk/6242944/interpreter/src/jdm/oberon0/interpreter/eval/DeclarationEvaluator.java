package jdm.oberon0.interpreter.eval;

import jdm.oberon0.ast.declarations.*;
import jdm.oberon0.interpreter.Context;
import jdm.oberon0.interpreter.ScriptedProcedure;
import jdm.oberon0.interpreter.ValueConstructor;
import jdm.oberon0.types.Type;
import jdm.oberon0.values.Value;

/**
 * Evaluator for declarations
 */
class DeclarationEvaluator extends DeclarationVisitor {
	private Context _context;
	private ExpressionEvaluator _exprEval;
	private TypeEvaluator _typeEval;
	
	public DeclarationEvaluator(Context context) {
		_context = context;
		_exprEval = new ExpressionEvaluator(context);
		_typeEval = new TypeEvaluator(context);
	}
	
	@Override
	protected void visitDeclarations(Declarations declarations) {
		for(Declaration decl : declarations.getDeclarations()) {
			decl.accept(this);
		}
	}

	@Override
	protected void visitConstDeclaration(ConstDeclaration declaration) {
		String name = declaration.getName();
		Value value = _exprEval.eval(declaration.getValue());
		_context.getScope().defineConstant(name, value);
	}

	@Override
	protected void visitTypeDeclaration(TypeDeclaration declaration) {
		String name = declaration.getName();
		Type t = declaration.getType().accept(_typeEval);
		_context.getScope().defineType(name, t);
	}

	@Override
	protected void visitVarDeclaration(VarDeclaration declaration) {
		for(String name : declaration.getNames()) {
			Type type = declaration.getType().accept(_typeEval);
			_context.getScope().defineVar(name, ValueConstructor.fromType(type));
		}
	}

	@Override
	protected void visitProcedure(Procedure procedure) {
		ScriptedProcedure proc = new ScriptedProcedure(procedure);
		_context.getScope().defineProcedure(procedure.getName(), proc);
	}
}
