package com.douwekasemier.oberon0.ast.builders;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.declaration.FormalParameter;
import com.douwekasemier.oberon0.ast.declaration.FormalParameterCopy;
import com.douwekasemier.oberon0.ast.declaration.FormalParameterRef;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public final class ParameterBuilder {

    public static final FormalParameter build(Tree antlrTree) {
        if (antlrTree.getChild(0).getType() == Oberon0Parser.VAR) {
            return new FormalParameterRef(antlrTree);
        }
        return new FormalParameterCopy(antlrTree);
    }
}
