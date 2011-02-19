package jdm.oberon0.typechecker.typecheck;

import jdm.oberon0.ast.Module;
import jdm.oberon0.typechecker.TypeCheckerContext;

/**
 * Evaluator for Oberon0 modules and procedures.
 */
public class ModuleChecker {
	private DeclarationChecker _declEval;
	private StatementChecker _statEval;
	
	public ModuleChecker(TypeCheckerContext context) {
		_statEval = new StatementChecker(context);
		_declEval = new DeclarationChecker(context);
	}
	
	public void evaluate(Module module) {
		module.getDeclarations().accept(_declEval);
		module.getStatements().accept(_statEval);
	}
}
