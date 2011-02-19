package nl.bve.uva.oberon.ast.declarations.values;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.OberonValue;

public class UserTypeNode implements ITypeNode {
	private String name;
	
	public UserTypeNode(String name) {
		this.name = name;
	}
	
	@Override
	public OberonValue initializeNew(Environment env) {
		return env.createApplicationType(name);
	}
}
