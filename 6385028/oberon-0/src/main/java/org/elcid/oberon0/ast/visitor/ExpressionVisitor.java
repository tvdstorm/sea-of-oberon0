package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.*;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.exceptions.DivideByZeroException;
import org.elcid.oberon0.exceptions.ModuloZeroException;

/**
 * Implements visit methods for the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class ExpressionVisitor extends BaseVisitor {

	@Override
	public Integer eval(ValueExpNode node, Environment localEnv) {
		return (Integer) node.getValue(localEnv);
	}

	@Override
	public Integer eval(PlusExpNode node, Environment localEnv) {
		Integer left = (Integer) node.getLeftExp().eval(this, localEnv);
		Integer right = (Integer) node.getRightExp().eval(this, localEnv);
		return left + right;
	}

	@Override
	public Integer eval(MinusExpNode node, Environment localEnv) {
		Integer left = (Integer) node.getLeftExp().eval(this, localEnv);
		Integer right = (Integer) node.getRightExp().eval(this, localEnv);
		return left - right;
	}

	@Override
	public Integer eval(MultiplyExpNode node, Environment localEnv) {
		Integer left = (Integer) node.getLeftExp().eval(this, localEnv);
		Integer right = (Integer) node.getRightExp().eval(this, localEnv);
		return left * right;
	}

	@Override
	public Integer eval(DivideExpNode node, Environment localEnv) {
		Integer left = (Integer) node.getLeftExp().eval(this, localEnv);
		Integer right = (Integer) node.getRightExp().eval(this, localEnv);
		if (right == 0)
			throw new DivideByZeroException("Cannot divide by zero");
		return left / right;
	}

	@Override
	public Integer eval(ModuloExpNode node, Environment localEnv) {
		Integer left = (Integer) node.getLeftExp().eval(this, localEnv);
		Integer right = (Integer) node.getRightExp().eval(this, localEnv);
		if (right == 0)
			throw new ModuloZeroException("Cannot calculate modulo of zero");
		return left % right;
	}

	@Override
	public Boolean eval(EqualsExpNode node, Environment localEnv) {
		Object left = node.getLeftExp().eval(this, localEnv);
		Object right = node.getRightExp().eval(this, localEnv);
		return left.equals(right);
	}

	@Override
	public Boolean eval(GreaterExpNode node, Environment localEnv) {
		Integer left = (Integer) node.getLeftExp().eval(this, localEnv);
		Integer right = (Integer) node.getRightExp().eval(this, localEnv);
		return left > right;
	}

	@Override
	public Boolean eval(GreaterOrEqualsExpNode node, Environment localEnv) {
		Integer left = (Integer) node.getLeftExp().eval(this, localEnv);
		Integer right = (Integer) node.getRightExp().eval(this, localEnv);
		return left >= right;
	}

	@Override
	public Boolean eval(LesserExpNode node, Environment localEnv) {
		Integer left = (Integer) node.getLeftExp().eval(this, localEnv);
		Integer right = (Integer) node.getRightExp().eval(this, localEnv);
		return left < right;
	}

	@Override
	public Boolean eval(LesserOrEqualsExpNode node, Environment localEnv) {
		Integer left = (Integer) node.getLeftExp().eval(this, localEnv);
		Integer right = (Integer) node.getRightExp().eval(this, localEnv);
		return left <= right;
	}

	@Override
	public Boolean eval(AndExpNode node, Environment localEnv) {
		Boolean left = (Boolean) node.getLeftExp().eval(this, localEnv);
		Boolean right = (Boolean) node.getRightExp().eval(this, localEnv);
		return left && right;
	}

	@Override
	public Boolean eval(OrExpNode node, Environment localEnv) {
		Boolean left = (Boolean) node.getLeftExp().eval(this, localEnv);
		Boolean right = (Boolean) node.getRightExp().eval(this, localEnv);
		return left || right;
	}
}
