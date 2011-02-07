package com.douwekasemier.oberon0.interpreter.environment;

public class Bool implements Value {
    
    private Boolean value;
    
    public Bool(Boolean value) {
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }
    
}
