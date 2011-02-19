package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonType;
import nl.bve.uva.oberon.shared.SelectorValue;

public class WithNode implements IInterpretableNode {
	private ExpressionNode expression;
	private IInterpretableNode body;
	
	public WithNode(ExpressionNode expr,IInterpretableNode body) {
		this.expression = expr;
		this.body = body;
	}
	
	@Override
	public Object interpret(Environment env) {
		final OberonType type = expression.eval(env);
		final Environment superSpace = env;
		
		Environment withEnv = new Environment(env) {
			
			@Override
			public OberonType getVariable(String varId) {
				OberonType result = null;
				try {
					SelectorValue sv = new SelectorValue(varId);
					result = type.evaluateSelector(sv);
				} catch (RuntimeException re) {
					/* do nothing, field could be available in surrounding environment! */
				}
				
				if (result == null) {
					return superSpace.getVariable(varId);
				} else {
					return result;
				}
			}
		};
	
		body.interpret(withEnv);
		return null;
	}
}