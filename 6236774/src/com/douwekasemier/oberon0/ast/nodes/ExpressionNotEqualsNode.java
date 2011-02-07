package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.BinaryExpressionNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.interpreter.Oberon0RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Bool;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Int;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class ExpressionNotEqualsNode extends BinaryExpressionNode implements Node {

    public ExpressionNotEqualsNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Value evaluate(Environment environment) throws Oberon0RuntimeException {
        boolean result;

        Int leftResult = (Int) left.evaluate(environment);
        Int rightResult = (Int) right.evaluate(environment);
        if (leftResult.getValue().compareTo(rightResult.getValue()) != 0) {
            result = true;
        } else {
            result = false;
        }

        return new Bool(new Boolean(result));
    }

}
