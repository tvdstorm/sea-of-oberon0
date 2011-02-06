package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.*;

public class SelectorRecordNode extends SelectorNode implements Node {

    private String identifier;
    private String record;

    public SelectorRecordNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        identifier = node.getChild(0).getText();
        record = node.getChild(1).getText();
    }

}
