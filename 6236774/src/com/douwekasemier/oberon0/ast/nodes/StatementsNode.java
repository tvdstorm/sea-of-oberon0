package com.douwekasemier.oberon0.ast.nodes;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public class StatementsNode extends AbstractNode implements Node {

    private ArrayList<Node> statements;

    public StatementsNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        assert (type == Oberon0Parser.STATEMENTS);

        statements = new ArrayList<Node>();

        // Loop statements
        for (int i = 0; i < node.getChildCount(); i++) {
            Tree childNode = node.getChild(i);
            switch (childNode.getType()) {
                case Oberon0Parser.ASSIGN:
                    statements.add(new AssignmentNode(childNode, this));
                    break;
                case Oberon0Parser.CALL:
                    statements.add(new ProcedureCallNode(childNode, this));
                    break;
                case Oberon0Parser.WHILE:
                    statements.add(new WhileNode(childNode, this));
                    break;
                case Oberon0Parser.IFSTATEMENT:
                    statements.add(new IfStatementNode(childNode, this));
                    break;
                default:
                    throw new ASTGenerationException();
            }
        }
    }

}
