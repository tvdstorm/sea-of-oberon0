package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;

public class ModExprNode extends BinaryExpressionNode {
	public ModExprNode(IInterpretableNode lhn, IInterpretableNode rhn) {
		super(lhn, rhn);
	}
	
	public OberonInt interpret(Environment env) {
		int left = evalLhs(env);
		int right = evalRhs(env);
		
		return new OberonInt(left % right);
		
	}
}
