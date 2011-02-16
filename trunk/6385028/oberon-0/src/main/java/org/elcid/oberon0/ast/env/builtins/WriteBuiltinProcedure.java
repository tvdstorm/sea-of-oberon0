package org.elcid.oberon0.ast.env.builtins;

import java.util.ArrayList;
import java.util.List;
import org.elcid.oberon0.ast.IntTypeNode;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.env.FormalParameter;
import org.elcid.oberon0.ast.env.Procedure;
import org.elcid.oberon0.ast.env.ReferenceFormalParameter;
import org.elcid.oberon0.ast.values.Int;

/**
 *
 * @author Pieter Brandwijk
 */
public class WriteBuiltinProcedure extends Procedure {

	private static String INPUT_PARAM = "input";

	public WriteBuiltinProcedure() {
	}

	@Override
	public List<FormalParameter> getFormalParams() {
		List<FormalParameter> params = new ArrayList<FormalParameter>();
		params.add(new ReferenceFormalParameter(INPUT_PARAM, new IntTypeNode()));
		return params;
	}

	@Override
	public void execute(Environment env) {
		System.out.print(((Int)env.getValue(INPUT_PARAM)).getValue());
		System.out.flush();

	}
}
