package com.douwekasemier.oberon0.ast.expression;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.ast.builders.ExpressionBuilder;
import com.douwekasemier.oberon0.exceptions.NotSelectableExpression;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Reference;

public abstract class UnaryExpression extends AST implements Evaluatable {

    protected Evaluatable expression;

    public UnaryExpression(Tree antlrTree) {
        super(antlrTree);
        expression = ExpressionBuilder.build(antlrTree.getChild(0));
    }
    
    @Override
    public Reference select(Environment environment, Reference from) {
        throw new NotSelectableExpression();
    }
}
