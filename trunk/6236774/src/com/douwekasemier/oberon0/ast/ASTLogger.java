package com.douwekasemier.oberon0.ast;

import org.antlr.runtime.tree.Tree;

public interface ASTLogger {
    public void log(Tree antlrTree);
    public void log(String str);
    public void log(AST ast);
}
