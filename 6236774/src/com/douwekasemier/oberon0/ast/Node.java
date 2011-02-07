package com.douwekasemier.oberon0.ast;

import com.douwekasemier.oberon0.interpreter.Oberon0RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public interface Node {
    public Node getParent();
    public void setParent(Node parent);
    public void interpret(Environment environment) throws Oberon0RuntimeException;
    public Value evaluate(Environment environment) throws Oberon0RuntimeException;
    public Value initialize(Environment environment) throws Oberon0RuntimeException;
    public void invoke(Environment environment) throws Oberon0RuntimeException;
}
