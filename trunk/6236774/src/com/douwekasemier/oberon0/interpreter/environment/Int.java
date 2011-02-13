package com.douwekasemier.oberon0.interpreter.environment;

public class Int implements Value {

    private Integer value;

    public Int(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

}
