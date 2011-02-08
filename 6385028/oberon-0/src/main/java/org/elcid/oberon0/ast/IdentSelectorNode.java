package org.elcid.oberon0.ast;

import java.util.ArrayList;
import java.util.List;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.values.Value;
import org.elcid.oberon0.ast.visitor.BaseVisitor;

/**
 * Represents an identifier selector in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class IdentSelectorNode extends IntExpNode {

	private String identifier;
	private List<SelectorNode> selectors;

	public IdentSelectorNode(String identifier) {
		this.identifier = identifier;
		this.selectors = new ArrayList<SelectorNode>();
	}

	public String getIdentifier() {
		return identifier;
	}

	public List<SelectorNode> getSelectors() {
		return selectors;
	}

	public void addSelector(SelectorNode selector) {
		selectors.add(selector);;
	}

	@Override
	public Value eval(BaseVisitor visitor, Environment localEnv) {
		return visitor.eval(this, localEnv);
	}

}
