package org.elcid.oberon0.ast;

import java.util.ArrayList;
import java.util.List;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitor.DeclarationVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class DeclarationSequenceNode extends DeclarationNode {
	
	private List<ConstDeclNode> constants;

	public DeclarationSequenceNode() {
		constants = new ArrayList<ConstDeclNode>();
	}

	public List<ConstDeclNode> getConstants() {
		return constants;
	}

	public void addAll(List<ConstDeclNode> list) {
		if (!list.isEmpty())
			constants.addAll(list);
	}

	@Override
	public void run(DeclarationVisitor visitor, Environment env) {
		visitor.run(this, env);
	}
}
