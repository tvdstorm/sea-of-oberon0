package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.Type;

public class AssignmentNode implements IInterpretableNode {
	private IInterpretableNode lhn;
	private IInterpretableNode rhn;
	
	public AssignmentNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		this.lhn = lhn;
		this.rhn = rhn;
		System.out.println("AssignmentNode(" +lhn+ ", " +rhn+ ")");
	}
	
	@Override
	public Object interpret(Environment env) {
		Object ident = lhn.interpret(env);
		Object value = rhn.interpret(env);
		
		assert ident instanceof Type : "Cannot assign a value to a non-Type instance!";
		
		Type var = (Type)ident;
		var.setValue(value);
		
		return null;
	}
}