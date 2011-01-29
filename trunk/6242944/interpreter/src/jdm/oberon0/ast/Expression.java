package jdm.oberon0.ast;

public abstract class Expression extends Node {
	
	public abstract <T> T accept(Visitor<T> visitor);
}
