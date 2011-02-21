package com.douwekasemier.oberon0.ast.declaration;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Declarable;
import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.ast.builders.ExpressionBuilder;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class ConstantDeclaration extends AST implements Declarable {

    private String identifier;
    private Evaluatable expression;

    public ConstantDeclaration(Tree antlrTree) {
        super(antlrTree);

        // Assert that this is the node we expected, if it isn't the calling constructor is bugged!
        assert (antlrTree.getType() == Oberon0Parser.CONST);

        assert (antlrTree.getChild(0).getType() == Oberon0Parser.IDENTIFIER);
        identifier = antlrTree.getChild(0).getText();

        expression = ExpressionBuilder.build(antlrTree.getChild(1));
    }

    @Override
    public void declare(Environment environment) throws Oberon0Exception {
        environment.declareConstant(identifier, expression.evaluate(environment));
    }

}
