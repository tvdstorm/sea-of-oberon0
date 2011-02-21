package com.douwekasemier.oberon0.ast;

import org.antlr.runtime.tree.Tree;

public abstract class AST {

    protected int antlrType;
    protected String antlrText;

    public AST() {
        this(null);
    }

    public AST(Tree antlrTree) {
        if (antlrTree != null) {
            antlrType = antlrTree.getType();
            antlrText = antlrTree.getText();
        } else {
            antlrType = -1;
            antlrText = "User defined node";
        }
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " [type=" + antlrType + "] [text=" + antlrText + "]";
    }
}
