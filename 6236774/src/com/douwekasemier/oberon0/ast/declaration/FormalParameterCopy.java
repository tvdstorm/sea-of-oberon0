package com.douwekasemier.oberon0.ast.declaration;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.builders.TypeBuilder;
import com.douwekasemier.oberon0.ast.types.IdentifierType;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public class FormalParameterCopy extends FormalParameter {

    public FormalParameterCopy(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.FORMALPARAMETER);

        reference = false;

        vartype = TypeBuilder.build(antlrTree.getChild(0));

        // Identifiers
        Tree antlrIdentifiers = antlrTree.getChild(1);
        for (int i = 0; i < antlrIdentifiers.getChildCount(); i++) {
            assert (antlrIdentifiers.getChild(i).getType() == Oberon0Parser.IDENTIFIER);
            identifiers.add(antlrIdentifiers.getChild(i).getText());
        }
    }

    public FormalParameterCopy(IdentifierType formalparameterType, ArrayList<String> formalparameterIdentifiers) {
        super(formalparameterType, formalparameterIdentifiers);
    }
}
