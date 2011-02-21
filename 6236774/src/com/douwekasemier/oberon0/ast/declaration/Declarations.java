package com.douwekasemier.oberon0.ast.declaration;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Declarable;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class Declarations extends AST implements Declarable {

    private Constants constants;
    private Variables variables;
    private Types types;
    private Procedures procedures;

    public Declarations(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.DECLARATIONS);
        
        constants = new Constants(antlrTree.getChild(0));
        types =  new Types(antlrTree.getChild(1));
        variables = new Variables(antlrTree.getChild(2));
        procedures = new Procedures(antlrTree.getChild(3)); 
    }

    @Override
    public void declare(Environment environment) {
        constants.declare(environment);
        variables.declare(environment);
        types.declare(environment);
        procedures.declare(environment);
    }
}
