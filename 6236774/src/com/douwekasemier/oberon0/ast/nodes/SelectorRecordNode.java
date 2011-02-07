package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.ast.SelectorNode;

public class SelectorRecordNode extends SelectorNode implements Node {

    private String record;

    public SelectorRecordNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        identifier = node.getChild(0).getText();
        record = node.getChild(1).getText();
    }
}
