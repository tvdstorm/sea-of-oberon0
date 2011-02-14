package com.douwekasemier.oberon0.ast.selectors;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Bindable;
import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.ast.ExpressionBuilder;
import com.douwekasemier.oberon0.ast.Selectable;
import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Array;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Int;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class ArraySelector extends AST implements Selectable {

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

    public Value evaluate(Environment environment) throws RuntimeException {
        throw new RuntimeException();
    }
    
    @Override
    public Reference select(Environment environment, Value from) throws RuntimeException {
        Int locationValue = (Int) expression.evaluate(environment);
        int location = locationValue.getValue().intValue();

        Array array = (Array) from;
        return array.getReference(location);
    }
}
