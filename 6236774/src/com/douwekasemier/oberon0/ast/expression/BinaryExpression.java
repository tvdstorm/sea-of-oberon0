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

public abstract class BinaryExpression extends AST implements Evaluatable {

    protected Evaluatable left;
    protected Evaluatable right;

    public BinaryExpression() {
        left = null;
        right = null;
    }

    public BinaryExpression(Evaluatable left, Evaluatable right) {
        this.left = left;
        this.right = right;
    }

    public BinaryExpression(Tree antlrTree) {
        left = ExpressionBuilder.build(antlrTree.getChild(0));
        right = ExpressionBuilder.build(antlrTree.getChild(1));
    }
    
    @Override
    public Reference select(Environment environment, Value from) throws Oberon0Exception, NotSelectableExpression {
        throw new NotSelectableExpression();
    }
}
