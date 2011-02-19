package oberon0.declaration;

import oberon0.environment.EnvObject;
import oberon0.environment.Environment;
import oberon0.value.IntegerValue;

public class ConstantDeclaration extends Declaration{
	
	private final IntegerValue value;
	
	public ConstantDeclaration(String identifier, IntegerValue value) {
		super(identifier);
		this.value = value; 
	}

	@Override
	public EnvObject getEnvironmentObject(Environment env) {
		return new EnvObject(value, false);
	}

}
