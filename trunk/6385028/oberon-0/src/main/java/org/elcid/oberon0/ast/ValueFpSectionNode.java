package org.elcid.oberon0.ast;

import java.util.ArrayList;
import java.util.List;
import org.elcid.oberon0.ast.env.FormalParameter;
import org.elcid.oberon0.ast.env.ValueFormalParameter;

/**
 *
 * @author Pieter Brandwijk
 */
public class ValueFpSectionNode extends FpSectionNode {

	private List<String> identifiers;
	private TypeNode type;

	public ValueFpSectionNode(List<String> identifiers, TypeNode type) {
		this.identifiers = identifiers;
		this.type = type;
	}

	@Override
	public List<FormalParameter> process() {
		List<FormalParameter> params = new ArrayList<FormalParameter>();
		for (String identifier: identifiers) {
			params.add(new ValueFormalParameter(identifier, type));
		}
		return params;
	}

}
