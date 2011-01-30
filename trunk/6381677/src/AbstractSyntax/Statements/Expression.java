package AbstractSyntax.Statements;

import org.antlr.runtime.tree.CommonTree;

import AbstractSyntax.BaseNode;

/**
 * @author Chiel Labee
 * This class represents a Expression Statement.
*/
public class Expression extends BaseStatement 
{
	/**
	 * This enum contains the implemented Expression Operators.
	*/
	public enum Operators 
	{
		Multiplication,
		Division,
		Modulo,
		Addition,
		Subtraction,
		
		LessThan,
		LessThanOrEqualTo,
		GreatherThan,
		GreatherThanOrEqualTo,
		Equal,
		NotEqual,
		LogicalAnd,
		LogicalOr,
		LogicalNot
	}
	
	public Expression(CommonTree parserTree) 
	{
		super(parserTree);
		
		_operator = determineOperator(parserTree);
	}

	private Operators determineOperator(CommonTree parserTree)
	{
		switch(parserTree.getType())
		{
		case ANTLR.OberonParser.MUL:
			return Operators.Multiplication;
			
		case ANTLR.OberonParser.DIV:
			return  Operators.Division;
			
		case ANTLR.OberonParser.MOD:
			return  Operators.Modulo;
			
		case ANTLR.OberonParser.PLUS:
			return  Operators.Addition;
			
		case ANTLR.OberonParser.MIN:
			return  Operators.Subtraction;
			
			
		case ANTLR.OberonParser.EQUAL:
			return  Operators.Equal;
			
		case ANTLR.OberonParser.UNEQUAL:
			return  Operators.NotEqual;
			
		case ANTLR.OberonParser.LESS:
			return  Operators.LessThan;
			
		case ANTLR.OberonParser.LESS_EQUAL:
			return  Operators.LessThanOrEqualTo;
			
		case ANTLR.OberonParser.GREAT:
			return  Operators.GreatherThan;
			
		case ANTLR.OberonParser.GREAT_EQUAL:
			return  Operators.GreatherThanOrEqualTo;
			
		case ANTLR.OberonParser.AND:
			return  Operators.LogicalAnd;
			
		case ANTLR.OberonParser.OR:
			return  Operators.LogicalOr;
			
		case ANTLR.OberonParser.NOT:
			return  Operators.LogicalNot;
			
			
		default:
			return null;
		}
	}
	
	private BaseNode _left = null;
	/**
	 * Gets the Left part of the Expression.
	 */
	public BaseNode getLeft()
	{
		return _left;
	}
	
	private BaseNode _right = null;
	/**
	 * Gets the Right part of the Expression.
	 */
	public BaseNode getRight()
	{
		return _right;
	}
	
	private Operators _operator = null;
	/**
	 * Gets the Operator of the Expression.
	 */
	public Operators getOperator()
	{
		return _operator;
	}
		
	@Override
	protected boolean addChildNode(BaseNode child)
	{
		if (_left == null)
		{
			_left = child;
			return true;
		}

		if (_right == null)
		{
			_right = child;
			return true;
		}
		
		return false;
	}
	
	@Override
	public boolean isValid()
	{
		return super.isValid()
		&& _left != null
		&& _right != null
		&& _operator != null;
	}
	
	@Override
	public int eval(Execution.Scope scope)
	{
		int leftValue = _left.eval(scope);
		int rightValue = _right.eval(scope);
		
		switch (_operator)
		{
		case Addition:
			return leftValue + rightValue;
			
		case Division:
			return leftValue / rightValue;
			
		case Multiplication:
			return leftValue * rightValue;

		case Modulo:
			return leftValue % rightValue;

		case Subtraction:
			return leftValue - rightValue;

			
		case Equal:
			return leftValue == rightValue ? 1 : 0;
		
		case NotEqual:
			return leftValue != rightValue ? 1 : 0;
			
		case GreatherThan:
			return leftValue > rightValue ? 1 : 0;

		case GreatherThanOrEqualTo:
			return leftValue >= rightValue ? 1 : 0;

		case LessThan:
			return leftValue < rightValue ? 1 : 0;

		case LessThanOrEqualTo:
			return leftValue <= rightValue ? 1 : 0;


		case LogicalAnd:
			return leftValue == 1 && rightValue == 1 ? 1 : 0;
			
		case LogicalOr:
			return leftValue == 1 || rightValue == 1 ? 1 : 0;
			
		case LogicalNot:
			return leftValue != rightValue ? 1 : 0;


		default:
			assert false : "Expression Operator not implemented!";
			return 0;
		}
	}
}
