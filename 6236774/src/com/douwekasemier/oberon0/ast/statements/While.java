package com.douwekasemier.oberon0.ast.statements;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.ast.Interpretable;
import com.douwekasemier.oberon0.ast.builders.ExpressionBuilder;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Bool;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class While extends AST implements Interpretable {

    private Evaluatable expression;
    private Statements statements;

    public While(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.WHILE);

        expression = ExpressionBuilder.build(antlrTree.getChild(0));

        statements = new Statements(antlrTree.getChild(1));
    }

    @Override
    public void interpret(Environment environment) throws Oberon0Exception {
        Bool value = (Bool) expression.evaluate(environment);
        if (value.getValue().booleanValue()) {
            statements.interpret(environment);
            interpret(environment);
        }
    }

}
