package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.*;

public class SelectorArrayNode extends SelectorNode implements Node {

    private String identifier;
    private Node expression;

    public SelectorArrayNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);
        
        identifier = node.getChild(0).getText();

        Tree expressionNode = node.getChild(1);
        expression = new RootExpressionNode(expressionNode, this);
        
    }

}
