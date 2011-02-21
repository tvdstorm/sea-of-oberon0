package com.douwekasemier.oberon0.ast.declaration;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Declarable;
import com.douwekasemier.oberon0.ast.Initializable;
import com.douwekasemier.oberon0.ast.builders.TypeBuilder;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class TypeDeclaration extends AST implements Declarable {

    private Initializable vartype;
    private String identifier;

    public TypeDeclaration(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.VAR);

        assert (antlrTree.getChild(0).getType() == Oberon0Parser.IDENTIFIER);
        identifier = antlrTree.getChild(0).getText();

        vartype = TypeBuilder.build(antlrTree.getChild(1));
    }

    @Override
    public void declare(Environment environment) throws Oberon0Exception {
        environment.declareType(identifier, vartype);
    }
}
