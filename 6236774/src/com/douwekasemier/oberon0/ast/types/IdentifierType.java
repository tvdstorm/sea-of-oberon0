package com.douwekasemier.oberon0.ast.types;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Initializable;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.interpreter.environment.Bool;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Int;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class IdentifierType extends AST implements Initializable {

    private String identifier;

    public IdentifierType(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.IDENTIFIER);

        identifier = antlrText;
    }

    public IdentifierType(String string) {
        super();
        identifier = antlrText;
    }

    @Override
    public Value initialize(Environment environment) {
        if (identifier.equals("INTEGER")) {
            return new Int(new Integer(0));
        } else if (identifier.equals("BOOLEAN")) {
            return new Bool(new Boolean(false));
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "IdentifierType [identifier=" + identifier + "]";
    }
}
