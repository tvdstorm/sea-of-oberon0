package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonType;
import nl.bve.uva.oberon.shared.SelectorValue;

public class WithNode implements IInterpretableNode {
	private IInterpretableNode expression;
	private IInterpretableNode body;
	
	public WithNode(IInterpretableNode expr,IInterpretableNode body) {
		this.expression = expr;
		this.body = body;
	}
	
	@Override
	public Object interpret(Environment env) {
		final OberonType type = (OberonType)expression.interpret(env);
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