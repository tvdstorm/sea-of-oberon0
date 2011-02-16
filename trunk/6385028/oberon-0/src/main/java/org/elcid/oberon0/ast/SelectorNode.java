package org.elcid.oberon0.ast;

import org.elcid.oberon0.env.Environment;

/**
 *
 * @author Pieter Brandwijk
 */
public abstract class SelectorNode extends Node {

	public abstract Object select(Environment env);

}
