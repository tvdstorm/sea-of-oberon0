package nl.bve.uva.oberon.ast.declarations;

import java.util.List;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonValue;

public class VarDeclarationNode extends DeclarationNode {
	private List<String> identList;
	private IInterpretableNode type;
	
	public VarDeclarationNode(List<String> identList, IInterpretableNode type) {
		this.identList = identList;
		this.type = type;
	}
	
	@Override
	public void declare(Environment env) {
		OberonValue t = (OberonValue)type.interpret(env);
		
		for (String ident : identList) {
			env.addVariable(ident, t.clone());
		}
	}
}
