package nl.bve.uva.oberon.ast;

public class DotSelectorNode implements IInterpretableNode {
	private String selector;
	
	public DotSelectorNode(String selector) {
		this.selector = selector;
		System.out.println("DotSelectorNode(" +selector+ ")");
	}
	
	@Override
	public Object interpret() {
		return 12;
	}

}
