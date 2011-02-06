package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.*;
import com.douwekasemier.oberon0.ast.Node;

public class RootExpressionNode extends AbstractNode implements Node {

    private Node expression;

    public RootExpressionNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);
        expression = generateExpressionNode(node);
    }

}
