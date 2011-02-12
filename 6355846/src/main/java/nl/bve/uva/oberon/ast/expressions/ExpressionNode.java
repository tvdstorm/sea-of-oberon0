package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;
import nl.bve.uva.oberon.env.types.Type;

public abstract class ExpressionNode implements IInterpretableNode {
	private IInterpretableNode lhn;
	private IInterpretableNode rhn;
	
	public ExpressionNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		this.lhn = lhn;
		this.rhn = rhn;
	}
	
	public Integer getLeftHandValue(Environment env) {
		Object leftType = lhn.interpret(env);
		return ((Type)leftType).getValue();
	}
	
	public Integer getRightHandValue(Environment env) {
		Object rightType = rhn.interpret(env);
		return ((Type)rightType).getValue();
		
	}
	
	@Override
	public abstract OberonInt interpret(Environment env);
	
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" +lhn+ ", " +rhn+ ")";
	}
}
