package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public class AssignmentNode extends AbstractNode implements Node {

    private Node selector;
    private Node expression;

    public AssignmentNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        assert (type == Oberon0Parser.ASSIGN);

        // Selector
        Tree selectorNode = node.getChild(0);
        switch (selectorNode.getType()) {
            case Oberon0Parser.IDENTIFIER:
                selector = new SelectorIdentifierNode(node, this);
                break;
            case Oberon0Parser.ARRAYSELECTOR:
                selector = new SelectorArrayNode(node, this);
                break;
            case Oberon0Parser.RECORDSELECTOR:
                selector = new SelectorRecordNode(node, this);
                break;
            default:
                throw new ASTGenerationException();
        }

        Tree expressionNode = node.getChild(1);
        expression = new RootExpressionNode(expressionNode, this);
    }

}
