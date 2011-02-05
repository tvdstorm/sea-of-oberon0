package jdm.oberon0.ast.types;

import jdm.oberon0.ast.Node;

public abstract class Type extends Node {
	public abstract <T> T accept(TypeVisitor<T> visitor);
}
