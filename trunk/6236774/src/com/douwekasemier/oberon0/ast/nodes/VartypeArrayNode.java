package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.interpreter.Oberon0RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Array;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Int;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class VartypeArrayNode extends AbstractNode implements Node {

    private Node vartype;
    private Node sizeExpression;

    public VartypeArrayNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        assert (type == Oberon0Parser.ARRAY);

        // Var type
        Tree typeNode = node.getChild(0);
        switch (typeNode.getType()) {
            case Oberon0Parser.IDENTIFIER:
                if( typeNode.getText().equals("INTEGER") ) {
                    vartype = new VartypeIntegerNode(typeNode, this);                    
                }
                else {
                    throw new ASTGenerationException();
                }
                break;                
            case Oberon0Parser.ARRAY:
                vartype = new VartypeArrayNode(typeNode, this);
                break;
            case Oberon0Parser.RECORD:
                vartype = new VartypeRecordNode(typeNode, this);
                break;
        }

        Tree expressionNode = node.getChild(1);
        sizeExpression = new RootExpressionNode(expressionNode, this);
    }

    @Override
    public Value initialize(Environment environment) throws Oberon0RuntimeException {
        Int size = null;
        try {
            size = (Int) sizeExpression.evaluate(environment);
        } catch (ClassCastException e) {
            throw new Oberon0RuntimeException();
        }
        return new Array(vartype, size.getValue().intValue() );
    }
}
