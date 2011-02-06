package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public class VartypeArrayNode extends AbstractNode implements Node {

    private Node vartype;
    private Node expression;
    
    public VartypeArrayNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);
        
        assert (type == Oberon0Parser.ARRAY);

        Tree typeNode = node.getChild(0);
        vartype = new VartypeIdentifierNode(typeNode, this);

        Tree expressionNode = node.getChild(1);
        expression = new RootExpressionNode(expressionNode, this);
    }

}
