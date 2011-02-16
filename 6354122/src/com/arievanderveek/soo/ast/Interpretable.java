package com.arievanderveek.soo.ast;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.runtime.Scope;

public interface Interpretable {

	public Integer interpret(Scope scope) throws SeaOfOberonException;

}
