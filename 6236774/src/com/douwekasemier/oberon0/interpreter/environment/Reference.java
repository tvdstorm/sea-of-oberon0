package com.douwekasemier.oberon0.interpreter.environment;

public class Reference {

    private Value value;
    
    public Reference(Value value) {
        this.value = value; 
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

}
