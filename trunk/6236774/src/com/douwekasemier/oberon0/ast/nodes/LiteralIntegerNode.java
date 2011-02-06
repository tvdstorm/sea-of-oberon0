package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;

public class LiteralIntegerNode extends AbstractNode implements Node {

    private Integer value;
    
    public LiteralIntegerNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);
        
        value = Integer.parseInt(node.getText());
        
        
    }
}
