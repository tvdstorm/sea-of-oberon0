package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public class IfStatementElsePartNode extends AbstractNode implements Node {

    private Node statements;

    public IfStatementElsePartNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        assert (type == Oberon0Parser.ELSE);

        Tree statementsNode = node.getChild(0);
        statements = new StatementsNode(statementsNode, this);

    }

}
