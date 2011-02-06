package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.*;

public class SelectorIdentifierNode extends SelectorNode implements Node {

    private String identifier;
    public SelectorIdentifierNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);
        identifier = node.getText();        
    }

}
