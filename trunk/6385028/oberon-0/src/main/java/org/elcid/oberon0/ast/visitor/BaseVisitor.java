package org.elcid.oberon0.ast.visitor;

import org.elcid.oberon0.ast.*;
import org.elcid.oberon0.ast.values.*;

/**
 * Base visitor that returns <code>null</code> for every visit method. Intended to
 * be extended by other visitors that implement the real algorithms.
 *
 * @author Pieter Brandwijk
 */
public abstract class BaseVisitor {

	public Integer visitValueExpNode(ValueExpNode node, Environment localEnv) {
		return null;
	}

	public Integer visitPlusExpNode(PlusExpNode node, Environment localEnv) {
		return null;
	}

	public Integer visitMinusExpNode(MinusExpNode node, Environment localEnv) {
		return null;
	}

	public Integer visitMultiplyExpNode(MultiplyExpNode node, Environment localEnv) {
		return null;
	}

	public Integer visitDivideExpNode(DivideExpNode node, Environment localEnv) {
		return null;
	}

	public Integer visitModuloExpNode(ModuloExpNode node, Environment localEnv) {
		return null;
	}

	public Boolean visitEqualsExpNode(EqualsExpNode node, Environment localEnv) {
		return null;
	}

	public Boolean visitGreaterExpNode(GreaterExpNode node, Environment localEnv) {
		return null;
	}

	public Boolean visitGreaterOrEqualsExpNode(GreaterOrEqualsExpNode node, Environment localEnv) {
		return null;
	}

	public Boolean visitLesserExpNode(LesserExpNode node, Environment localEnv) {
		return null;
	}

	public Boolean visitLesserOrEqualsExpNode(LesserOrEqualsExpNode node, Environment localEnv) {
		return null;
	}

}
