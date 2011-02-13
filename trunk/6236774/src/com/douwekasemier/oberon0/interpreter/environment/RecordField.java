package com.douwekasemier.oberon0.interpreter.environment;

import java.util.ArrayList;
import java.util.HashMap;

import com.douwekasemier.oberon0.ast.Initializable;

public class RecordField implements Value {

    private Initializable vartype;
    private ArrayList<String> identifiers;
    private HashMap<String, Reference> record;

    public RecordField(Initializable vartype, ArrayList<String> identifiers) {
        this.vartype = vartype;
        this.identifiers = identifiers;
        record = new HashMap<String, Reference>();
        for (String identifier : identifiers) {
            record.put(identifier, new NullReference());
        }
    }

    public Reference getReference(String identifier) {
        return record.get(identifier);
    }

    public ArrayList<String> getIdentifiers() {
        return identifiers;
    }

    public void setValue(String identifier, Value value) {
        Reference reference = record.get(identifier);
        reference.setValue(value);
    }

    public Value getValue(String identifier) {
        return record.get(identifier).getValue();
    }

    @Override
    public String toString() {
        return "Record of " + record.size() + " fields";
    }
}
