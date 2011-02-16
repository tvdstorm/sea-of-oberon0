package org.elcid.oberon0.ast.visitors;

import org.elcid.oberon0.ast.*;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.values.Bool;
import org.elcid.oberon0.ast.values.Int;
import org.elcid.oberon0.ast.values.Value;
import org.elcid.oberon0.exceptions.DivideByZeroException;
import org.elcid.oberon0.exceptions.ModuloZeroException;

/**
 * Implements visit methods for the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class ExpressionVisitor {

	public Value eval(IntExpNode node, Environment localEnv) {
		return node.getValue();
	}

	public Value eval(PlusExpNode node, Environment localEnv) {
		Int left = (Int) node.getLeftExp().eval(this, localEnv);
		Int right = (Int) node.getRightExp().eval(this, localEnv);
		return new Int(left.getValue() + right.getValue());
	}

	public Value eval(MinusExpNode node, Environment localEnv) {
		Int left = (Int) node.getLeftExp().eval(this, localEnv);
		Int right = (Int) node.getRightExp().eval(this, localEnv);
		return new Int(left.getValue() - right.getValue());
	}

	public Value eval(MultiplyExpNode node, Environment localEnv) {
		Int left = (Int) node.getLeftExp().eval(this, localEnv);
		Int right = (Int) node.getRightExp().eval(this, localEnv);
		return new Int(left.getValue() * right.getValue());
	}

	public Value eval(DivideExpNode node, Environment localEnv) {
		Int left = (Int) node.getLeftExp().eval(this, localEnv);
		Int right = (Int) node.getRightExp().eval(this, localEnv);
		if (right.getValue() == 0)
			throw new DivideByZeroException("Cannot divide by zero");
		return new Int(left.getValue() / right.getValue());
	}

	public Value eval(ModuloExpNode node, Environment localEnv) {
		Int left = (Int) node.getLeftExp().eval(this, localEnv);
		Int right = (Int) node.getRightExp().eval(this, localEnv);
		if (right.getValue() == 0)
			throw new ModuloZeroException("Cannot calculate modulo of zero");
		return new Int(left.getValue() % right.getValue());
	}

	/**
	 * At the moment the equals expression only compares expressions that evaluate to an Int value
	 */
	public Value eval(EqualsExpNode node, Environment localEnv) {
		Integer left = ((Int) node.getLeftExp().eval(this, localEnv)).getValue();
		Integer right = ((Int) node.getRightExp().eval(this, localEnv)).getValue();
		return new Bool(left.equals(right));
	}

	/**
	 * At the moment the not equals expression only compares expressions that evaluate to an Int value
	 */
	public Value eval(NotEqualsExpNode node, Environment localEnv) {
		Integer left = ((Int) node.getLeftExp().eval(this, localEnv)).getValue();
		Integer right = ((Int) node.getRightExp().eval(this, localEnv)).getValue();
		return new Bool(!left.equals(right));
	}

	public Value eval(GreaterExpNode node, Environment localEnv) {
		Int left = (Int) node.getLeftExp().eval(this, localEnv);
		Int right = (Int) node.getRightExp().eval(this, localEnv);
		return new Bool(left.getValue() > right.getValue());
	}

	public Value eval(GreaterOrEqualsExpNode node, Environment localEnv) {
		Int left = (Int) node.getLeftExp().eval(this, localEnv);
		Int right = (Int) node.getRightExp().eval(this, localEnv);
		return new Bool(left.getValue() >= right.getValue());
	}

	public Value eval(LesserExpNode node, Environment localEnv) {
		Int left = (Int) node.getLeftExp().eval(this, localEnv);
		Int right = (Int) node.getRightExp().eval(this, localEnv);
		return new Bool(left.getValue() < right.getValue());
	}

	public Value eval(LesserOrEqualsExpNode node, Environment localEnv) {
		Int left = (Int) node.getLeftExp().eval(this, localEnv);
		Int right = (Int) node.getRightExp().eval(this, localEnv);
		return new Bool(left.getValue() <= right.getValue());
	}

	public Value eval(AndExpNode node, Environment localEnv) {
		Bool left = (Bool) node.getLeftExp().eval(this, localEnv);
		Bool right = (Bool) node.getRightExp().eval(this, localEnv);
		return new Bool((boolean)left.getValue() && (boolean)right.getValue());
	}

	public Value eval(OrExpNode node, Environment localEnv) {
		Bool left = (Bool) node.getLeftExp().eval(this, localEnv);
		Bool right = (Bool) node.getRightExp().eval(this, localEnv);
		return new Bool((boolean)left.getValue() || (boolean)right.getValue());
	}

	public Value eval(IdentSelectorNode node, Environment localEnv) {
		Value value = localEnv.getValue(node.getIdentifier());
		for(SelectorNode selector : node.getSelectors()) {
			value = value.applySelector(selector.select(localEnv));
		}
		return value;
	}

	public Value eval(NotExpNode node, Environment localEnv) {
		Boolean value = ((Bool) node.getExpression().eval(this, localEnv)).getValue();
		return new Bool(!value);
	}

	public Value eval(NegativeExpNode node, Environment localEnv) {
		Integer exprValue = ((Int) node.getExpression().eval(this, localEnv)).getValue();
		return new Int(NegativeExpNode.NEGATIVE_FACTOR * exprValue);
	}
}
