package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.ExpressionNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.interpreter.Oberon0RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class RootExpressionNode extends ExpressionNode implements Node {

    private Node expression;

    public RootExpressionNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);
        expression = generateExpressionNode(node);
    }

    @Override
    public Value evaluate(Environment environment) throws Oberon0RuntimeException {
        return expression.evaluate(environment);
    }
}
