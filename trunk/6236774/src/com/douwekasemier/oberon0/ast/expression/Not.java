package com.douwekasemier.oberon0.ast.expression;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Bool;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class Not extends UnaryExpression {

    public Not(Tree antlrTree) {
        super(antlrTree);
    }

    @Override
    public Value evaluate(Environment environment) throws RuntimeException {
        Bool leftResult = (Bool) expression.evaluate(environment);
        
        boolean result = !leftResult.getValue().booleanValue();
        return new Bool(new Boolean(result));
    }

}
