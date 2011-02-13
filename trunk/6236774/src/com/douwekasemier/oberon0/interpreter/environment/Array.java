package com.douwekasemier.oberon0.interpreter.environment;

import com.douwekasemier.oberon0.ast.Initializable;

public class Array implements Value {
    
    private Reference[] array;
    private Initializable vartype;
    
    public Array(Initializable vartype, int size) {
        this.vartype = vartype;
        array = new Reference[size];
        for(int i = 0; i < size; i++ ) {
            array[i] = new NullReference();
        }
    }
    
    public void setValue(int i, Value value) {
        Reference reference = array[i];
        reference.setValue(value);
    }
    
    public Value getValue(int i) {
        Reference reference = array[i];
        return reference.getValue();
    }
    
    public void setReference(int i, Reference reference) {
        array[i] = reference;
    }
    
    public Reference getReference(int i) {
        return array[i];
    }

    @Override
    public String toString() {
        return "Array of " + vartype + " and size " + array.length;
    }
    
}
