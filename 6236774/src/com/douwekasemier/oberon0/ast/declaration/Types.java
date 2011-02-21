package com.douwekasemier.oberon0.ast.declaration;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Declarable;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class Types extends AST implements Declarable {

    private List<Declarable> types;

    public Types(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.TYPES);
        types = new ArrayList<Declarable>();
        
        for( int i = 0; i < antlrTree.getChildCount(); i++ ) {
            types.add(new TypeDeclaration(antlrTree.getChild(i)));
        }
    }

    @Override
    public void declare(Environment environment) throws Oberon0Exception {
        for (Declarable type : types) {
            type.declare(environment);
        }
    }
}
