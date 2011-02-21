package com.douwekasemier.oberon0.ast.expression;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.interpreter.environment.Bool;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class And extends BinaryExpression {

    public And(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.AND);
    }

    @Override
    public Value evaluate(Environment environment) {
        Bool leftResult = (Bool) left.evaluate(environment);
        Bool rightResult = (Bool) right.evaluate(environment);
        if (leftResult.getValue() && rightResult.getValue()) {
            return new Bool(true);
        }
        return new Bool(false);
    }
}
