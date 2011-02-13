package com.douwekasemier.oberon0.ast;

import org.antlr.runtime.tree.Tree;

public final class ASTSystemOutLogger implements ASTLogger {

    @Override
    public void log(AST ast) {
        System.out.println(ast.toString());
    }
    
    @Override
    public void log(Tree antlrTree) {
        System.out.println(antlrTree.getText() + " <"+antlrTree.getType()+">");
    }

    @Override
    public void log(String str) {
        System.out.println(str);
    }    
}
