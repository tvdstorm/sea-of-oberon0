package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.ExpressionNode;
import com.douwekasemier.oberon0.ast.Node;

public class ExpressionLTNode extends ExpressionNode implements Node {

    public ExpressionLTNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);
        // TODO Auto-generated constructor stub
    }

}
