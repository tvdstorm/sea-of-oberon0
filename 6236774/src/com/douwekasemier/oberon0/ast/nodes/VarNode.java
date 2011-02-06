package com.douwekasemier.oberon0.ast.nodes;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public class VarNode extends AbstractNode implements Node {

    private Node vartype;
    private ArrayList<String> identifiers;

    public VarNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        // Assert that this is the node we expected, if it isn't the calling constructor is bugged!
        assert (type == Oberon0Parser.VAR);
        
        identifiers = new ArrayList<String>();

        // Var type
        Tree typeNode = node.getChild(0);
        switch (typeNode.getType()) {
            case Oberon0Parser.IDENTIFIER:
                vartype = new VartypeIdentifierNode(typeNode, this);
                break;
            case Oberon0Parser.ARRAY:
                vartype = new VartypeArrayNode(typeNode, this);
                break;
            case Oberon0Parser.RECORD:
                vartype = new VartypeRecordNode(typeNode, this);
                break;
        }

        // Identifiers
        for (int i = 1; i < node.getChildCount(); i++) {
            identifiers.add(node.getChild(i).getText());
        }
    }
}
