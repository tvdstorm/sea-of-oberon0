package nl.bve.uva.oberon.ast;

import java.util.List;

public class ProcedureCallNode implements IInterpretableNode {
	private IInterpretableNode ident;
	private List<IInterpretableNode> actuals;
	
	public ProcedureCallNode(IInterpretableNode ident, List<IInterpretableNode> actuals) {
		this.ident = ident;
		this.actuals = actuals;
	}
	
	@Override
	public Object interpret() {
		// TODO Auto-generated method stub
		return null;
	}
}
