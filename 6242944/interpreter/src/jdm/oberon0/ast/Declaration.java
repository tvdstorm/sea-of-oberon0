package jdm.oberon0.ast;

public abstract class Declaration extends Node {

	public abstract <T> void accept(Visitor<T> visitor);
}
