package com.douwekasemier.oberon0.ast.statements;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Interpretable;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class Statements extends AST implements Interpretable {

    private ArrayList<Interpretable> statements;

    public Statements() {
        statements = new ArrayList<Interpretable>();
    }

    public Statements(ArrayList<Interpretable> statements) {
        this.statements = statements;
    }

    public Statements(Tree antlrTree) {
        this();
        antlrType = antlrTree.getType();
        antlrText = antlrTree.getText();

        assert (antlrType == Oberon0Parser.STATEMENTS);

        // Loop statements
        for (int i = 0; i < antlrTree.getChildCount(); i++) {
            Tree antlrChild = antlrTree.getChild(i);
            switch (antlrChild.getType()) {
                case Oberon0Parser.ASSIGN:
                    statements.add(new Assignment(antlrChild));
                    break;
                case Oberon0Parser.CALL:
                    statements.add(new ProcedureCall(antlrChild));
                    break;
                case Oberon0Parser.WHILE:
                    statements.add(new While(antlrChild));
                    break;
                case Oberon0Parser.IFSTATEMENT:
                    statements.add(new IfStatement(antlrChild));
                    break;
            }
        }
    }

    @Override
    public void interpret(Environment environment) throws RuntimeException {
        for (Interpretable statement : statements) {
            statement.interpret(environment);
        }
    }

}
