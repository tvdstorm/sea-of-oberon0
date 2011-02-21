package com.douwekasemier.oberon0.ast.statements;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.ast.builders.ExpressionBuilder;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public class ActualParameters extends AST {

    private List<Evaluatable> actualParameters;

    public ActualParameters(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.ACTUALS);
        
        actualParameters = new ArrayList<Evaluatable>();
        for (int i = 0; i < antlrTree.getChildCount(); i++) {
            actualParameters.add(ExpressionBuilder.build(antlrTree.getChild(i)));
        }
    }

    public Evaluatable get(int i) {
        return actualParameters.get(i);
    }
}
