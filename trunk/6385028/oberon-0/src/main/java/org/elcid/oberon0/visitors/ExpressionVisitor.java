package org.elcid.oberon0.visitors;

import org.elcid.oberon0.ast.*;
import org.elcid.oberon0.env.Environment;
import org.elcid.oberon0.values.Bool;
import org.elcid.oberon0.values.Int;
import org.elcid.oberon0.values.Value;
import org.elcid.oberon0.exceptions.DivideByZeroException;
import org.elcid.oberon0.exceptions.ModuloZeroException;

/**
 * Implements visit methods for the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class ExpressionVisitor {

	public Value eval(IntExpNode node, Environment env) {
		return node.getValue();
	}

	public Value eval(PlusExpNode node, Environment env) {
		Int left = (Int) node.getLeftExp().eval(this, env);
		Int right = (Int) node.getRightExp().eval(this, env);
		return new Int(left.getValue() + right.getValue());
	}

	public Value eval(MinusExpNode node, Environment env) {
		Int left = (Int) node.getLeftExp().eval(this, env);
		Int right = (Int) node.getRightExp().eval(this, env);
		return new Int(left.getValue() - right.getValue());
	}

	public Value eval(MultiplyExpNode node, Environment env) {
		Int left = (Int) node.getLeftExp().eval(this, env);
		Int right = (Int) node.getRightExp().eval(this, env);
		return new Int(left.getValue() * right.getValue());
	}

	public Value eval(DivideExpNode node, Environment env) {
		Int left = (Int) node.getLeftExp().eval(this, env);
		Int right = (Int) node.getRightExp().eval(this, env);
		if (right.getValue() == 0)
			throw new DivideByZeroException("Cannot divide by zero");
		return new Int(left.getValue() / right.getValue());
	}

	public Value eval(ModuloExpNode node, Environment env) {
		Int left = (Int) node.getLeftExp().eval(this, env);
		Int right = (Int) node.getRightExp().eval(this, env);
		if (right.getValue() == 0)
			throw new ModuloZeroException("Cannot calculate modulo of zero");
		return new Int(left.getValue() % right.getValue());
	}

	/**
	 * At the moment the equals expression only compares expressions that evaluate to an Int value
	 */
	public Value eval(EqualsExpNode node, Environment env) {
		Integer left = ((Int) node.getLeftExp().eval(this, env)).getValue();
		Integer right = ((Int) node.getRightExp().eval(this, env)).getValue();
		return new Bool(left.equals(right));
	}

	/**
	 * At the moment the not equals expression only compares expressions that evaluate to an Int value
	 */
	public Value eval(NotEqualsExpNode node, Environment env) {
		Integer left = ((Int) node.getLeftExp().eval(this, env)).getValue();
		Integer right = ((Int) node.getRightExp().eval(this, env)).getValue();
		return new Bool(!left.equals(right));
	}

	public Value eval(GreaterExpNode node, Environment env) {
		Int left = (Int) node.getLeftExp().eval(this, env);
		Int right = (Int) node.getRightExp().eval(this, env);
		return new Bool(left.getValue() > right.getValue());
	}

	public Value eval(GreaterOrEqualsExpNode node, Environment env) {
		Int left = (Int) node.getLeftExp().eval(this, env);
		Int right = (Int) node.getRightExp().eval(this, env);
		return new Bool(left.getValue() >= right.getValue());
	}

	public Value eval(LesserExpNode node, Environment env) {
		Int left = (Int) node.getLeftExp().eval(this, env);
		Int right = (Int) node.getRightExp().eval(this, env);
		return new Bool(left.getValue() < right.getValue());
	}

	public Value eval(LesserOrEqualsExpNode node, Environment env) {
		Int left = (Int) node.getLeftExp().eval(this, env);
		Int right = (Int) node.getRightExp().eval(this, env);
		return new Bool(left.getValue() <= right.getValue());
	}

	public Value eval(AndExpNode node, Environment env) {
		Bool left = (Bool) node.getLeftExp().eval(this, env);
		Bool right = (Bool) node.getRightExp().eval(this, env);
		return new Bool((boolean)left.getValue() && (boolean)right.getValue());
	}

	public Value eval(OrExpNode node, Environment env) {
		Bool left = (Bool) node.getLeftExp().eval(this, env);
		Bool right = (Bool) node.getRightExp().eval(this, env);
		return new Bool((boolean)left.getValue() || (boolean)right.getValue());
	}

	public Value eval(IdentSelectorNode node, Environment env) {
		Value value = env.getValue(node.getIdentifier());
		for(SelectorNode selector : node.getSelectors()) {
			value = value.applySelector(selector.select(env));
		}
		return value;
	}

	public Value eval(NotExpNode node, Environment env) {
		Boolean value = ((Bool) node.getExpression().eval(this, env)).getValue();
		return new Bool(!value);
	}

	public Value eval(NegativeExpNode node, Environment env) {
		Integer exprValue = ((Int) node.getExpression().eval(this, env)).getValue();
		return new Int(NegativeExpNode.NEGATIVE_FACTOR * exprValue);
	}
}
