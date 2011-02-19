package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonType;

public class AssignmentNode implements IInterpretableNode {
	private ExpressionNode lhn;
	private ExpressionNode rhn;
	
	public AssignmentNode(ExpressionNode lhn, ExpressionNode rhn) {
		this.lhn = lhn;
		this.rhn = rhn;
	}
	
	@Override
	public Object interpret(Environment env) {
		OberonType ident = lhn.eval(env);
		OberonType value = rhn.eval(env);
		
		ident.setValue(value);
		
		return null;
	}
}
