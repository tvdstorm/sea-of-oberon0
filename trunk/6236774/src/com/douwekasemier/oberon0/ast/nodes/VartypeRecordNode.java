package com.douwekasemier.oberon0.ast.nodes;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public class VartypeRecordNode extends AbstractNode implements Node {

    public VartypeRecordNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);
        assert (type == Oberon0Parser.RECORD);
    }

}