package oberon0.type;

import oberon0.environment.Environment;
import oberon0.value.IntegerValue;

public class IntegerType implements Type {

	@Override
	public IntegerValue createTypeValue(Environment env) {
		return new IntegerValue(0);
	}

}
