package nl.bve.uva.oberon.ast;

import java.util.List;

import nl.bve.uva.oberon.ast.declarations.IDeclarationNode;
import nl.bve.uva.oberon.env.Environment;

public class AllDeclarationsNode implements IExecutableNode {
	private List<IDeclarationNode> constants;
	private List<IDeclarationNode> types;
	private List<IDeclarationNode> vars;
	private List<IDeclarationNode> procedures;

	public AllDeclarationsNode(List<IDeclarationNode> constants,
							   List<IDeclarationNode> types, 
							   List<IDeclarationNode> vars,
							   List<IDeclarationNode> procedures) {
		this.constants = constants;
		this.types = types;
		this.vars = vars;
		this.procedures = procedures;
	}

	@Override
	public void execute(Environment env) {
		declareList(constants, env);
		declareList(types, env);
		declareList(vars, env);
		declareList(procedures, env);
	}

	private void declareList(List<IDeclarationNode> declarations, Environment env) {
		for (IDeclarationNode declaration : declarations) {
			declaration.declare(env);
		}
	}
}
