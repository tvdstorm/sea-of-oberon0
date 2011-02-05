package oberon0.environment;

import java.util.HashMap;

import oberon0.ast.routines.ICallable;

/*
 * This is where all known variables, procedures and types can be stored
 * Also known as Environment 
 */
public class Context {	
	private String _name;
	private HashMap<String, Reference> _variables;
	private HashMap<String, ICallable> _procedures;
	private HashMap<String, IValue> _types;
	private Context _parent;
	
	/*
	 * when there is no parent, use this 'null'-value to increase readability
	 */
	public final static Context noParent = null;
	
	public Context (String name, Context parent){
		_name = name;
		_variables = new HashMap<String, Reference>();
		_procedures = new HashMap<String, ICallable>();
		_types = new HashMap<String, IValue>();
		_parent = parent;
	}
	
	/*
	 * Get a reference from the variable scope with the given name
	 */
	public Reference getReference(String name){
		if (!containsVariable(name)){
			if (_parent != noParent){
				return _parent.getReference(name);
			}
			throw new IllegalArgumentException("'"+ name + "' is not in scope");
		}
		return _variables.get(name);
	}
	
	/*
	 * returns true if name exists in current variablescope (_variables)
	 * otherwise returns false
	 */
	private boolean containsVariable(String name){
		return _variables.containsKey(name);
	}
	
	/*
	 * Get a procedure known in the current scope with the given name
	 */
	public ICallable getProcedure(String name){
		return _procedures.get(name);
	}
	
	/*
	 * Get the type with the given name from the current scope 
	 */
	public IValue getType(String name){
		return _types.get(name);
	}
	
	/*
	 * declare a new type in the current scope by a name and a value
	 */
	public void declareType(String name, IValue type){
		_types.put(name, type);
	}
	
	/*
	 * declares a name and value in the current variablescope
	 * (makes a new reference from the given value 
	 */
	public void declareVariable(String name, IValue value) {
		_variables.put(name, new Reference(value));
	}
	
	/*
	 * declares a name and reference in the current variablescope
	 */
	public void declareReferenceVariable(String name, Reference reference){
		_variables.put(name, reference);
	}
	
	/*
	 * declares a constant reference in the current variablescope
	 */
	public void declareConstant(String name, IValue value) {
		_variables.put(name, new ConstantReference(value));
	}
	
	/*
	 * declares a procedure in the current procedurescope
	 */
	public void declareProcedure(String name, ICallable procedure){
		_procedures.put(name, procedure);
	}
	
	/*
	 * Prints the current context
	 * can be used for debugging and testing
	 */
	public void print(){
		System.out.print("Known variables in current scope " + _name +":\n");
		for(String key: _variables.keySet()){
			System.out.print("\t  * " + key  +"\t has value "+ _variables.get(key).toString() + "\n");
		}
		System.out.print("\tProcedures:\n");
		for(String key: _procedures.keySet()){
			System.out.print("\t  * " + key  +"\n");
		}
	}
	
	/*
	 * returns the parentscope
	 */
	public Context getParent(){
		return _parent;
	}
}
