package com.douwekasemier.oberon0.ast.expression;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Bool;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Int;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class LT extends BinaryExpression {

    public LT(Tree antlrTree) {
        super(antlrTree);
    }

    @Override
    public Value evaluate(Environment environment) throws RuntimeException {
        boolean result;

        Int leftResult = (Int) left.evaluate(environment);
        Int rightResult = (Int) right.evaluate(environment);
        if (leftResult.getValue().compareTo(rightResult.getValue()) < 0) {
            result = true;
        } else {
            result = false;
        }

        return new Bool(new Boolean(result));
    }

}
