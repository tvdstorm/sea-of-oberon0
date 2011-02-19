package jdm.oberon0.typechecker;

import java.util.HashMap;
import java.util.Map;

import jdm.oberon0.builtins.BuiltinProcedure;
import jdm.oberon0.exceptions.RedeclarationException;
import jdm.oberon0.exceptions.UndefinedProcedureException;
import jdm.oberon0.exceptions.UndefinedTypeException;
import jdm.oberon0.exceptions.UndefinedVariableException;
import jdm.oberon0.interpreter.Scope;
import jdm.oberon0.types.ProcedureType;
import jdm.oberon0.types.ReferenceType;
import jdm.oberon0.types.Type;
import jdm.oberon0.values.Value;

public class TypeScope extends Scope {
	protected Map<String, Type> _constants;
	protected Map<String, ReferenceType> _variables;
	protected Map<String, ProcedureType> _procedures;
	protected Map<String, Type> _types;

	public TypeScope() {
		_constants = new HashMap<String, Type>();
		_variables = new HashMap<String, ReferenceType>();
		_procedures = new HashMap<String, ProcedureType>();
		_types = new HashMap<String, Type>();
	}
	
	public TypeScope(TypeScope parentScope) {
		_parentScope = parentScope;
		_constants = new HashMap<String, Type>(parentScope._constants);
		_variables = new HashMap<String, ReferenceType>(parentScope._variables);
		_procedures = new HashMap<String, ProcedureType>(parentScope._procedures);
		_types = new HashMap<String, Type>(parentScope._types);
	}
	public void defineConstant(String name, Type type) {
		_constants.put(name, type);
	}
	
	public void defineType(String name, Type type) {
		_types.put(name, type);
	}
	
	public void defineProcedure(String name, BuiltinProcedure procedure) {
		defineProcedure(name, procedure.getType());
	}
	
	public void defineProcedure(String name, ProcedureType type) {
		if (_procedures.containsKey(name)) {
			throw new RedeclarationException(name);
		}
		_procedures.put(name, type);
	}
	
	public Type lookupVarOrConst(String name) {
		if (_constants.containsKey(name)) {
			return _constants.get(name);
		}
		
		if (_variables.containsKey(name)) {
			return _variables.get(name);
		}
		throw new UndefinedVariableException(name);
	}

	public ProcedureType lookupProcedure(String name) {
		if (!_procedures.containsKey(name)) {
			throw new UndefinedProcedureException(name);
		}
		return _procedures.get(name);
	}

	public Type lookupType(String name) {
		if (!_types.containsKey(name)) {
			throw new UndefinedTypeException(name);
		}
		return _types.get(name);
	}
	
	public void defineVar(String name, Type type) {
		_variables.put(name, ReferenceType.getRef(type));
	}
	
	@Override
	public void defineConstant(String name, Value value) {
		_constants.put(name, value.getType());
	}
}
