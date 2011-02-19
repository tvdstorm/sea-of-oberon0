package nl.bve.uva.oberon.ast.types;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.OberonValue;

public class MyTypeNode implements IValueNode {
	private String name;
	
	public MyTypeNode(String name) {
		this.name = name;
	}
	
	@Override
	public OberonValue initializeNew(Environment env) {
		return env.createApplicationType(name);
	}
}
