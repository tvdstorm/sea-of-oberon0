package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.*;
import org.elcid.oberon0.ast.values.*;

/**
 * Base visitor that returns <code>null</code> for every visit method. Intended to
 * be extended by other visitors that implement the real algorithms.
 *
 * @author Pieter Brandwijk
 */
public abstract class BaseVisitor {

	public Integer eval(ValueExpNode node, Environment localEnv) {
		return null;
	}

	public Integer eval(PlusExpNode node, Environment localEnv) {
		return null;
	}

	public Integer eval(MinusExpNode node, Environment localEnv) {
		return null;
	}

	public Integer eval(MultiplyExpNode node, Environment localEnv) {
		return null;
	}

	public Integer eval(DivideExpNode node, Environment localEnv) {
		return null;
	}

	public Integer eval(ModuloExpNode node, Environment localEnv) {
		return null;
	}

	public Boolean eval(EqualsExpNode node, Environment localEnv) {
		return null;
	}

	public Boolean eval(GreaterExpNode node, Environment localEnv) {
		return null;
	}

	public Boolean eval(GreaterOrEqualsExpNode node, Environment localEnv) {
		return null;
	}

	public Boolean eval(LesserExpNode node, Environment localEnv) {
		return null;
	}

	public Boolean eval(LesserOrEqualsExpNode node, Environment localEnv) {
		return null;
	}

	public Boolean eval(AndExpNode node, Environment localEnv) {
		return null;
	}

	public Boolean eval(OrExpNode node, Environment localEnv) {
		return null;
	}
}
