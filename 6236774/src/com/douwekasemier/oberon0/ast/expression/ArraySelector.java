package com.douwekasemier.oberon0.ast.expression;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.ast.ExpressionBuilder;
import com.douwekasemier.oberon0.exceptions.NotSelectableExpression;
import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Array;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Int;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class ArraySelector extends AST implements Evaluatable {

    private Evaluatable expression;

    public ArraySelector() {
        expression = null;
    }

    public ArraySelector(Evaluatable expression) {
        this.expression = expression;
    }

    public ArraySelector(Tree antlrTree) {
        antlrType = antlrTree.getType();
        antlrText = antlrTree.getText();
        expression = ExpressionBuilder.build(antlrTree.getChild(0));
    }

    @Override
    public Value evaluate(Environment environment) throws RuntimeException {
        try {
            return select(environment, null).getValue();
        } catch (NotSelectableExpression e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    // i := a[0][2];
    // eerste selector = arrayselector '0'
    // value is een Array value
    // haal referentie naar het veld '0' uit Array.getReference()

    @Override
    public Reference select(Environment environment, Value from) throws RuntimeException, NotSelectableExpression {
        Int locationValue = (Int) expression.evaluate(environment);
        int location = locationValue.getValue().intValue();

        // From moet een array zijn
        Array array = (Array) from;
        return array.getReference(location);
    }
}
