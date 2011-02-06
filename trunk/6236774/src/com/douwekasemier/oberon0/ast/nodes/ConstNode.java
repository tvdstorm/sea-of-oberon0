package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public class ConstNode extends AbstractNode implements Node {

    private String identifier;
    private Node expression;

    public ConstNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        // Assert that this is the node we expected, if it isn't the calling constructor is bugged!
        assert (type == Oberon0Parser.CONST);

        Tree identifierNode = node.getChild(0);
        assert (identifierNode.getType() == Oberon0Parser.IDENTIFIER);
        identifier = identifierNode.getText();

        Tree expressionNode = node.getChild(1);
        expression = new RootExpressionNode(expressionNode, this);
    }

}
