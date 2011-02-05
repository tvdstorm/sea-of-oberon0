package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.*;
import org.elcid.oberon0.ast.values.Environment;
import org.elcid.oberon0.exceptions.DivideByZeroException;
import org.elcid.oberon0.exceptions.ModuloZeroException;

/**
 * Implements visit methods for the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class ExpressionVisitor extends BaseVisitor {

	@Override
	public Integer visitValueExpNode(ValueExpNode node, Environment localEnv) {
		return (Integer) node.getValue(localEnv);
	}

	@Override
	public Integer visitPlusExpNode(PlusExpNode node, Environment localEnv) {
		Integer left = (Integer) node.getLeftExp().accept(this, localEnv);
		Integer right = (Integer) node.getRightExp().accept(this, localEnv);
		return left + right;
	}

	@Override
	public Integer visitMinusExpNode(MinusExpNode node, Environment localEnv) {
		Integer left = (Integer) node.getLeftExp().accept(this, localEnv);
		Integer right = (Integer) node.getRightExp().accept(this, localEnv);
		return left - right;
	}

	@Override
	public Integer visitMultiplyExpNode(MultiplyExpNode node, Environment localEnv) {
		Integer left = (Integer) node.getLeftExp().accept(this, localEnv);
		Integer right = (Integer) node.getRightExp().accept(this, localEnv);
		return left * right;
	}

	@Override
	public Integer visitDivideExpNode(DivideExpNode node, Environment localEnv) {
		Integer left = (Integer) node.getLeftExp().accept(this, localEnv);
		Integer right = (Integer) node.getRightExp().accept(this, localEnv);
		if (right == 0)
			throw new DivideByZeroException("Cannot divide by zero");
		return left / right;
	}

	@Override
	public Integer visitModuloExpNode(ModuloExpNode node, Environment localEnv) {
		Integer left = (Integer) node.getLeftExp().accept(this, localEnv);
		Integer right = (Integer) node.getRightExp().accept(this, localEnv);
		if (right == 0)
			throw new ModuloZeroException("Cannot calculate modulo of zero");
		return left % right;
	}

	@Override
	public Boolean visitEqualsExpNode(EqualsExpNode node, Environment localEnv) {
		Object left = node.getLeftExp().accept(this, localEnv);
		Object right = node.getRightExp().accept(this, localEnv);
		return left.equals(right);
	}

	@Override
	public Boolean visitGreaterExpNode(GreaterExpNode node, Environment localEnv) {
		Integer left = (Integer) node.getLeftExp().accept(this, localEnv);
		Integer right = (Integer) node.getRightExp().accept(this, localEnv);
		return left > right;
	}

	@Override
	public Boolean visitGreaterOrEqualsExpNode(GreaterOrEqualsExpNode node, Environment localEnv) {
		Integer left = (Integer) node.getLeftExp().accept(this, localEnv);
		Integer right = (Integer) node.getRightExp().accept(this, localEnv);
		return left >= right;
	}

	@Override
	public Boolean visitLesserExpNode(LesserExpNode node, Environment localEnv) {
		Integer left = (Integer) node.getLeftExp().accept(this, localEnv);
		Integer right = (Integer) node.getRightExp().accept(this, localEnv);
		return left < right;
	}

	@Override
	public Boolean visitLesserOrEqualsExpNode(LesserOrEqualsExpNode node, Environment localEnv) {
		Integer left = (Integer) node.getLeftExp().accept(this, localEnv);
		Integer right = (Integer) node.getRightExp().accept(this, localEnv);
		return left <= right;
	}

}
