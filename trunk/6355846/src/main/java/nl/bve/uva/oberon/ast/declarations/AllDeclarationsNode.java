package nl.bve.uva.oberon.ast.declarations;

import java.util.List;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;

public class AllDeclarationsNode implements IInterpretableNode {
	private List<DeclarationNode> constants;
	private List<DeclarationNode> types;
	private List<DeclarationNode> vars;
	private List<DeclarationNode> procedures;

	public AllDeclarationsNode(List<DeclarationNode> constants,
							   List<DeclarationNode> types, 
							   List<DeclarationNode> vars,
							   List<DeclarationNode> procedures) {
		this.constants = constants;
		this.types = types;
		this.vars = vars;
		this.procedures = procedures;
	}

	@Override
	public Object interpret(Environment env) {
		declareList(constants, env);
		declareList(types, env);
		declareList(vars, env);
		declareList(procedures, env);
		return null;
	}

	private void declareList(List<DeclarationNode> declarations, Environment env) {
		for (DeclarationNode declaration : declarations) {
			declaration.declare(env);
		}
	}
}
