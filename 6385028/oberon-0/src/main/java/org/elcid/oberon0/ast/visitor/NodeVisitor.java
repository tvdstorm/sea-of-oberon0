package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.IntegerNode;

/**
 *
 * @author Pieter Brandwijk
 */
public interface NodeVisitor {

	public Object visitIntegerNode(IntegerNode node);

}
