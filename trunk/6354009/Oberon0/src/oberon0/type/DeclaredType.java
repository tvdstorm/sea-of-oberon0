package oberon0.type;

import oberon0.environment.Environment;
import oberon0.value.IntegerValue;

public class DeclaredType implements Type {

	public DeclaredType(String identifier) {
		
	}

	@Override
	public IntegerValue createTypeValue(Environment env) {
		return null;
	}

}
