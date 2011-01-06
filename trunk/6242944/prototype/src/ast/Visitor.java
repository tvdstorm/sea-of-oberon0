package ast;

public abstract class Visitor<T> {
	public abstract T visit(Module m);
}

