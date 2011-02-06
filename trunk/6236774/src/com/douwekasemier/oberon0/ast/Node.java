package com.douwekasemier.oberon0.ast;

import com.douwekasemier.oberon0.interpreter.Oberon0RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public interface Node {
    public void interpret(Environment environment) throws Oberon0RuntimeException;

    public Node getParent();

    public void setParent(Node parent);
}
