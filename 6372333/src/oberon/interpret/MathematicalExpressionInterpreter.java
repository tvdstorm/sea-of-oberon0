package oberon.interpret;

import oberon.IExpression;
import oberon.MathematicalExpression;
import oberon.MathematicalExpressionType;
import oberon.node.AAddExp;
import oberon.node.ADivExp;
import oberon.node.AModExp;
import oberon.node.AMulExp;
import oberon.node.ASubExp;

public class MathematicalExpressionInterpreter extends AbstractBaseInterpreter<IExpression>{
	private IExpression left;
	private IExpression right;
	private MathematicalExpressionType type;
	
	@Override
	public void caseASubExp(final ASubExp node)
	{
		left = ExpInterpreterFactory.getExpression(node.getLeft());
		right = ExpInterpreterFactory.getExpression(node.getRight());
		type = MathematicalExpressionType.Sub;
	}

	@Override
	public void caseAAddExp(final AAddExp node)
	{
		left = ExpInterpreterFactory.getExpression(node.getLeft());
		right = ExpInterpreterFactory.getExpression(node.getRight());
		type = MathematicalExpressionType.Add;
	}

	@Override
	public void caseADivExp(final ADivExp node)
	{
		left = ExpInterpreterFactory.getExpression(node.getLeft());
		right = ExpInterpreterFactory.getExpression(node.getRight());
		type = MathematicalExpressionType.Div;
	}	

	@Override
	public void caseAModExp(final AModExp node)
	{
		left = ExpInterpreterFactory.getExpression(node.getLeft());
		right = ExpInterpreterFactory.getExpression(node.getRight());
		type = MathematicalExpressionType.Mod;
	}

	@Override
	public void caseAMulExp(final AMulExp node)
	{
		left = ExpInterpreterFactory.getExpression(node.getLeft());
		right = ExpInterpreterFactory.getExpression(node.getRight());
		type = MathematicalExpressionType.Mul;
	}
	
	@Override
	public IExpression buildInterpreterResult() {
		return new MathematicalExpression(left, right, type);
	}

}
