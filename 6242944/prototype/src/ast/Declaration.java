package ast;

public abstract class Declaration extends Node {

	public abstract <T> T accept(Visitor<T> visitor);

}
