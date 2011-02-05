package oberon.interpret;

import oberon.IExpression;
import oberon.expressions.MathematicalExpression;
import oberon.expressions.MathematicalExpressionType;
import oberon.node.AAddExp;
import oberon.node.ADivExp;
import oberon.node.AModExp;
import oberon.node.AMulExp;
import oberon.node.ASubExp;

/**
 * The Class MathematicalExpressionInterpreter.
 */
public class MathematicalExpressionInterpreter extends AbstractBaseInterpreter<IExpression>{
	
	/** The left. */
	private IExpression left;
	
	/** The right. */
	private IExpression right;
	
	/** The type. */
	private MathematicalExpressionType type;
	
	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseASubExp(oberon.node.ASubExp)
	 */
	@Override
	public void caseASubExp(final ASubExp node)
	{
		left = ExpInterpreterFactory.getExpression(node.getLeft());
		right = ExpInterpreterFactory.getExpression(node.getRight());
		type = MathematicalExpressionType.Sub;
	}

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAAddExp(oberon.node.AAddExp)
	 */
	@Override
	public void caseAAddExp(final AAddExp node)
	{
		left = ExpInterpreterFactory.getExpression(node.getLeft());
		right = ExpInterpreterFactory.getExpression(node.getRight());
		type = MathematicalExpressionType.Add;
	}

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseADivExp(oberon.node.ADivExp)
	 */
	@Override
	public void caseADivExp(final ADivExp node)
	{
		left = ExpInterpreterFactory.getExpression(node.getLeft());
		right = ExpInterpreterFactory.getExpression(node.getRight());
		type = MathematicalExpressionType.Div;
	}	

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAModExp(oberon.node.AModExp)
	 */
	@Override
	public void caseAModExp(final AModExp node)
	{
		left = ExpInterpreterFactory.getExpression(node.getLeft());
		right = ExpInterpreterFactory.getExpression(node.getRight());
		type = MathematicalExpressionType.Mod;
	}

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAMulExp(oberon.node.AMulExp)
	 */
	@Override
	public void caseAMulExp(final AMulExp node)
	{
		left = ExpInterpreterFactory.getExpression(node.getLeft());
		right = ExpInterpreterFactory.getExpression(node.getRight());
		type = MathematicalExpressionType.Mul;
	}
	
	/* (non-Javadoc)
	 * @see oberon.interpret.AbstractBaseInterpreter#buildInterpreterResult()
	 */
	@Override
	public IExpression buildInterpreterResult() {
		return new MathematicalExpression(left, right, type);
	}

}
