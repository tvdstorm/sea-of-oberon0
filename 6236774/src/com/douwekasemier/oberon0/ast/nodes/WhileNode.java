package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.interpreter.Oberon0RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Bool;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class WhileNode extends AbstractNode implements Node {

    private Node expression;
    private Node statements;

    public WhileNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        assert (type == Oberon0Parser.WHILE);

        Tree expressionNode = node.getChild(0);
        expression = new RootExpressionNode(expressionNode, this);

        Tree statementsNode = node.getChild(1);
        statements = new StatementsNode(statementsNode, this);
    }

    @Override
    public void interpret(Environment environment) throws Oberon0RuntimeException {
        Bool value = (Bool) expression.evaluate(environment);
        if( value.getValue().booleanValue() ) {
            statements.interpret(environment);
        }
        interpret(environment);
        
    }

}
