package com.douwekasemier.oberon0.ast.expression;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.NotSelectableExpression;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class Identifier extends AST implements Evaluatable {

    private String identifier;
    private Selectors selectors;

    public Identifier(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.IDENT_SELECT);

        assert (antlrTree.getChild(0).getType() == Oberon0Parser.IDENTIFIER);
        identifier = antlrTree.getChild(0).getText();

        selectors = new Selectors(antlrTree.getChild(1));
    }

    @Override
    public Value evaluate(Environment environment) {
        try {
            Reference ref = select(environment, null);
            if (ref == null) {
                ref = select(environment, null);
            }
            return ref.getValue();
        } catch (NotSelectableExpression e) {
            e.printStackTrace();
            throw new Oberon0Exception();
        }
    }

    @Override
    public Reference select(Environment environment, Reference from) throws Oberon0Exception, NotSelectableExpression {
        Reference reference = environment.getReference(identifier);
        return selectors.select(environment, reference);
    }
}
