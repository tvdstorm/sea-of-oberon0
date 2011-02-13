package com.douwekasemier.oberon0.interpreter.environment;

import java.util.ArrayList;

public class Record implements Value {

    private ArrayList<RecordField> fields;

    public Record() {
        this.fields = new ArrayList<RecordField>();
    }
    
    public void addField(RecordField field) {
        // Check for duplicate record keys
        for( String identifier: field.getIdentifiers() ) {
            if( lookup(identifier) != null ) {
                throw new RuntimeException();
            }
        }
        fields.add(field);
    }

    public void setValue(String identifier, Value value) {
        Reference reference = this.lookup(identifier);
        reference.setValue(value);
    }
    
    public Value getValue(String identifier) {
        Reference reference = this.lookup(identifier);
        return reference.getValue();
    }
    
    public void setReference(String identifier, Reference reference) {
        Reference oldReference = this.lookup(identifier);
        oldReference = reference;
    }
    
    public Reference getReference(String identifier) {
        return this.lookup(identifier);
    }

    private Reference lookup(String identifier) {
        Reference reference;
        for (RecordField field : fields) {
            reference = field.getReference(identifier);
            if( reference != null ) {
                return reference;
            }
        }
        return null;
    }

}
