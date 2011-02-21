package com.douwekasemier.oberon0.ast.expression;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.interpreter.environment.Bool;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Int;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class LT extends BinaryExpression {

    public LT(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.LT);
    }

    @Override
    public Value evaluate(Environment environment) {
        Int leftResult = (Int) left.evaluate(environment);
        Int rightResult = (Int) right.evaluate(environment);
        return new Bool(leftResult.getValue() < rightResult.getValue());
    }
}
