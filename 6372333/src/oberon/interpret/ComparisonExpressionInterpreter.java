package oberon.interpret;

import oberon.ComparisonExpression;
import oberon.ComparisonType;
import oberon.Expression;
import oberon.node.*;

public class ComparisonExpressionInterpreter extends BaseInterpreter<Expression> {
	private Expression _left;
	private Expression _right;
	private ComparisonType _type;

	@Override
	public void caseAExeqExp(AExeqExp node)
	{
		_left = ExpInterpreterFactory.getExpression(node.getLeft());
		_right = ExpInterpreterFactory.getExpression(node.getRight());
		_type = ComparisonType.Exeq;
	}

	@Override
	public void caseAExhaExp(AExhaExp node)
	{
		_left = ExpInterpreterFactory.getExpression(node.getLeft());
		_right = ExpInterpreterFactory.getExpression(node.getRight());
		_type = ComparisonType.Exha;
	}

	@Override
	public void caseAAmpExp(AAmpExp node)
	{
		_left = ExpInterpreterFactory.getExpression(node.getLeft());
		_right = ExpInterpreterFactory.getExpression(node.getRight());
		_type = ComparisonType.Amp;
	}

	@Override
	public void caseAExgeExp(AExgeExp node)
	{
		_left = ExpInterpreterFactory.getExpression(node.getLeft());
		_right = ExpInterpreterFactory.getExpression(node.getRight());
		_type = ComparisonType.Exge;
	}

	@Override
	public void caseAExgtExp(AExgtExp node)
	{
		_left = ExpInterpreterFactory.getExpression(node.getLeft());
		_right = ExpInterpreterFactory.getExpression(node.getRight());
		_type = ComparisonType.Exgt;
	}

	@Override
	public void caseATilExp(ATilExp node)
	{
		_left = ExpInterpreterFactory.getExpression(node.getLeft());
		_right = ExpInterpreterFactory.getExpression(node.getRight());
		_type = ComparisonType.Til;
	}
	
	@Override
	public void caseAExstExp(AExstExp node)
	{
		_left = ExpInterpreterFactory.getExpression(node.getLeft());
		_right = ExpInterpreterFactory.getExpression(node.getRight());
		_type = ComparisonType.Exst;
	}
	
	public void caseAExseExp(AExseExp node)
	{
		_left = ExpInterpreterFactory.getExpression(node.getLeft());
		_right = ExpInterpreterFactory.getExpression(node.getRight());
		_type = ComparisonType.Exse;
	}

	@Override
	public Expression BuildInterpreterResult() {
		return new ComparisonExpression(_left, _right, _type);
	}

}
