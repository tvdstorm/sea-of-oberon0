package nl.bve.uva.oberon.ast;

public class NumberNode implements IInterpretableNode {
	private Integer number;
	
	public NumberNode(Integer number) {
		this.number = number;
		System.out.println("NumberNode(" +number+ ")");
	}
	
	@Override
	public Object interpret() {
		return number;
	}
}