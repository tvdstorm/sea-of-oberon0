package oberon0.environment;

import java.util.HashMap;

public class Context {	
	private String _name;
	private HashMap<String, Reference> _variables;
//?	private HashMap<String, ProcedureNode> _procedures;
	private Context _parent;
	
	//a better looking 'macro' when there is no parent context
	public final static Context noParent = null;
	
	public Context (String name, Context parent){
		_name = name;
		_variables = new HashMap<String, Reference>();
		_parent = parent;
	}
	
	public Reference get(String name){
		if (!contains(name)){
			if (_parent != noParent){
				return _parent.get(name);
			}
			throw new IllegalArgumentException("'"+ name + "' is not available in current scope");
		}
		return _variables.get(name);
	}
	
	public void declareVariable(String name, IValue value) {
		_variables.put(name, new Reference (value));
	}
	
	public void declareConstant(String name, IValue value) {
		_variables.put(name, new ConstantReference (value));
	}
	
	public boolean contains(String name){
		return _variables.containsKey(name);
	}
	
	public void print(){
		System.out.print("Known variables in current scope " + _name +":\n");
		for(String key: _variables.keySet()){
			System.out.print("\t* " + key  +"\t has value "+ _variables.get(key).toString() + "\n");
		}
		if (_parent != noParent){
			_parent.print();
		}
	}
}
