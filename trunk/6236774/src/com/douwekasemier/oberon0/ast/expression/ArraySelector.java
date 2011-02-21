package com.douwekasemier.oberon0.ast.expression;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.ast.builders.ExpressionBuilder;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.NotSelectableExpression;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Array;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Int;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class ArraySelector extends AST implements Evaluatable {

    private Evaluatable expression;

    public ArraySelector(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.ARRAYSELECTOR);

        expression = ExpressionBuilder.build(antlrTree.getChild(0));
    }

    @Override
    public Value evaluate(Environment environment) {
        try {
            return select(environment, null).getValue();
        } catch (NotSelectableExpression e) {
            e.printStackTrace();
            throw new Oberon0Exception();
        }
    }

    @Override
    public Reference select(Environment environment, Reference from) {
        int location = ((Int) expression.evaluate(environment)).getValue();
        Array array = ((Array) from.getValue());
        return array.getReference(location);
    }
}
