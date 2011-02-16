package com.douwekasemier.oberon0.ast.expression;

import java.util.ArrayList;

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
    private ArrayList<Evaluatable> selectors;

    public Identifier() {
        super();
        selectors = new ArrayList<Evaluatable>();
        identifier = null;
    }

    public Identifier(String identifier, ArrayList<Evaluatable> selectors) {
        super();
        this.identifier = identifier;
        this.selectors = selectors;
    }

    public Identifier(Tree antlrTree) {
        antlrType = antlrTree.getType();
        antlrText = antlrTree.getText();
        identifier = antlrTree.getChild(0).getText();
        selectors = new ArrayList<Evaluatable>();

        // (Optional) Selectors
        if (antlrTree.getChildCount() == 2) {
            Tree allSelectors = antlrTree.getChild(1);
            for (int i = 0; i < allSelectors.getChildCount(); i++) {
                Tree antlrSelectorTree = allSelectors.getChild(i);
                switch (antlrSelectorTree.getType()) {
                    case Oberon0Parser.ARRAYSELECTOR:
                        selectors.add(new ArraySelector(antlrSelectorTree));
                        break;
                    case Oberon0Parser.RECORDSELECTOR:
                        selectors.add(new RecordSelector(antlrSelectorTree));
                        break;
                }
            }
        }
    }

    @Override
    public Value evaluate(Environment environment) throws Oberon0Exception {
        try {             
            return select(environment, null).getValue();
        } catch (NotSelectableExpression e) {
            e.printStackTrace();
            throw new Oberon0Exception();
        }
    }
    
    @Override
    public Reference select(Environment environment, Value from) throws Oberon0Exception, NotSelectableExpression {
        Reference reference = environment.getReference(identifier);

        for (Evaluatable selector : selectors) {
            reference = selector.select(environment, reference.getValue());
        }

        return reference;
    }
}
