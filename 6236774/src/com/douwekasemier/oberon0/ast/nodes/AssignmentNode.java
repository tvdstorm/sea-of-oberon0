package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.ast.SelectorNode;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.interpreter.Oberon0RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class AssignmentNode extends AbstractNode implements Node {

    private SelectorNode selector;
    private Node expression;

    public AssignmentNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        assert (type == Oberon0Parser.ASSIGN);

        // Selector
        Tree selectorNode = node.getChild(0);
        switch (selectorNode.getType()) {
            case Oberon0Parser.IDENTIFIER:
                selector = new SelectorIdentifierNode(selectorNode, this);
                break;
            case Oberon0Parser.ARRAYSELECTOR:
                selector = new SelectorArrayNode(selectorNode, this);
                break;
            case Oberon0Parser.RECORDSELECTOR:
                selector = new SelectorRecordNode(selectorNode, this);
                break;
            default:
                throw new ASTGenerationException();
        }

        Tree expressionNode = node.getChild(1);
        expression = new RootExpressionNode(expressionNode, this);
    }

    @Override
    public void interpret(Environment environment) throws Oberon0RuntimeException {
        Value value = expression.evaluate(environment);
        Reference reference = environment.getReference(selector.getIdentifier());
        reference.setValue(value);
    }

}
