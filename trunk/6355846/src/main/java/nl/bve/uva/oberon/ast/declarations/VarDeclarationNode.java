package nl.bve.uva.oberon.ast.declarations;

import java.util.List;

import nl.bve.uva.oberon.ast.declarations.values.TypeNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.OberonValue;

public class VarDeclarationNode extends DeclarationNode {
	private List<String> identList;
	private TypeNode type;
	
	public VarDeclarationNode(List<String> identList, TypeNode type) {
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
