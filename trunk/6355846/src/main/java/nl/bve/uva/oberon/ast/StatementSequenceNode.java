package nl.bve.uva.oberon.ast;

import java.util.List;

public class StatementSequenceNode implements IInterpretableNode {
	private List<IInterpretableNode> sequence;
	
	public StatementSequenceNode(List<IInterpretableNode> sequence) {
		this.sequence = sequence;
	}
	
	@Override
	public Object interpret() {
		for (IInterpretableNode statement : sequence) {
			statement.interpret();
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (IInterpretableNode stmt : sequence) {
			sb.append(stmt);
		}
		
		return sb.toString();
	}
}
