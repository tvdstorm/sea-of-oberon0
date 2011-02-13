package com.douwekasemier.oberon0.ast;

import org.antlr.runtime.tree.Tree;

public final class ASTNullLogger implements ASTLogger {
    
    @Override
    public void log(Tree antlrTree) {}

    @Override
    public void log(String str) {}

    @Override
    public void log(AST ast) {}
    
}
