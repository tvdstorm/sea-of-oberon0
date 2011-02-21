package com.douwekasemier.oberon0.ast.statements.ifstatement;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.ast.builders.ExpressionBuilder;
import com.douwekasemier.oberon0.ast.statements.Statements;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public class If extends AST {

    private Evaluatable expression;
    private Statements statements;

    public If(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.IF);

        expression = ExpressionBuilder.build(antlrTree.getChild(0));
        statements = new Statements(antlrTree.getChild(1));
    }

    public Evaluatable getExpression() {
        return expression;
    }

    public void setExpression(Evaluatable expression) {
        this.expression = expression;
    }

    public Statements getStatements() {
        return statements;
    }

    public void setStatements(Statements statements) {
        this.statements = statements;
    }

}
