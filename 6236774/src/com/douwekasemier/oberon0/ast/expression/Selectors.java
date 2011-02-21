package com.douwekasemier.oberon0.ast.expression;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.ast.builders.SelectorBuilder;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.NotEvaluatableException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class Selectors extends AST implements Evaluatable {

    private ArrayList<Evaluatable> selectors;

    public Selectors(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.SELECTORS);

        selectors = new ArrayList<Evaluatable>();
        for (int i = 0; i < antlrTree.getChildCount(); i++) {
            selectors.add(SelectorBuilder.build(antlrTree.getChild(i)));
        }
    }

    @Override
    public Value evaluate(Environment environment) {
        throw new NotEvaluatableException();
    }

    @Override
    public Reference select(Environment environment, Reference from) {
        for (Evaluatable selector : selectors) {
            from = selector.select(environment, from);
        }
        return from;
    }
}
