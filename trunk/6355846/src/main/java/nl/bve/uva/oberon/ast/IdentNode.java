package nl.bve.uva.oberon.ast;

public class IdentNode implements IInterpretableNode {
	private String name;
	private IInterpretableNode selector;
	
	public IdentNode(String name, IInterpretableNode selector) {
		this.name = name;
		this.selector = selector;
		System.out.println("IdentNode(" +name+ ", " +selector+ ")");
	}
	
	@Override
	public Object interpret() {
		return 14;
	}
}
