package com.douwekasemier.oberon0.ast.declaration;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.Initializable;
import com.douwekasemier.oberon0.ast.TypeBuilder;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public class FormalParameterCopy extends FormalParameter {

    public FormalParameterCopy() {
        super();
        reference = false;
    }

    public FormalParameterCopy(Initializable vartype, ArrayList<String> identifiers) {
        super(false, vartype, identifiers);
    }
    
    public FormalParameterCopy(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.FORMALPARAMETER);
        reference = false;
        
        vartype = TypeBuilder.build(antlrTree.getChild(0));

        // Identifiers
        for (int i = 1; i < antlrTree.getChildCount(); i++) {
            identifiers.add(antlrTree.getChild(i).getText());
        }
    }
}
