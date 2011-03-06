package eu.wietsevenema.lang.oberon.ast.visitors.typechecker;

import java.util.List;

import xtc.tree.Visitor;
import eu.wietsevenema.lang.oberon.ast.declarations.ConstantDecl;
import eu.wietsevenema.lang.oberon.ast.declarations.Declarations;
import eu.wietsevenema.lang.oberon.ast.declarations.ProcedureDecl;
import eu.wietsevenema.lang.oberon.ast.declarations.TypeDecl;
import eu.wietsevenema.lang.oberon.ast.declarations.VarDecl;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.types.VarType;
import eu.wietsevenema.lang.oberon.exceptions.SymbolAlreadyDeclaredException;
import eu.wietsevenema.lang.oberon.typechecker.TypeCheckerScope;

public class DeclarationChecker extends Visitor {

	TypeCheckerScope scope;

	public DeclarationChecker(TypeCheckerScope scope) {
		this.scope = scope;
	}

	public void visit(Declarations decls) {
		List<ConstantDecl> constantDecls = decls.getConstants();
		for (ConstantDecl c : constantDecls) {
			dispatch(c);
		}

		List<TypeDecl> typeDecls = decls.getTypes();
		for (TypeDecl t : typeDecls) {
			dispatch(t);
		}

		List<VarDecl> varDecls = decls.getVars();
		for (VarDecl v : varDecls) {
			dispatch(v);
		}

		List<ProcedureDecl> procDecls = decls.getProcedures();
		for (ProcedureDecl p : procDecls) {
			dispatch(p);
		}

	}

	public void visit(ProcedureDecl procDecl) throws SymbolAlreadyDeclaredException {
		scope.declareProc(procDecl.getIdentifier().getName(), procDecl);
	}

	public void visit(ConstantDecl constantDecl) throws SymbolAlreadyDeclaredException {
		Identifier identifier = constantDecl.getIdentifier();

		ExpressionChecker exprEval = new ExpressionChecker(scope);
		VarType type = (VarType) exprEval.dispatch(constantDecl.getExpression());

		scope.declareValueType(identifier.getName(), type);
	}

	public void visit(TypeDecl typeDecl) {
		scope.declareType(typeDecl.getIdentifier().getName(), typeDecl.getType());
	}

	public void visit(VarDecl varDecl) throws SymbolAlreadyDeclaredException {

		List<Identifier> identifiers = varDecl.getIdentifiers();

		VarType type = varDecl.getType();

		for (Identifier id : identifiers) {
			String symbol = id.getName();
			scope.declareValueType(symbol, type);
		}
	}

}
