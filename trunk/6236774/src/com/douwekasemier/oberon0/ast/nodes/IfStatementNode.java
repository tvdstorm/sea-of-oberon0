package com.douwekasemier.oberon0.ast.nodes;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public class IfStatementNode extends AbstractNode implements Node {

    private Node ifpart, elsepart;
    private ArrayList<Node> elsifparts;

    public IfStatementNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        assert (node.getType() == Oberon0Parser.IFSTATEMENT);

        elsifparts = new ArrayList<Node>();

        for (int i = 0; i < node.getChildCount(); i++) {
            Tree childNode = node.getChild(i);
            switch (childNode.getType()) {
                case Oberon0Parser.IF:
                    ifpart = new IfStatementIfPartNode(childNode, this);
                    break;
                case Oberon0Parser.ELSIF:
                    elsifparts.add(new IfStatementElsifPartNode(childNode, this));
                    break;
                case Oberon0Parser.ELSE:
                    elsepart = new IfStatementElsePartNode(childNode, this);
                    break;
            }
        }
    }

}
