package jdm.oberon0.ast.declarations;

import jdm.oberon0.ast.Node;

public abstract class Declaration extends Node {

	public abstract void accept(DeclarationVisitor visitor);
}
