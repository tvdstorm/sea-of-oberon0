package com.douwekasemier.oberon0.ast;

import org.antlr.runtime.tree.Tree;

public abstract class BinaryExpressionNode extends ExpressionNode {

    protected Node left;
    protected Node right;

    public BinaryExpressionNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        left = generateExpressionNode(node.getChild(0));
        if (node.getChildCount() == 2) {
            right = generateExpressionNode(node.getChild(1));
        }
    }

}
