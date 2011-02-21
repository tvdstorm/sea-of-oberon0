package com.douwekasemier.oberon0.ast.statements;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Interpretable;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class Statements extends AST implements Interpretable {

    private List<Interpretable> statements;

    public Statements(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.STATEMENTS);

        statements = new ArrayList<Interpretable>();
        
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
                case Oberon0Parser.WITH:
                    statements.add(new With(antlrChild));
                    break;
                default:
                    throw new AssertionError("Incorrect node in Statements");
            }
        }
    }

    @Override
    public void interpret(Environment environment) {
        for (Interpretable statement : statements) {
            statement.interpret(environment);
        }
    }

}
