package com.douwekasemier.oberon0.ast.statements;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.ast.ExpressionBuilder;
import com.douwekasemier.oberon0.ast.Interpretable;
import com.douwekasemier.oberon0.ast.declaration.Declarations;
import com.douwekasemier.oberon0.ast.declaration.FormalParameter;
import com.douwekasemier.oberon0.ast.declaration.ProcedureDeclaration;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.NotSelectableExpression;
import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Procedure;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class ProcedureCall extends AST implements Interpretable {

    private String identifier;
    private ArrayList<Evaluatable> actualParameters;

    public ProcedureCall() {
        identifier = null;
        actualParameters = new ArrayList<Evaluatable>();
    }

    public ProcedureCall(String identifier, ArrayList<Evaluatable> actualParameters) {
        this.identifier = identifier;
        this.actualParameters = actualParameters;
    }

    public ProcedureCall(Tree antlrTree) {
        this();
        antlrType = antlrTree.getType();
        antlrText = antlrTree.getText();
        assert (antlrType == Oberon0Parser.CALL);

        identifier = antlrTree.getChild(0).getText();

        // Parameters
        for (int i = 1; i < antlrTree.getChildCount(); i++) {
            actualParameters.add(ExpressionBuilder.build(antlrTree.getChild(i)));
        }
    }

    @Override
    public void interpret(Environment environment) throws RuntimeException {

        Procedure procedure = environment.getProcedure(identifier);
        Environment invokerEnvironment = procedure.getEnvironment().newEnvironment();
        ProcedureDeclaration procedureDeclaration = procedure.getProcedureNode();
        Declarations declarations = procedureDeclaration.getDeclarations();
        if (declarations != null) {
            declarations.declare(invokerEnvironment);
        }

        int i = 0;
        for (FormalParameter formalParameter : procedureDeclaration.getFormalParameters()) {
            for (String identifier : formalParameter.getIdentifiers()) {
                Evaluatable actualParameter = actualParameters.get(i);
                try {
                    if (formalParameter.isReference()) {
                        Reference ref = actualParameter.select(invokerEnvironment, null);
                        invokerEnvironment.declareReference(identifier, ref);

                    } else {
                        Value value = actualParameter.evaluate(invokerEnvironment);
                        invokerEnvironment.declareVariable(identifier, value);
                    }
                } catch (NotSelectableExpression e) {
                    e.printStackTrace();
                    throw new RuntimeException();
                }

                i++;
            }
        }
        procedureDeclaration.invoke(invokerEnvironment);
    }

}
