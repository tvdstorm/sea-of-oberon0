package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.*;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.interpreter.Oberon0RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class ModuleNode extends AbstractNode {

    private Node declarations, statements;

    public ModuleNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        // Assert that this is the node we expected, if it isn't the calling constructor is bugged!
        assert (type == Oberon0Parser.MODULE);
        declarations = null;
        statements = null;

        for (int i = 0; i < node.getChildCount(); i++) {
            Tree childNode = node.getChild(i);
            switch (childNode.getType()) {
                case Oberon0Parser.DECLARATIONS:
                    declarations = new DeclarationsNode(childNode, this);
                    break;
                case Oberon0Parser.STATEMENTS:
                    statements = new StatementsNode(childNode, this);
                    break;
                default:
                    throw new ASTGenerationException();
            }
        }
    }

    @Override
    public void interpret(Environment environment) throws Oberon0RuntimeException {

        Environment localEnvironment = environment.newEnvironment();

        if (declarations != null) {
            declarations.interpret(localEnvironment);
        }

        if (statements != null) {
            declarations.interpret(localEnvironment);
        }
    }
}
