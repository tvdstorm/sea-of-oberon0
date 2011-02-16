package org.elcid.oberon0.ast;

import java.util.ArrayList;
import java.util.List;
import org.elcid.oberon0.env.FormalParameter;
import org.elcid.oberon0.env.ReferenceFormalParameter;

/**
 *
 * @author Pieter Brandwijk
 */
public class ReferenceFpSectionNode extends FpSectionNode {

	private List<String> identifiers;
	private TypeNode type;

	public ReferenceFpSectionNode(List<String> identifiers, TypeNode type) {
		this.identifiers = identifiers;
		this.type = type;
	}

	@Override
	public List<FormalParameter> process() {
		List<FormalParameter> params = new ArrayList<FormalParameter>();
		for (String identifier: identifiers) {
			params.add(new ReferenceFormalParameter(identifier, type));
		}
		return params;
	}

}
