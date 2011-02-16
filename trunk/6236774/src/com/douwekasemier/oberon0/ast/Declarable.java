package com.douwekasemier.oberon0.ast;

import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public interface Declarable {
    public void declare(Environment environment) throws Oberon0Exception;
}
