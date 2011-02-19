package oberon0.type;

import oberon0.environment.Environment;
import oberon0.value.Value;

public interface Type {
	
	public abstract Value<?> createTypeValue(Environment env);
	
}
