package eu.wietsevenema.lang.oberon.ast.expressions;

public class Identifier extends Expression implements Comparable<Identifier> {

	String name;

	public Identifier(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return this.name;
	}

	@Override
	public int compareTo(Identifier o) {
		return this.getName().compareTo(o.getName());
	}

}
