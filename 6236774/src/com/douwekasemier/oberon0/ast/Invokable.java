package com.douwekasemier.oberon0.ast;

import com.douwekasemier.oberon0.interpreter.environment.Environment;

public interface Invokable {
    public void invoke(Environment environment);
}
