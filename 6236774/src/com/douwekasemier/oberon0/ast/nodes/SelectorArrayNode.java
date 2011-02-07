package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.ast.SelectorNode;
import com.douwekasemier.oberon0.interpreter.Oberon0RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Array;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Int;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class SelectorArrayNode extends SelectorNode implements Node {

    private Node expression;

    public SelectorArrayNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        identifier = node.getChild(0).getText();

        Tree expressionNode = node.getChild(1);
        expression = new RootExpressionNode(expressionNode, this);
    }
    
    @Override
    public Value evaluate(Environment environment) throws Oberon0RuntimeException {
        //return environment.getReference(identifier).getValue();
        Array array = (Array) environment.getReference(identifier).getValue();
        Int i = (Int) expression.evaluate(environment);
        return array.getValue(i.getValue().intValue());
    }
}
