package com.douwekasemier.oberon0.ast.declaration;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Declarable;
import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.ast.ExpressionBuilder;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class ConstantDeclaration extends AST implements Declarable {

    private String identifier;
    private Evaluatable expression;

    public ConstantDeclaration() {
        identifier = null;
        expression = null;
    }
    
    public ConstantDeclaration(String identfier, Evaluatable expression) {
        
    }
    
    public ConstantDeclaration(Tree antlrTree) {
        antlrType = antlrTree.getType();
        antlrText = antlrTree.getText();
        
        // Assert that this is the node we expected, if it isn't the calling constructor is bugged!
        assert (antlrTree.getType() == Oberon0Parser.CONST);

        Tree identifierTree = antlrTree.getChild(0);
        assert (identifierTree.getType() == Oberon0Parser.IDENTIFIER);
        identifier = identifierTree.getText();

        Tree expressionTree = antlrTree.getChild(1);
        expression = ExpressionBuilder.build(expressionTree);
    }

    @Override
    public void declare(Environment environment) throws RuntimeException {
        environment.declareConstant(identifier, expression.evaluate(environment));
    }

}
