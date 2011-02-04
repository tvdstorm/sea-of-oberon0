package oberon0.environment;

import java.util.HashMap;

import oberon0.ast.routines.ICallable;

public class Context {	
	private String _name;
	private HashMap<String, Reference> _variables;
	private HashMap<String, ICallable> _procedures;
	private Context _parent;
	
	//a better looking 'macro' when there is no parent context
	public final static Context noParent = null;
	
	public Context (String name, Context parent){
		_name = name;
		_variables = new HashMap<String, Reference>();
		_procedures = new HashMap<String, ICallable>();
		_parent = parent;
	}
	
	public Reference getReference(String name){
		if (!contains(name)){
			if (_parent != noParent){
				return _parent.getReference(name);
			}
			throw new IllegalArgumentException("'"+ name + "' is not in scope");
		}
		return _variables.get(name);
	}
	
	public ICallable getProcedure(String name){
		return _procedures.get(name);
	}
	
	public void declareVariable(String name, IValue value) {
		_variables.put(name, new Reference (value));
	}
	
	public void declareReferenceVariable(String name, Reference reference){
		_variables.put(name, reference);
	}
	
	public void declareConstant(String name, IValue value) {
		_variables.put(name, new ConstantReference (value));
	}
	
	public void declareProcedure(String name, ICallable procedure){
		_procedures.put(name, procedure);
	}
	
	public boolean contains(String name){
		return _variables.containsKey(name);
	}
	
	public void print(){
		System.out.print("Known variables in current scope " + _name +":\n");
		for(String key: _variables.keySet()){
			System.out.print("\t  * " + key  +"\t has value "+ _variables.get(key).toString() + "\n");
		}
		System.out.print("\tProcedures:\n");
		for(String key: _procedures.keySet()){
			System.out.print("\t  * " + key  +"\n");
		}
		if (_parent != noParent){
			_parent.print();
		}
	}
}
