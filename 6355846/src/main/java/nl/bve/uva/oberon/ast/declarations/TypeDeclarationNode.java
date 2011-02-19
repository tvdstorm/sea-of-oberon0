package nl.bve.uva.oberon.ast.declarations;

import nl.bve.uva.oberon.ast.declarations.values.ITypeNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.OberonValue;
import nl.bve.uva.oberon.env.values.TypeValue;

public class TypeDeclarationNode implements IDeclarationNode {
	private String ident;
	private ITypeNode type;
	
	public TypeDeclarationNode(String ident, ITypeNode type) {
		this.ident = ident;
		this.type = type;
	}
	
	@Override
	public void declare(Environment env) {
		OberonValue t = type.initializeNew(env);
		TypeValue appType = new TypeValue(ident, t);
		env.addUserType(ident, appType);
	}
}
