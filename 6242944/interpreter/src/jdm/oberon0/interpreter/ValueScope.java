package jdm.oberon0.interpreter;

import java.util.HashMap;
import java.util.Map;

import jdm.oberon0.builtins.BuiltinProcedure;
import jdm.oberon0.types.Type;
import jdm.oberon0.values.ReferenceValue;
import jdm.oberon0.values.Value;

/**
 * This class stores all scope-related values (variables, constants, types).
 */
public class ValueScope extends Scope {
	protected Map<String, Value> _constants;
	protected Map<String, ReferenceValue> _variables;
	protected Map<String, Callable> _procedures;
	protected Map<String, Type> _types;

	public ValueScope() {
		_constants = new HashMap<String, Value>();
		_variables = new HashMap<String, ReferenceValue>();
		_procedures = new HashMap<String, Callable>();
		_types = new HashMap<String, Type>();
	}
	
	public ValueScope(ValueScope parentScope) {
		_parentScope = parentScope;
		_constants = new HashMap<String, Value>(parentScope._constants);
		_variables = new HashMap<String, ReferenceValue>(parentScope._variables);
		_procedures = new HashMap<String, Callable>(parentScope._procedures);
		_types = new HashMap<String, Type>(parentScope._types);
	}
	public void defineConstant(String name, Value value) {
		_constants.put(name, value);
	}
	
	public void defineType(String name, Type type) {
		_types.put(name, type);
	}
	
	public void defineProcedure(String name, Callable procedure) {
		_procedures.put(name, procedure);
	}
	
	public Value lookupVarOrConst(String name) {
		if (_constants.containsKey(name)) {
			return _constants.get(name);
		}	
		
		// type checking ensures this must be a variable
		assert _variables.containsKey(name);
		return _variables.get(name);
	}

	public Callable lookupProcedure(String name) {
		return _procedures.get(name);
	}

	public Type lookupType(String name) {
		 // type checker ensures this always succeeds
		assert _types.containsKey(name);
		return _types.get(name);
	}
	
	public void defineVar(String name, Value value) {
		_variables.put(name, ReferenceValue.getRef(value));
	}
	
	@Override
	public void defineProcedure(String name, BuiltinProcedure procedure) {
		defineProcedure(name, (Callable)procedure);
	}
}
