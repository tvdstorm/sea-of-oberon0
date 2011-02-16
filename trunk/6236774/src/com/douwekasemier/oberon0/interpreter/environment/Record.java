package com.douwekasemier.oberon0.interpreter.environment;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Record implements Value, Iterable<String> {

    private Map<String, Reference> record;

    public Record() {
        record = new HashMap<String, Reference>();
    }

    public void addField(String identifier, Reference reference) {
        record.put(identifier, reference);
    }

    public void setValue(String identifier, Value value) {
        Reference reference = record.get(identifier);
        reference.setValue(value);
    }

    public Value getValue(String identifier) {
        Reference reference = record.get(identifier);
        return reference.getValue();
    }

    public void setReference(String identifier, Reference reference) {
        record.put(identifier, reference);
    }

    public Reference getReference(String identifier) {
        return record.get(identifier);
    }

    @Override
    public Iterator<String> iterator() {
        if( record.isEmpty() ) {
            return Collections.<String>emptyList().iterator();
        }
        return record.keySet().iterator();
    }
}
