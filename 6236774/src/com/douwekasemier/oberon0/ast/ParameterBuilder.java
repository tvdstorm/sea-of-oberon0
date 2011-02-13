package com.douwekasemier.oberon0.ast;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.declaration.*;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public final class ParameterBuilder {

    public static final FormalParameter build(Tree antlrTree) {
        FormalParameter parameter;
        
        switch (antlrTree.getChild(0).getType()) {
            case Oberon0Parser.VAR:
                parameter = new FormalParameterRef(antlrTree);
                break;                
            default:
                parameter = new FormalParameterCopy(antlrTree);
                break;
        }

        return parameter;
    } 
}
