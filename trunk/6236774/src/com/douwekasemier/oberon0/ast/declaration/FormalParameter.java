package com.douwekasemier.oberon0.ast.declaration;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Initializable;
import com.douwekasemier.oberon0.ast.types.IdentifierType;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public abstract class FormalParameter extends AST implements Initializable {

    protected boolean reference;
    protected Initializable vartype;
    protected List<String> identifiers;

    public FormalParameter(Tree antlrTree) {
        super(antlrTree);
        identifiers = new ArrayList<String>();
    }

    public FormalParameter(IdentifierType vartype, List<String> identifiers) {
        super();
        this.vartype = vartype;
        this.identifiers = identifiers;
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

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    public Value initialize(Environment environment) throws Oberon0Exception {
        return null;
    }
}
