package com.douwekasemier.oberon0.ast.declaration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Declarable;
import com.douwekasemier.oberon0.ast.builders.ParameterBuilder;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class FormalParameters extends AST implements Declarable, Iterable<FormalParameter> {

    protected List<FormalParameter> formalparameters;

    public FormalParameters(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.FORMALPARAMETERS);
        
        formalparameters = new ArrayList<FormalParameter>();
        for (int i = 0; i < antlrTree.getChildCount(); i++) {
            formalparameters.add(ParameterBuilder.build(antlrTree.getChild(i)));
        }
    }

    public FormalParameters(List<FormalParameter> formalparameters) {
        super();
        this.formalparameters = formalparameters;
    }

    @Override
    public void declare(Environment environment) {
        
    }

    @Override
    public Iterator<FormalParameter> iterator() {
        return formalparameters.iterator();
    }
}
