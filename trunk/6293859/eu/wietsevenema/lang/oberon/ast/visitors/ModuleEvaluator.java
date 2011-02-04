package eu.wietsevenema.lang.oberon.ast.visitors;

import java.util.List;

import xtc.tree.Visitor;
import eu.wietsevenema.lang.oberon.ast.declarations.Declarations;
import eu.wietsevenema.lang.oberon.ast.declarations.Module;
import eu.wietsevenema.lang.oberon.ast.statements.Statement;
import eu.wietsevenema.lang.oberon.interpreter.SymbolTable;

public class ModuleEvaluator extends Visitor {

	SymbolTable symbolTable;
	
	public ModuleEvaluator( SymbolTable symbolTable){
		this.symbolTable = symbolTable;
	}
	
	public void visit(Module module){
		Declarations decls = module.getDeclarations();
		DeclarationEvaluator declEval = new DeclarationEvaluator(symbolTable);
		declEval.dispatch(decls);
		
		List<Statement> statements = module.getStats();
		StatementEvaluator statEval = new StatementEvaluator(symbolTable);
		for(Statement stat : statements){
			statEval.dispatch(stat);
		}
		
	}
	
	
	
}
