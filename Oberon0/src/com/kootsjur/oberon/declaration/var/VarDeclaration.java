package com.kootsjur.oberon.declaration.var;

import java.util.List;

import com.kootsjur.oberon.declaration.Declaration;
import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.type.TypeDefinition;
import com.kootsjur.oberon.value.Value;

public class VarDeclaration implements Declaration {
	private List<String> names;
	private TypeDefinition typeDefinition;

	public VarDeclaration(List<String> names, TypeDefinition typeDefinition) {
		// pre-condition
		assert (names != null) : "Error in Constructor VarDeclaration!  parameter names is null!";
		assert (typeDefinition != null) : "Error in Constructor VarDeclaration!  parameter typeDefinition is null!";
		assert (names.size() > 0) : "Error in Constructor VarDeclaration!  parameter names does not contain any names!";

		this.names = names;
		this.typeDefinition = typeDefinition;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public List<String> getNames() {
		return names;
	}

	public void setType(TypeDefinition typeDefinition) {
		this.typeDefinition = typeDefinition;
	}

	public TypeDefinition getType() {
		return typeDefinition;
	}

	@Override
	public void declare(Environment environment) {
		// pre-Condition
		assert (environment != null) : "Error in VarDeclaration method declare! Environment is null!";

		Value value = typeDefinition.initValue(environment);
		environment.declareVar(names, value);
		checkPostCondition(names, value);
	}

	private void checkPostCondition(List<String> names, Value value) {
		// TODO Auto-generated method stub

	}
}
