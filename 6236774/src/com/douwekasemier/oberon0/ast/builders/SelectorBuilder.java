package com.douwekasemier.oberon0.ast.builders;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.ast.expression.ArraySelector;
import com.douwekasemier.oberon0.ast.expression.RecordSelector;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public final class SelectorBuilder {

    public static final Evaluatable build(Tree antlrTree) {
        switch (antlrTree.getType()) {
            case Oberon0Parser.ARRAYSELECTOR:
                return new ArraySelector(antlrTree);
            case Oberon0Parser.RECORDSELECTOR:
                return new RecordSelector(antlrTree);
            default:
                throw new AssertionError("Incorrect node in Selectors");
        }
    } 
}
