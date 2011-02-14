package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonType;

public class AssignmentNode implements IInterpretableNode {
	private IInterpretableNode lhn;
	private IInterpretableNode rhn;
	
	public AssignmentNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		this.lhn = lhn;
		this.rhn = rhn;
	}
	
	@Override
	public Object interpret(Environment env) {
		OberonType ident = (OberonType)lhn.interpret(env);
		Object value = rhn.interpret(env);
		
		ident.setValue((OberonType)value);
		
		return null;
	}
}
