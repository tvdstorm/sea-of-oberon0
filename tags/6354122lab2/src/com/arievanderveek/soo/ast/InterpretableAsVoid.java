package com.arievanderveek.soo.ast;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.runtime.Scope;

/**
 * Interface indicating a class is interpretable with no return value.
 * 
 * @author Arie van der Veek
 *
 */
public interface InterpretableAsVoid {

	/**
	 * Interprets the class with no return value
	 * 
	 * @param scope the scope
	 * @throws SeaOfOberonException
	 */
	public void interpret(Scope scope) throws SeaOfOberonException;

}
