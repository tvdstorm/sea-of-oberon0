package nl.bve.uva.oberon.ast;

import java.util.List;

public abstract class IdentNode implements IInterpretableNode {
	private String name;
	private List<IInterpretableNode> selectors;
	
	public IdentNode(String name, List<IInterpretableNode> selectors) {
		this.name = name;
		this.selectors = selectors;
		System.out.println("IdentNode(" +name+ ", " +selectors+ ")");
	}
}
