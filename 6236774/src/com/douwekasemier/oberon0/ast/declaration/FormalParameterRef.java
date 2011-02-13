package com.douwekasemier.oberon0.ast.declaration;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.Initializable;
import com.douwekasemier.oberon0.ast.TypeBuilder;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public class FormalParameterRef extends FormalParameter {

    public FormalParameterRef() {
        super();
        reference = true;
    }

    public FormalParameterRef(Initializable vartype, ArrayList<String> identifiers) {
        super(true, vartype, identifiers);
    }

    public FormalParameterRef(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.FORMALPARAMETER);
        
        reference = true;
        
        vartype = TypeBuilder.build(antlrTree.getChild(1));

        // Identifiers
        for (int i = 2; i < antlrTree.getChildCount(); i++) {
            identifiers.add(antlrTree.getChild(i).getText());
        }
    }
}
