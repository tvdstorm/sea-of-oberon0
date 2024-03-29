package nl.bve.uva.oberon.ast.declarations;

import java.util.List;

import nl.bve.uva.oberon.ast.types.IOberonTypeNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.OberonValue;

public class VarDeclarationNode implements IDeclarationNode {
	private List<String> identList;
	private IOberonTypeNode type;
	
	public VarDeclarationNode(List<String> identList, IOberonTypeNode type) {
		this.identList = identList;
		this.type = type;
	}
	
	@Override
	public void declare(Environment env) {
		OberonValue t = (OberonValue)type.initializeNew(env);
		
		for (String ident : identList) {
			env.addVariable(ident, t.clone());
		}
	}
}
