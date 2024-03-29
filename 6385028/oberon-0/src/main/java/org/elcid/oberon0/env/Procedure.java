package org.elcid.oberon0.env;

import java.util.List;

/**
 *
 * @author Pieter Brandwijk
 */
public abstract class Procedure {

	public abstract List<FormalParameter> getFormalParams();

	public abstract void execute(Environment env);
	
}
