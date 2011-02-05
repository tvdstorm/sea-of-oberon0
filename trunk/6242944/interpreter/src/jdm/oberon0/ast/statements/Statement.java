package jdm.oberon0.ast.statements;

import jdm.oberon0.ast.Node;

public abstract class Statement extends Node {
	
	public abstract void accept(StatementVisitor visitor);
}
