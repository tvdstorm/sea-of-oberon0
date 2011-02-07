package com.douwekasemier.oberon0.ast;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.interpreter.Oberon0RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Int;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public abstract class AbstractNode implements Node {

    protected String text;
    protected int type;
    protected Node parent;

    @Override
    public String toString() {
        return this.getClass().getName() + " [type=" + type + "] [text=" + text + "]";
    }

    public AbstractNode() throws ASTGenerationException {
        type = 0;
        text = null;
        this.parent = null;
    }

    public AbstractNode(Tree node, Node parent) throws ASTGenerationException {
        type = node.getType();
        text = node.getText();
        this.parent = parent;
    }

    @Override
    public void interpret(Environment environment) throws Oberon0RuntimeException {
        throw new Oberon0RuntimeException();
    }

    @Override
    public Value evaluate(Environment environment) throws Oberon0RuntimeException {
        throw new Oberon0RuntimeException();
    }

    @Override
    public Value initialize(Environment environment) throws Oberon0RuntimeException {
        throw new Oberon0RuntimeException();
    }

    @Override
    public void invoke(Environment environment) throws Oberon0RuntimeException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public final Node getParent() {
        return parent;
    }

    @Override
    public final void setParent(Node parent) {
        this.parent = parent;
    }


}
