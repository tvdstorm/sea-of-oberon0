package com.douwekasemier.oberon0.ast;

import com.douwekasemier.oberon0.exceptions.NotSelectableExpression;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public interface Evaluatable {
    public Value evaluate(Environment environment) throws Oberon0Exception;

    public Reference select(Environment environment, Value from) throws Oberon0Exception, NotSelectableExpression;

    
}
