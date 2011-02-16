package com.douwekasemier.oberon0.ast.expression;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.exceptions.NotSelectableExpression;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Array;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Int;
import com.douwekasemier.oberon0.interpreter.environment.Record;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class RecordSelector extends AST implements Evaluatable {

    private String identifier;

    public RecordSelector() {
        identifier = null;
    }

    public RecordSelector(String identifier) {
        this.identifier = identifier;
    }

    public RecordSelector(Tree antlrTree) {
        antlrType = antlrTree.getType();
        antlrText = antlrTree.getText();
        identifier = antlrTree.getChild(0).getText();
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
        // From moet een array zijn
        Record record = (Record) from;
        return record.getReference(identifier);
    }
}
