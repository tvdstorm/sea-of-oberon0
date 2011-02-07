package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.BinaryExpressionNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.interpreter.Oberon0RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Bool;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class ExpressionAndNode extends BinaryExpressionNode implements Node {

    public ExpressionAndNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Value evaluate(Environment environment) throws Oberon0RuntimeException {
        boolean result;

        Bool leftResult = (Bool) left.evaluate(environment);
        Bool rightResult = (Bool) right.evaluate(environment);
        if ( leftResult.getValue().booleanValue() && rightResult.getValue().booleanValue() ) {
            result = true;
        }
        else {
            result = false;
        }
        
        return new Bool(new Boolean(result));
    }

}
