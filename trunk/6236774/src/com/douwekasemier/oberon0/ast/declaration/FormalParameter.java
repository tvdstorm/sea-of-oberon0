package com.douwekasemier.oberon0.ast.declaration;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Initializable;
import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public abstract class FormalParameter extends AST implements Initializable {
    
    protected boolean reference;
    protected Initializable vartype;
    protected ArrayList<String> identifiers;

    public FormalParameter() {
        reference = false;
        vartype = null;
        identifiers = new ArrayList<String>();
    }

    public FormalParameter(boolean reference, Initializable vartype, ArrayList<String> identifiers) {
        this.reference = reference;
        this.vartype = vartype;
        this.identifiers = identifiers;
    }

    public FormalParameter(Tree node) {
        this();
        
        antlrType = node.getType();
        antlrText = node.getText();
    }

    public boolean isReference() {
        return reference;
    }

    public void setReference(boolean reference) {
        this.reference = reference;
    }

    public Initializable getVartype() {
        return vartype;
    }

    public void setVartype(Initializable vartype) {
        this.vartype = vartype;
    }

    public ArrayList<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(ArrayList<String> identifiers) {
        this.identifiers = identifiers;
    }

    public Value initialize(Environment environment) throws RuntimeException {
        return null;
    }
}
