package com.douwekasemier.oberon0.ast.builders;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.Initializable;
import com.douwekasemier.oberon0.ast.types.*;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public final class TypeBuilder {

    public static final Initializable build(Tree antlrTree) {
        switch (antlrTree.getType()) {
            case Oberon0Parser.IDENTIFIER:
                return new SimpleType(antlrTree); 
            case Oberon0Parser.ARRAY:
                return new ArrayType(antlrTree);
            case Oberon0Parser.RECORD:
                return new RecordType(antlrTree);
            default:
                throw new AssertionError("Incorrect node in Type");
        }
    } 
}
