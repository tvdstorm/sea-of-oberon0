package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.BinaryExpressionNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.interpreter.Oberon0RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Bool;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Value;

//Dit is niet binary.. 
public class ExpressionNotNode extends BinaryExpressionNode implements Node {

    public ExpressionNotNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Value evaluate(Environment environment) throws Oberon0RuntimeException {
        boolean result;

        Bool leftResult = (Bool) left.evaluate(environment);
        result = !leftResult.getValue().booleanValue();
        
        return new Bool(new Boolean(result));
    }

}
