package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;

public class ModExprNode extends ExpressionNode {
	public ModExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
	}
	
	public OberonInt interpret(Environment env) {
		int left = getLeftHandValue(env);
		int right = getRightHandValue(env);
		
		return new OberonInt(left % right);
		
	}
}
