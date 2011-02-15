package org.elcid.oberon0.ast.env;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pieter Brandwijk
 */
public class WriteLnBuiltinProcedure extends Procedure {

	public WriteLnBuiltinProcedure() {
	}

	@Override
	public List<FormalParameter> getFormalParams() {
		List<FormalParameter> params = new ArrayList<FormalParameter>();
		return params;
	}

	@Override
	public void execute(Environment env) {
		System.out.println();
	}
}