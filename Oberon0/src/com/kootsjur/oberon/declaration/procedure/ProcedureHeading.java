package com.kootsjur.oberon.declaration.procedure;

import com.kootsjur.oberon.declaration.formalparameter.FormalParameters;

public class ProcedureHeading {
	private String name;
	private FormalParameters formalParameters;

	public ProcedureHeading(String name) {
		assert (name != null) : "Error in Constructor ProcedureHeading!  parameter name is null!";

		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setFormalParameters(FormalParameters formalParameters) {
		this.formalParameters = formalParameters;
	}

	public FormalParameters getFormalParameters() {
		return formalParameters;
	}
}
