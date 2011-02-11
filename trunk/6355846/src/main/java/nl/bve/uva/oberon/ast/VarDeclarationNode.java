package nl.bve.uva.oberon.ast;

import java.util.List;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.Type;

public class VarDeclarationNode implements IInterpretableNode {
	private List<String> identList;
	private IInterpretableNode type;
	
	public VarDeclarationNode(List<String> identList, IInterpretableNode type) {
		this.identList = identList;
		this.type = type;
	}
	
	@Override
	public Object interpret(Environment env) {
		Type t = (Type)type.interpret(env);
		
		for (String ident : identList) {
			env.addVariable(ident, t.clone());
		}
		
		return null;
	}
}
