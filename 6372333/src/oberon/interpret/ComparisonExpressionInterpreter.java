package oberon.interpret;

import oberon.ComparisonExpression;
import oberon.ComparisonType;
import oberon.IExpression;
import oberon.node.AAmpExp;
import oberon.node.AExeqExp;
import oberon.node.AExgeExp;
import oberon.node.AExgtExp;
import oberon.node.AExhaExp;
import oberon.node.AExseExp;
import oberon.node.AExstExp;
import oberon.node.ATilExp;

public class ComparisonExpressionInterpreter extends AbstractBaseInterpreter<IExpression> {
	private IExpression left;
	private IExpression right;
	private ComparisonType type;

	@Override
	public void caseAExeqExp(final AExeqExp node)
	{
		left = ExpInterpreterFactory.getExpression(node.getLeft());
		right = ExpInterpreterFactory.getExpression(node.getRight());
		type = ComparisonType.Exeq;
	}

	@Override
	public void caseAExhaExp(final AExhaExp node)
	{
		left = ExpInterpreterFactory.getExpression(node.getLeft());
		right = ExpInterpreterFactory.getExpression(node.getRight());
		type = ComparisonType.Exha;
	}

	@Override
	public void caseAAmpExp(final AAmpExp node)
	{
		left = ExpInterpreterFactory.getExpression(node.getLeft());
		right = ExpInterpreterFactory.getExpression(node.getRight());
		type = ComparisonType.Amp;
	}

	@Override
	public void caseAExgeExp(final AExgeExp node)
	{
		left = ExpInterpreterFactory.getExpression(node.getLeft());
		right = ExpInterpreterFactory.getExpression(node.getRight());
		type = ComparisonType.Exge;
	}

	@Override
	public void caseAExgtExp(final AExgtExp node)
	{
		left = ExpInterpreterFactory.getExpression(node.getLeft());
		right = ExpInterpreterFactory.getExpression(node.getRight());
		type = ComparisonType.Exgt;
	}

	@Override
	public void caseATilExp(final ATilExp node)
	{
		left = ExpInterpreterFactory.getExpression(node.getLeft());
		right = ExpInterpreterFactory.getExpression(node.getRight());
		type = ComparisonType.Til;
	}
	
	@Override
	public void caseAExstExp(final AExstExp node)
	{
		left = ExpInterpreterFactory.getExpression(node.getLeft());
		right = ExpInterpreterFactory.getExpression(node.getRight());
		type = ComparisonType.Exst;
	}
	
	public void caseAExseExp(final AExseExp node)
	{
		left = ExpInterpreterFactory.getExpression(node.getLeft());
		right = ExpInterpreterFactory.getExpression(node.getRight());
		type = ComparisonType.Exse;
	}

	@Override
	public IExpression buildInterpreterResult() {
		return new ComparisonExpression(left, right, type);
	}

}
