package nl.bve.uva.oberon.ast;

public class AssignmentNode implements IInterpretableNode {
	private IInterpretableNode lhn;
	private IInterpretableNode rhn;
	
	public AssignmentNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		this.lhn = lhn;
		this.rhn = rhn;
		System.out.println("AssignmentNode(" +lhn+ ", " +rhn+ ")");
	}
	
	@Override
	public Object interpret() {
		Object ident = lhn.interpret();
		Object value = rhn.interpret();
		
		/* TODO: lookup variable and assign value; */
		
		return null;
	}
}
