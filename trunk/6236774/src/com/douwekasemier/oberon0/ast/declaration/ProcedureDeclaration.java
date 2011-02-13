package com.douwekasemier.oberon0.ast.declaration;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Declarable;
import com.douwekasemier.oberon0.ast.Invokable;
import com.douwekasemier.oberon0.ast.ParameterBuilder;
import com.douwekasemier.oberon0.ast.statements.Statements;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Procedure;

public class ProcedureDeclaration extends AST implements Declarable, Invokable {

    protected String identifier;
    protected ArrayList<FormalParameter> formalparameters;
    private Declarations declarations;
    private Statements statements;

    public ProcedureDeclaration() {
        this.identifier = null;
        this.formalparameters = new ArrayList<FormalParameter>();
        this.declarations = null;
        this.statements = null;
    }

    public ProcedureDeclaration(String identifier, ArrayList<FormalParameter> formalparameters, Declarations declarations, Statements statements) {
        this.identifier = identifier;
        this.formalparameters = formalparameters;
        this.declarations = declarations;
        this.statements = statements;
    }

    public ProcedureDeclaration(Tree node) {
        this();
        antlrType = node.getType();
        antlrText = node.getText();

        assert (antlrType == Oberon0Parser.PROCEDURE);

        // Procedure identifier
        identifier = node.getChild(0).getText();

        // (Optional) formal parameters, declarations & statements
        for (int i = 1; i < node.getChildCount(); i++) {
            Tree childNode = node.getChild(i);
            switch (childNode.getType()) {
                case Oberon0Parser.FORMALPARAMETER:
                    formalparameters.add(ParameterBuilder.build(childNode));
                    break;
                case Oberon0Parser.DECLARATIONS:
                    declarations = new Declarations(childNode);
                    break;
                case Oberon0Parser.STATEMENTS:
                    statements = new Statements(childNode);
                    break;
            }
        }
        System.out.println();
    }

    public Declarations getDeclarations() {
        return declarations;
    }

    public ArrayList<FormalParameter> getFormalParameters() {
        return formalparameters;
    }

    @Override
    public void declare(Environment environment) throws RuntimeException {
        Environment localEnvironment = environment.newEnvironment();
        environment.declareProcedure(identifier, new Procedure(this, localEnvironment));
    }

    @Override
    public void invoke(Environment environment) throws RuntimeException {
        if (statements != null) {
            statements.interpret(environment);
        }
    }

}
