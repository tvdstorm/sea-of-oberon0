package oberon0.environment;

import java.util.HashMap;

public class Context {
	String _name;
	HashMap<Reference, Object> _variables;
	Context _parent;
	
	public Context (String name){
		_name = name;
		_variables = new HashMap<Reference, Object>();
		_parent = null;
	}
	
	public Context (String name, Context parent){
		_name = name;
		_variables = new HashMap<Reference, Object>();
		_parent = parent;
	}
}
