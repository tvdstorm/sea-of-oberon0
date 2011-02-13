package com.douwekasemier.oberon0.ast;

import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public interface Declarable {
    public void declare(Environment environment) throws RuntimeException;
}
