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
		Object ident = lhn.interpret(env);
		Object value = rhn.interpret(env);
		
		OberonType var = (OberonType)ident;
		var.setValue((OberonType)value);
		
		return null;
	}
}
