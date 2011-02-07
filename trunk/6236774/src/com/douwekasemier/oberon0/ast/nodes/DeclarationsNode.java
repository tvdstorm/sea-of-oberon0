package com.douwekasemier.oberon0.ast.nodes;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.interpreter.Oberon0RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class DeclarationsNode extends AbstractNode implements Node {

    private ArrayList<Node> constants, variables, types, procedures;

    public DeclarationsNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        // Assert that this is the node we expected, if it isn't the calling constructor is bugged!
        assert (type == Oberon0Parser.DECLARATIONS);

        constants = new ArrayList<Node>();
        variables = new ArrayList<Node>();
        types = new ArrayList<Node>();
        procedures = new ArrayList<Node>();

        for (int i = 0; i < node.getChildCount(); i++) {
            Tree childNode = node.getChild(i);
            switch (childNode.getType()) {
                case Oberon0Parser.CONST:
                    constants.add(new ConstNode(childNode, this));
                    break;
                case Oberon0Parser.VAR:
                    variables.add(new VarNode(childNode, this));
                    break;
                case Oberon0Parser.TYPE:
                    types.add(new TypeNode(childNode, this));
                    break;
                case Oberon0Parser.PROCEDURE:
                    procedures.add(new ProcedureNode(childNode, this));
                    break;
                default:
                    throw new ASTGenerationException();
            }
        }
    }

    @Override
    public void interpret(Environment environment) throws Oberon0RuntimeException {

        for (Node constant : constants) {
            constant.interpret(environment);
        }

        for (Node variable : variables) {
            variable.interpret(environment);
        }

        for (Node type : types) {
            type.interpret(environment);
        }

        for (Node procedure : procedures) {
            procedure.interpret(environment);
        }
    }
}
