package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;
import nl.bve.uva.oberon.env.types.Type;

public class ModExprNode extends ExpressionNode {
	public ModExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
		System.out.println("ModExprNode(" +lhn+ ", " +rhn+ ")");
	}
	
	public OberonInt interpret(Environment env) {
		Object lhn = getLeftHandNode().interpret(env);
		Object rhn = getRightHandNode().interpret(env);

		assert (lhn instanceof Type);
		assert (rhn instanceof Type);
		
		int left  = ((Type)lhn).interpret(env);
		int right = ((Type)rhn).interpret(env);
		
		return new OberonInt(left % right);
		
	}
}
