package eu.wietsevenema.lang.oberon.ast.visitors.typechecker;

import java.util.List;

import xtc.tree.Visitor;
import eu.wietsevenema.lang.oberon.ast.declarations.Declarations;
import eu.wietsevenema.lang.oberon.ast.declarations.Module;
import eu.wietsevenema.lang.oberon.ast.statements.Statement;
import eu.wietsevenema.lang.oberon.typechecker.TypeCheckerScope;


public class ModuleChecker extends Visitor {

	
	private TypeCheckerScope scope;

	public ModuleChecker(TypeCheckerScope scope ){
		this.scope = scope;
	}
	
	public void visit(Module module) {
		Declarations decls = module.getDeclarations();
		DeclarationChecker declEval = new DeclarationChecker(scope);
		declEval.dispatch(decls);

		List<Statement> statements = module.getStats();
		StatementChecker statEval = new StatementChecker(scope);
		for (Statement stat : statements) {
			statEval.dispatch(stat);
		}

	}

}
