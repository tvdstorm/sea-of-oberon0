package com.douwekasemier.oberon0.ast;

import com.douwekasemier.oberon0.exceptions.NotSelectableExpression;
import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public interface Evaluatable {
    public Value evaluate(Environment environment) throws RuntimeException;

    public Reference select(Environment environment, Value from) throws RuntimeException, NotSelectableExpression;

    
}
