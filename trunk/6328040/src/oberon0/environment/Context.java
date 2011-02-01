package oberon0.environment;

import java.util.HashMap;

public class Context {
	HashMap<Reference, Object> _variables;
	
	public Context (){
		_variables = new HashMap<Reference, Object>();
	}
}
