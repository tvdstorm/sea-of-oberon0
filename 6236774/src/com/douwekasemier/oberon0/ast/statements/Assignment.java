package com.douwekasemier.oberon0.ast.statements;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.ast.Interpretable;
import com.douwekasemier.oberon0.ast.builders.ExpressionBuilder;
import com.douwekasemier.oberon0.ast.expression.Identifier;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.NotSelectableExpression;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class Assignment extends AST implements Interpretable {

    private Identifier identAndSelectors;
    private Evaluatable expression;

    // Generate AST from rewrite -> ^(ASSIGN expression identifier ^(SELECTORS selector)?)
    public Assignment(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.ASSIGN);

        // Expression
        expression = ExpressionBuilder.build(antlrTree.getChild(0));

        // Identifier
        identAndSelectors = new Identifier(antlrTree.getChild(1));
    }

    @Override
    public void interpret(Environment environment) {
        Value value = expression.evaluate(environment);
        Reference reference;
        try {
            reference = identAndSelectors.select(environment, null);
        } catch (NotSelectableExpression e) {
            e.printStackTrace();
            throw new Oberon0Exception();
        }
        reference.setValue(value);
    }
}
