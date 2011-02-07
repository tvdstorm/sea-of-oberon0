package com.douwekasemier.oberon0.interpreter.environment;

import com.douwekasemier.oberon0.ast.Node;

public class Array implements Value {
    
    private Reference[] array;
    
    public Array(Node vartype, int size) {
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
        return array[i].getValue();
    }
    
}
