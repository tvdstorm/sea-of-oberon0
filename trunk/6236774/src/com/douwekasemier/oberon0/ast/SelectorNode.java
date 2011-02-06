package com.douwekasemier.oberon0.ast;

import org.antlr.runtime.tree.Tree;

public abstract class SelectorNode extends AbstractNode {

    private Node left;
    private Node right;

    public SelectorNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);
    }

}
