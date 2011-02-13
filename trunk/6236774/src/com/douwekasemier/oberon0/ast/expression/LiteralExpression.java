package com.douwekasemier.oberon0.ast.expression;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.exceptions.NotSelectableExpression;
import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public abstract class LiteralExpression extends AST implements Evaluatable {

    public LiteralExpression() {}
    
    public LiteralExpression(Tree antlrTree) {
        antlrType = antlrTree.getType();
        antlrText = antlrTree.getText();
    }
    
    @Override
    public Reference select(Environment environment, Value from) throws RuntimeException, NotSelectableExpression {
        throw new NotSelectableExpression();
    }

}
