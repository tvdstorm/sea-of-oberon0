package com.douwekasemier.oberon0.ast.declaration;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.statements.Statements;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class Module extends AST {

    @SuppressWarnings("unused")
    private String identifier;
    private Declarations declarations;
    private Statements statements;

    public Module(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.MODULE);

        assert (antlrTree.getChild(0).getType() == Oberon0Parser.IDENTIFIER);
        identifier = antlrTree.getChild(0).getText();

        declarations = new Declarations(antlrTree.getChild(1));

        statements = new Statements(antlrTree.getChild(2));
    }

    public void run(Environment environment) throws Oberon0Exception {
        declarations.declare(environment);
        statements.interpret(environment);
    }
}