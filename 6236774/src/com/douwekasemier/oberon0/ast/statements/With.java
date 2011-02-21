package com.douwekasemier.oberon0.ast.statements;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Interpretable;
import com.douwekasemier.oberon0.ast.expression.Identifier;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Record;

public class With extends AST implements Interpretable {

    private Identifier identifier;
    private Statements statements;

    public With(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.WITH);

        identifier = new Identifier(antlrTree.getChild(0));
        statements = new Statements(antlrTree.getChild(1));
    }

    @Override
    public void interpret(Environment environment) throws Oberon0Exception {
        Environment withEnvironment = environment.newEnvironment("With statement <" + identifier + ">");
        Record record = (Record) identifier.evaluate(environment);
        for (String identifier : record) {
            withEnvironment.declareReference(identifier, record.getReference(identifier));
        }
        statements.interpret(withEnvironment);
    }

}
