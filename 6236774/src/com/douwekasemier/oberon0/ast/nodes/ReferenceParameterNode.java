package com.douwekasemier.oberon0.ast.nodes;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public class ReferenceParameterNode extends ParameterNode implements Node {

    public ReferenceParameterNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);
        reference = true;

        assert (type == Oberon0Parser.FORMALPARAMETER);

        identifiers = new ArrayList<String>();

        // Var type
        Tree typeNode = node.getChild(1);
        switch (typeNode.getType()) {
            case Oberon0Parser.IDENTIFIER:
                if (typeNode.getText().equals("INTEGER")) {
                    vartype = new VartypeIntegerNode(typeNode, this);
                } else {
                    throw new ASTGenerationException();
                }
                break;
            case Oberon0Parser.ARRAY:
                vartype = new VartypeArrayNode(typeNode, this);
                break;
            case Oberon0Parser.RECORD:
                vartype = new VartypeRecordNode(typeNode, this);
                break;
            default:
                throw new ASTGenerationException();
        }

        // Identifiers
        for (int i = 2; i < node.getChildCount(); i++) {
            identifiers.add(node.getChild(i).getText());
        }
    }
}
