package com.arievanderveek.soo.ast.variables;

public class FormalParameterNode extends FieldNode {

	private final boolean callByReference;

	public FormalParameterNode(String name, TypeNode type, boolean callByReference) {
		super(name, type);
		this.callByReference = callByReference;
	}

	public boolean isCallByReference() {
		return callByReference;
	}

	public String getName() {
		return super.getName();
	}

	public TypeNode getType() {
		return super.getType();
	}

}
