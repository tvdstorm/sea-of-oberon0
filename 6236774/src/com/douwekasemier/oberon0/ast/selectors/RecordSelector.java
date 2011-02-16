package com.douwekasemier.oberon0.ast.selectors;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Bindable;
import com.douwekasemier.oberon0.ast.Selectable;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Record;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class RecordSelector extends AST implements Selectable {

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
    public Reference select(Environment environment, Value from) throws Oberon0Exception {
        Record record = (Record) from;
        return record.getReference(identifier);
    }
}
