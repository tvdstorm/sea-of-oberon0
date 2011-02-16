package com.douwekasemier.oberon0.ast.declaration;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Declarable;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class TypeDeclaration extends AST implements Declarable {

    public TypeDeclaration(Tree node) {
        antlrType = node.getType();
        antlrText = node.getText();
    }

    @Override
    public void declare(Environment environment) throws Oberon0Exception {
        
    }

}
