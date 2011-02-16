package com.douwekasemier.oberon0.ast;

import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public interface Initializable {
    public Value initialize(Environment environment) throws Oberon0Exception;
}
