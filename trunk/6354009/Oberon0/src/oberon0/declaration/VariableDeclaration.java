package oberon0.declaration;

import oberon0.environment.EnvObject;
import oberon0.environment.Environment;
import oberon0.type.Type;

public class VariableDeclaration extends Declaration {

	private final Type type;
	
	public VariableDeclaration(String identifier, Type type) {
		super(identifier);
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}

	@Override
	public EnvObject getEnvironmentObject(Environment env) {
		return new EnvObject(type.createTypeValue(env), true) ;
	}	
	
}
