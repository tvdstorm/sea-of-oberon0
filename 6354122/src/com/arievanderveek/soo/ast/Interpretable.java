package com.arievanderveek.soo.ast;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.runtime.Scope;

/**
 * Interface indicating a class is interpretable to an integer.
 * 
 * @author Arie van der Veek
 *
 */
public interface Interpretable {

	/**
	 * Interprets the class and returns the interpretation as integer value
	 * 
	 * @param scope the scope
	 * @return The interpreted value
	 * @throws SeaOfOberonException
	 */
	public Integer interpret(Scope scope) throws SeaOfOberonException;

}
