package org.elcid.oberon0.ast.env.builtins;

import java.util.ArrayList;
import java.util.List;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.env.FormalParameter;
import org.elcid.oberon0.ast.env.Procedure;

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