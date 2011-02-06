package com.douwekasemier.oberon0.ast.nodes;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public class ProcedureCallNode extends AbstractNode implements Node {

    private String identifier;
    private ArrayList<Node> formalparameters;

    public ProcedureCallNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        // Assert that this is the node we expected, if it isn't the calling constructor is bugged!
        assert (type == Oberon0Parser.CALL);
        
        formalparameters = new ArrayList<Node>();

        Tree identifierNode = node.getChild(0);
        assert (identifierNode.getType() == Oberon0Parser.IDENTIFIER);
        identifier = identifierNode.getText();

        // Parameters
        for (int i = 0; i < node.getChildCount(); i++) {
            Tree fpNode = node.getChild(i);
            formalparameters.add(new RootExpressionNode(fpNode, this));
        }
    }

}
