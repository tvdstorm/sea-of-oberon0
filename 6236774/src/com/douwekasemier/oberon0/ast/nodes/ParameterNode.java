package com.douwekasemier.oberon0.ast.nodes;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public class ParameterNode extends AbstractNode implements Node {

    protected boolean reference;
    protected Node vartype;
    protected ArrayList<String> identifiers;

    public boolean isReference() {
        return reference;
    }

    public void setReference(boolean reference) {
        this.reference = reference;
    }

    public Node getVartype() {
        return vartype;
    }

    public void setVartype(Node vartype) {
        this.vartype = vartype;
    }

    public ArrayList<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(ArrayList<String> identifiers) {
        this.identifiers = identifiers;
    }

    public ParameterNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);
    }
}
