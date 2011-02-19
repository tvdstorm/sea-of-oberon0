package jdm.oberon0.typechecker.typecheck;

import java.util.List;

import jdm.oberon0.ast.declarations.*;
import jdm.oberon0.typechecker.TypeCheckerContext;
import jdm.oberon0.types.ProcedureType;
import jdm.oberon0.types.ReferenceType;
import jdm.oberon0.types.Type;

/**
 * Evaluator for declarations
 */
class DeclarationChecker extends DeclarationVisitor {
	private TypeCheckerContext _context;
	private ExpressionChecker _exprChecker;
	private TypeChecker _typeEval;
	private StatementChecker _statementChecker;

	
	public DeclarationChecker(TypeCheckerContext context) {
		_context = context;
		_exprChecker = new ExpressionChecker(context);
		_typeEval = new TypeChecker(context);
		_statementChecker = new StatementChecker(_context);
	}
	
	@Override
	protected void visitConstDeclaration(ConstDeclaration declaration) {
		String name = declaration.getName();
		Type type = declaration.getValue().accept(_exprChecker);
		_context.getScope().defineConstant(name, type);
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
			_context.getScope().defineVar(name, type);
		}
	}

	@Override
	protected void visitProcedure(ProcedureDeclaration procedure) {
		// Type check procedure body here. This ensures every procedure
		// is checked once and we also check procedures
		// which are never called.
		List<Parameter> params = procedure.getParameters();
		
		// expected parameter types
		Type[] formalTypes = new Type[params.size()];
		
		for(int i=0; i<params.size(); i++) {
			Parameter param = params.get(i);
			Type type = param.getType().accept(_typeEval);
			if (param.isByRef()) {
				type = ReferenceType.getRef(type);
			}
			formalTypes[i] = type;
		}
		
		// define a new procedure with this type
		ProcedureType procType = new ProcedureType(formalTypes);
		_context.getScope().defineProcedure(procedure.getName(), procType);
		
		// new scope for types declared in this function
		_context.pushScope();
		
		// define all locals as variables
		for(Parameter param : params) {
			Type type = param.getType().accept(_typeEval);
			_context.getScope().defineVar(param.getName(), type);
		}
		
		// check declarations and statements
		procedure.getDeclarations().accept(this);
		procedure.getStatements().accept(_statementChecker);
		
		_context.popScope();
	}
}
