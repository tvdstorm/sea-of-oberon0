package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.util.NodeType;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitor.BaseVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * Base class for all nodes in the AST.
 *
 * @author Pieter Brandwijk
 */
public abstract class Node {
	
	static final List<Node> EMPTY_LIST = new ArrayList<Node>();

	public abstract Object accept(BaseVisitor visitor, Environment localEnv);

	public abstract List<Node> childNodes();

	public abstract NodeType getNodeType();

	protected static List<Node> createList(Node... nodes) {
		ArrayList<Node> list = new ArrayList<Node>();

		for (Node node : nodes) {
			if (node != null) {
				list.add(node);
			}
		}

		return list;
	}
}
