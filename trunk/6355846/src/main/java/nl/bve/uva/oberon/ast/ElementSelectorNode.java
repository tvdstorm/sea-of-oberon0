package nl.bve.uva.oberon.ast;

public class ElementSelectorNode implements IInterpretableNode {
	private IInterpretableNode selector;
	
	public ElementSelectorNode(IInterpretableNode selector) {
		this.selector = selector;
		System.out.println("ElementSelectorNode(" +selector+ ")");
	}
	
	@Override
	public Object interpret() {
		return 12;
	}

}
