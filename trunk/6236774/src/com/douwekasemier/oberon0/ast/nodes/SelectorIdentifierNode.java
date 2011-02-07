package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.ast.SelectorNode;
import com.douwekasemier.oberon0.interpreter.Oberon0RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class SelectorIdentifierNode extends SelectorNode implements Node {

    public SelectorIdentifierNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);
        identifier = node.getText();
    }
    
    @Override
    public Value evaluate(Environment environment) throws Oberon0RuntimeException {
        return environment.getReference(identifier).getValue();
    }
}
