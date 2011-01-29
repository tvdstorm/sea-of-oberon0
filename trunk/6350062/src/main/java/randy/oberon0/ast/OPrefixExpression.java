package randy.oberon0.ast;

import randy.oberon0.ast.visitor.OASTNodeVisitor;
import randy.oberon0.ast.enums.Operator;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.*;

public class OPrefixExpression extends OExpression
{
	private OExpression rhs;
	private Operator operator;
	
	public OPrefixExpression(Operator _operator, OExpression _rhs)
	{
		assert(_operator != null);
		assert(_rhs != null);
		operator = _operator;
		rhs = _rhs;
	}
	@Override
	public OValue run(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		assert(vars != null);
		OValue rhsVal = rhs.run(vars, typeRegistry).dereference();
		assert(rhsVal != null);
		if (rhsVal instanceof OInteger)
			return processIntegerExpression((OInteger)rhsVal);
		else if (rhsVal instanceof OBoolean)
			return processBooleanExpression((OBoolean)rhsVal);
		else
			throw new Oberon0OperatorTypeUndefinedException(operator.getOperatorText(), rhsVal.getType());
	}
	private OValue processIntegerExpression(OInteger rhs) throws Oberon0RuntimeException
	{
		if (operator == Operator.PLUS)
			return new OInteger(rhs);
		else if (operator == Operator.MINUS)
			return new OInteger(-rhs.getIntValue());
		else
			throw new Oberon0OperatorTypeUndefinedException(operator.getOperatorText(), rhs.getType());
	}
	private OValue processBooleanExpression(OBoolean rhs) throws Oberon0RuntimeException
	{
		if (operator == Operator.NOT)
			return new OBoolean(!rhs.getBoolValue());
		else
			throw new Oberon0OperatorTypeUndefinedException(operator.getOperatorText(), rhs.getType());
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		rhs.accept(visitor);
		visitor.visitAfter(this);
	}
}
