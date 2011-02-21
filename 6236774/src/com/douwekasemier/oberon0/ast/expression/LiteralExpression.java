package com.douwekasemier.oberon0.ast.expression;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.exceptions.NotSelectableExpression;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Reference;

public abstract class LiteralExpression extends AST implements Evaluatable {

    public LiteralExpression(Tree antlrTree) {
        super(antlrTree);
    }

    @Override
    public Reference select(Environment environment, Reference from) {
        throw new NotSelectableExpression();
    }

}
