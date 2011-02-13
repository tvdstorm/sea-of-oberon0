package com.douwekasemier.oberon0.ast.declaration;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Declarable;
import com.douwekasemier.oberon0.ast.Initializable;
import com.douwekasemier.oberon0.ast.TypeBuilder;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class VariableDeclaration extends AST implements Declarable {

    private Initializable vartype;
    private ArrayList<String> identifiers;

    public VariableDeclaration() {
        vartype = null;
        identifiers = new ArrayList<String>();
    }

    public VariableDeclaration(Initializable vartype, ArrayList<String> identifiers) {
        this.vartype = vartype;
        this.identifiers = identifiers;
    }

    public VariableDeclaration(Tree antlrTree) {
        this();
        antlrType = antlrTree.getType();
        antlrText = antlrTree.getText();

        // Assert that this is the node we expected, if it isn't the calling constructor is bugged!
        assert (antlrType == Oberon0Parser.VAR);

        identifiers = new ArrayList<String>();

        vartype = TypeBuilder.build(antlrTree.getChild(0));
        
        // Identifiers
        for (int i = 1; i < antlrTree.getChildCount(); i++) {
            Tree antlrIdentifierTree = antlrTree.getChild(i);
            assert (antlrIdentifierTree.getType() == Oberon0Parser.IDENTIFIER);
            identifiers.add(antlrIdentifierTree.getText());
        }
    }

    @Override
    public void declare(Environment environment) throws RuntimeException {
        for (String identifier : identifiers) {
            environment.declareVariable(identifier, vartype.initialize(environment));
        }
    }
}
