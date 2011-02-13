package com.douwekasemier.oberon0.ast.expression;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Bool;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class Or extends BinaryExpression {

    public Or(Tree antlrTree) {
        super(antlrTree);
    }

    @Override
    public Value evaluate(Environment environment) throws RuntimeException {
        boolean result;

        Bool leftResult = (Bool) left.evaluate(environment);
        Bool rightResult = (Bool) right.evaluate(environment);
        if (leftResult.getValue().booleanValue() || rightResult.getValue().booleanValue()) {
            result = true;
        } else {
            result = false;
        }

        return new Bool(new Boolean(result));
    }

}
