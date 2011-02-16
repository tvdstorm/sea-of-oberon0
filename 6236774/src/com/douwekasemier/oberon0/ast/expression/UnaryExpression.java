package com.douwekasemier.oberon0.ast.expression;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.ast.ExpressionBuilder;
import com.douwekasemier.oberon0.exceptions.NotSelectableExpression;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public abstract class UnaryExpression extends AST implements Evaluatable {

    protected Evaluatable expression;

    public UnaryExpression() {
        expression = null;
    }

    public UnaryExpression(Evaluatable expression) {
        this.expression = expression;
    }

    public UnaryExpression(Tree antlrTree) {
        expression = ExpressionBuilder.build(antlrTree.getChild(0));
    }
    
    @Override
    public Reference select(Environment environment, Value from) throws Oberon0Exception, NotSelectableExpression {
        throw new NotSelectableExpression();
    }
}
