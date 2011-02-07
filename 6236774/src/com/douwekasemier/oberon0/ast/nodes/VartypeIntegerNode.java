package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.interpreter.Oberon0RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Int;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class VartypeIntegerNode extends AbstractNode implements Node {

    public VartypeIntegerNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);
        assert (type == Oberon0Parser.IDENTIFIER);
    }

    @Override
    public Value initialize(Environment environment) throws Oberon0RuntimeException {
        return new Int(new Integer(0));
    }
}
