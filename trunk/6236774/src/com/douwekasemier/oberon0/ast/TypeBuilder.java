package com.douwekasemier.oberon0.ast;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.types.*;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public final class TypeBuilder {

    public static final Initializable build(Tree antlrTree) {
        Initializable type;

        switch (antlrTree.getType()) {
            case Oberon0Parser.IDENTIFIER:
                type = new IdentifierType(antlrTree); 
                break;                
            case Oberon0Parser.ARRAY:
                type = new ArrayType(antlrTree);
                break;
            case Oberon0Parser.RECORD:
                type = new RecordType(antlrTree);
                break;
            default:
                type = null;
        }

        return type;
    } 
}
