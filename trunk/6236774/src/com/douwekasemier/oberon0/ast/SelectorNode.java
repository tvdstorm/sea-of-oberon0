package com.douwekasemier.oberon0.ast;

import org.antlr.runtime.tree.Tree;

public abstract class SelectorNode extends AbstractNode {

    protected String identifier;

    public SelectorNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);
    }

    public String getIdentifier() {
        return identifier;
    }

}
