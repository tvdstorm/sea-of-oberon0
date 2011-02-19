package nl.bve.uva.oberon.ast.declarations;

import nl.bve.uva.oberon.ast.declarations.values.IValueNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.OberonValue;
import nl.bve.uva.oberon.env.values.TypeValue;

public class TypeDeclarationNode implements IDeclarationNode {
	private String ident;
	private IValueNode type;
	
	public TypeDeclarationNode(String ident, IValueNode type) {
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
