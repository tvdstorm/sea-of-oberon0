package jdm.oberon0.ast;

public abstract class Statement extends Node {
	
	public abstract <T> void accept(Visitor<T> visitor);
}
