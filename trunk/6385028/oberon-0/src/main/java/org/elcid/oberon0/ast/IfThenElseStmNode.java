package org.elcid.oberon0.ast;

/**
 *
 * @author Pieter Brandwijk
 */
public abstract class IfThenElseStmNode extends StatementNode{

	public abstract void setElseNode(IfThenElseStmNode elseNode) ;

}
