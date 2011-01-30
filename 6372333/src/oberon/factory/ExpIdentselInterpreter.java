package oberon.factory;

import oberon.ArrayIndexerExpression;
import oberon.Expression;
import oberon.IdentifierExpression;
import oberon.node.AExpressionSelector;
import oberon.node.AIdentselExp;
import oberon.node.ANoneSelector;
import oberon.node.PSelector;

class ExpIdentselInterpreter extends BaseInterpreter<Expression> {
	private String _name;
	private boolean _isIdentifier;
	private Expression _expression;

	public void caseAIdentselExp(AIdentselExp node)
	{
		_name = node.getIdentifier().toString().trim();
		PSelector selector = node.getSelector();
		_isIdentifier = selector instanceof ANoneSelector;
		
		if (!_isIdentifier)
		{
			selector.apply(this);
		}
	}
	
	public void caseAExpressionSelector(AExpressionSelector node)
	{
		_expression = ExpInterpreterFactory.getExpression(node.getExp());
	}
	
	@Override
	public Expression BuildInterpreterResult() {
		if (_isIdentifier)
		{
			return new IdentifierExpression(_name);
		}
		return new ArrayIndexerExpression(_name, _expression);
	}

}
