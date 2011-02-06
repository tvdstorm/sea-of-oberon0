package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public class IfStatementElsifPartNode extends AbstractNode implements Node {

    private Node expression;
    private Node statements;

    public IfStatementElsifPartNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        assert (type == Oberon0Parser.ELSIF);

        Tree expressionNode = node.getChild(0);
        expression = new RootExpressionNode(expressionNode, this);

        Tree statementsNode = node.getChild(1);
        statements = new StatementsNode(statementsNode, this);

    }

}
