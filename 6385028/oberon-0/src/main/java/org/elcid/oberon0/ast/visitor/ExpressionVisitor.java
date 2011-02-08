package org.elcid.oberon0.ast.visitor;

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
public class ExpressionVisitor extends BaseVisitor {

	@Override
	public Value eval(ValueExpNode node, Environment localEnv) {
		return node.getValue();
	}

	@Override
	public Value eval(PlusExpNode node, Environment localEnv) {
		Int left = (Int) node.getLeftExp().eval(this, localEnv);
		Int right = (Int) node.getRightExp().eval(this, localEnv);
		return new Int(left.getValue() + right.getValue());
	}

	@Override
	public Value eval(MinusExpNode node, Environment localEnv) {
		Int left = (Int) node.getLeftExp().eval(this, localEnv);
		Int right = (Int) node.getRightExp().eval(this, localEnv);
		return new Int(left.getValue() - right.getValue());
	}

	@Override
	public Value eval(MultiplyExpNode node, Environment localEnv) {
		Int left = (Int) node.getLeftExp().eval(this, localEnv);
		Int right = (Int) node.getRightExp().eval(this, localEnv);
		return new Int(left.getValue() * right.getValue());
	}

	@Override
	public Value eval(DivideExpNode node, Environment localEnv) {
		Int left = (Int) node.getLeftExp().eval(this, localEnv);
		Int right = (Int) node.getRightExp().eval(this, localEnv);
		if (right.getValue() == 0)
			throw new DivideByZeroException("Cannot divide by zero");
		return new Int(left.getValue() / right.getValue());
	}

	@Override
	public Value eval(ModuloExpNode node, Environment localEnv) {
		Int left = (Int) node.getLeftExp().eval(this, localEnv);
		Int right = (Int) node.getRightExp().eval(this, localEnv);
		if (right.getValue() == 0)
			throw new ModuloZeroException("Cannot calculate modulo of zero");
		return new Int(left.getValue() % right.getValue());
	}

	/**
	 * A the moment the equals expression only compares expressions that evaluate to an Int value
	 */
	@Override
	public Value eval(EqualsExpNode node, Environment localEnv) {
		Integer left = ((Int) node.getLeftExp().eval(this, localEnv)).getValue();
		Integer right = ((Int) node.getRightExp().eval(this, localEnv)).getValue();
		return new Bool(left.equals(right));
	}

	@Override
	public Value eval(GreaterExpNode node, Environment localEnv) {
		Int left = (Int) node.getLeftExp().eval(this, localEnv);
		Int right = (Int) node.getRightExp().eval(this, localEnv);
		return new Bool(left.getValue() > right.getValue());
	}

	@Override
	public Value eval(GreaterOrEqualsExpNode node, Environment localEnv) {
		Int left = (Int) node.getLeftExp().eval(this, localEnv);
		Int right = (Int) node.getRightExp().eval(this, localEnv);
		return new Bool(left.getValue() >= right.getValue());
	}

	@Override
	public Value eval(LesserExpNode node, Environment localEnv) {
		Int left = (Int) node.getLeftExp().eval(this, localEnv);
		Int right = (Int) node.getRightExp().eval(this, localEnv);
		return new Bool(left.getValue() < right.getValue());
	}

	@Override
	public Value eval(LesserOrEqualsExpNode node, Environment localEnv) {
		Int left = (Int) node.getLeftExp().eval(this, localEnv);
		Int right = (Int) node.getRightExp().eval(this, localEnv);
		return new Bool(left.getValue() <= right.getValue());
	}

	@Override
	public Value eval(AndExpNode node, Environment localEnv) {
		Bool left = (Bool) node.getLeftExp().eval(this, localEnv);
		Bool right = (Bool) node.getRightExp().eval(this, localEnv);
		return new Bool(left.getValue() && right.getValue());
	}

	@Override
	public Value eval(OrExpNode node, Environment localEnv) {
		Bool left = (Bool) node.getLeftExp().eval(this, localEnv);
		Bool right = (Bool) node.getRightExp().eval(this, localEnv);
		return new Bool(left.getValue() || right.getValue());
	}

	@Override
	public Value eval(IdentSelectorNode node, Environment localEnv) {
		Value value = localEnv.getValue(node.getIdentifier());
		for(SelectorNode selector : node.getSelectors()) {
			value = value.applySelector(selector.select(localEnv));
		}
		return value;
	}
}