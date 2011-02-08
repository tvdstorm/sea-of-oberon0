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

	public Value eval(IntExpNode node, Environment localEnv) {
		return null;
	}

	public Value eval(PlusExpNode node, Environment localEnv) {
		return null;
	}

	public Value eval(MinusExpNode node, Environment localEnv) {
		return null;
	}

	public Value eval(MultiplyExpNode node, Environment localEnv) {
		return null;
	}

	public Value eval(DivideExpNode node, Environment localEnv) {
		return null;
	}

	public Value eval(ModuloExpNode node, Environment localEnv) {
		return null;
	}

	public Value eval(EqualsExpNode node, Environment localEnv) {
		return null;
	}

	public Value eval(NotEqualsExpNode node, Environment localEnv) {
		return null;
	}

	public Value eval(GreaterExpNode node, Environment localEnv) {
		return null;
	}

	public Value eval(GreaterOrEqualsExpNode node, Environment localEnv) {
		return null;
	}

	public Value eval(LesserExpNode node, Environment localEnv) {
		return null;
	}

	public Value eval(LesserOrEqualsExpNode node, Environment localEnv) {
		return null;
	}

	public Value eval(AndExpNode node, Environment localEnv) {
		return null;
	}

	public Value eval(OrExpNode node, Environment localEnv) {
		return null;
	}

	public Value eval(IdentSelectorNode node, Environment localEnv) {
		return null;
	}

	public Value eval(NotExpNode node, Environment localEnv) {
		return null;
	}

	public Value eval(NegativeExpNode node, Environment localEnv) {
		return null;
	}

	public void run(AssignmentNode node, Environment localEnv) { 
		
	}

}