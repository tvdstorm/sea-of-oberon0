package com.douwekasemier.oberon0.ast.statements.ifstatement;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.statements.Statements;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public class Else extends AST {

    private Statements statements;

    public Else() {
        statements = null;
    }

    public Else(Statements statements) {
        this.statements = statements;
    }

    public Else(Tree antlrTree) {
        this();
        antlrType = antlrTree.getType();
        antlrText = antlrTree.getText();
        assert (antlrType == Oberon0Parser.ELSE);

        statements = new Statements(antlrTree.getChild(0));

    }

    public Statements getStatements() {
        return statements;
    }

    public void setStatements(Statements statements) {
        this.statements = statements;
    }

}
