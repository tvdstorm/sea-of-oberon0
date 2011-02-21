package com.douwekasemier.oberon0.ast.declaration;

import java.util.Collections;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Declarable;
import com.douwekasemier.oberon0.ast.Invokable;
import com.douwekasemier.oberon0.ast.statements.Statements;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Procedure;

public class ProcedureDeclaration extends AST implements Declarable, Invokable {

    protected String identifier;
    protected FormalParameters formalparameters;
    private Declarations declarations;
    private Statements statements;

    public ProcedureDeclaration() {
        super(null);
        formalparameters = new FormalParameters(Collections.<FormalParameter> emptyList());
        declarations = null;
        statements = null;
    }

    public ProcedureDeclaration(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.PROCEDURE);

        // Procedure identifier
        assert (antlrTree.getChild(0).getType() == Oberon0Parser.IDENTIFIER);
        identifier = antlrTree.getChild(0).getText();

        formalparameters = new FormalParameters(antlrTree.getChild(1));
        declarations = new Declarations(antlrTree.getChild(2));
        statements = new Statements(antlrTree.getChild(3));
    }

    public Declarations getDeclarations() {
        return declarations;
    }

    public Iterable<FormalParameter> getFormalParameters() {
        return formalparameters;
    }

    @Override
    public void declare(Environment environment) throws Oberon0Exception {
        Environment localEnvironment = environment.newEnvironment("Procedure declaration <" + identifier + ">");
        environment.declareProcedure(identifier, new Procedure(this, localEnvironment));
    }

    @Override
    public void invoke(Environment environment) throws Oberon0Exception {
        if (statements != null) {
            statements.interpret(environment);
        }
    }

}
