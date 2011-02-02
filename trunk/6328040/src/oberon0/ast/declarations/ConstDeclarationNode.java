package oberon0.ast.declarations;

import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.Context;
import oberon0.environment.IValue;

public class ConstDeclarationNode implements IDeclarable{
	private String _name;
	private IEvaluable _expression;
	
	
	public ConstDeclarationNode(String name, IEvaluable expression) {
		_name = name;
		_expression = expression;
	}

	@Override
	public void declare(Context context) {
		IValue value = _expression.eval(context);
		context.declareConstant(_name, value);
	}
}
