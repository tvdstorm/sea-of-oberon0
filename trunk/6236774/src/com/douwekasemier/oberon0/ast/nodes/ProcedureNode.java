package com.douwekasemier.oberon0.ast.nodes;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public class ProcedureNode extends AbstractNode implements Node {

    private String identifier;
    private ArrayList<Node> formalparameters;
    private Node declarations, statements;

    public ProcedureNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        assert (type == Oberon0Parser.PROCEDURE);
        
        formalparameters = new ArrayList<Node>();

        // Procedure identifier
        identifier = node.getChild(0).getText();

        // (Optional) formal parameters, declarations & statements
        for (int i = 1; i < node.getChildCount(); i++) {
            Tree childNode = node.getChild(i);
            switch (childNode.getType()) {
                case Oberon0Parser.FORMALPARAMETER:
                    if( childNode.getChild(0).getType() == Oberon0Parser.VAR ) {
                        formalparameters.add(new ReferenceParameterNode(childNode, this));                        
                    }
                    else {
                        formalparameters.add(new CopyParameterNode(childNode, this));
                    }
                    
                    break;
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

        // TODO Auto-generated constructor stub
    }

}
