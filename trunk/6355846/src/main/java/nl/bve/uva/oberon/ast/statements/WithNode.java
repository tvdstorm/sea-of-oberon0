package nl.bve.uva.oberon.ast.statements;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonValue;
import nl.bve.uva.oberon.shared.SelectorValue;

public class WithNode extends StatementNode {
	private ExpressionNode expression;
	private IInterpretableNode body;
	
	public WithNode(ExpressionNode expr,IInterpretableNode body) {
		this.expression = expr;
		this.body = body;
	}
	
	@Override
	public void execute(Environment env) {
		final OberonValue type = expression.eval(env);
		final Environment superSpace = env;
		
		Environment withEnv = new Environment(env) {
			@Override
			public OberonValue getVariable(String varId) {
				OberonValue result = null;
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
	}
}