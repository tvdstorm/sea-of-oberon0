package oberon0.declaration;

import oberon0.environment.EnvObject;
import oberon0.environment.Environment;


public abstract class Declaration {
	
	private final String identifier;

	public Declaration(String identifier) {
		this.identifier = identifier;
	}

	public String getIdentifier() {
		return identifier;
	}
	
	public abstract EnvObject getEnvironmentObject(Environment env);
}
