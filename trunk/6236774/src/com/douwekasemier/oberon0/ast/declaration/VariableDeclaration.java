package com.douwekasemier.oberon0.ast.declaration;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Declarable;
import com.douwekasemier.oberon0.ast.Initializable;
import com.douwekasemier.oberon0.ast.builders.TypeBuilder;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class VariableDeclaration extends AST implements Declarable {

    private Initializable vartype;
    private ArrayList<String> identifiers;

    public VariableDeclaration(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.VAR);

        vartype = TypeBuilder.build(antlrTree.getChild(0));

        // Identifiers
        Tree antlrIdentifiers = antlrTree.getChild(1);
        assert(antlrIdentifiers.getType() == Oberon0Parser.IDENTIFIERS);
        identifiers = new ArrayList<String>();
        for (int i = 0; i < antlrIdentifiers.getChildCount(); i++) {
            assert (antlrIdentifiers.getChild(i).getType() == Oberon0Parser.IDENTIFIER);
            identifiers.add(antlrIdentifiers.getChild(i).getText());
        }
    }

    @Override
    public void declare(Environment environment) throws Oberon0Exception {
        for (String identifier : identifiers) {
            Value var = vartype.initialize(environment);
            environment.declareVariable(identifier, var);
        }
    }
}
