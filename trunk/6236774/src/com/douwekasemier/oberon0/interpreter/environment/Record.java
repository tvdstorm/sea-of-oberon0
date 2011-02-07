package com.douwekasemier.oberon0.interpreter.environment;

import com.douwekasemier.oberon0.ast.Node;

public class Record implements Value {
    
    private Reference[] array;
    
    public Record(Node vartype, int size) {
        array = new Reference[size];
    }
    
    public void setValue(int pos, Value value) {
        Reference reference = array[pos];
        reference.setValue(value);
    }
    
}
