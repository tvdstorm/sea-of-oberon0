package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.util.NodeType;
import java.util.ArrayList;
import java.util.List;
import org.elcid.oberon0.ast.visitor.NodeVisitor;

/**
 * Represents an array in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class ArrayNode extends Node {

	private List<Node> list;

	public ArrayNode() {
		list = new ArrayList<Node>();
	}

	public void add(Node node) {
		list.add(node);
	}

	public Node get(int idx) {
		return list.get(idx);
	}

	public int size() {
		return list.size();
	}

	@Override
	public Object accept(NodeVisitor iVisitor) {
		return iVisitor.visitArrayNode(this);
	}

	@Override
	public List<Node> childNodes() {
		return list;
	}

	@Override
	public NodeType getNodeType() {
		return NodeType.ARRAYNODE;
	}
}
