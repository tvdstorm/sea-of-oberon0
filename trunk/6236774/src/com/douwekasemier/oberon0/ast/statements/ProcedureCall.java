package com.douwekasemier.oberon0.ast.statements;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.ast.Interpretable;
import com.douwekasemier.oberon0.ast.declaration.Declarations;
import com.douwekasemier.oberon0.ast.declaration.FormalParameter;
import com.douwekasemier.oberon0.ast.declaration.ProcedureDeclaration;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.NotSelectableExpression;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Procedure;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class ProcedureCall extends AST implements Interpretable {

    private String identifier;
    private ActualParameters actualParameters;

    public ProcedureCall(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.CALL);
        
        assert(antlrTree.getChild(0).getType() == Oberon0Parser.IDENTIFIER);
        identifier = antlrTree.getChild(0).getText();

        actualParameters = new ActualParameters(antlrTree.getChild(1));
    }

    @Override
    public void interpret(Environment environment) {

        Procedure procedure = environment.getProcedure(identifier);
        Environment invokerEnvironment = procedure.getEnvironment().newEnvironment("Procedure call <" + identifier + ">");
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
                        Reference ref = actualParameter.select(environment, null);
                        invokerEnvironment.declareReference(identifier, ref);

                    } else {
                        Value value = actualParameter.evaluate(environment);
                        invokerEnvironment.declareVariable(identifier, value);
                    }
                } catch (NotSelectableExpression e) {
                    e.printStackTrace();
                    throw new Oberon0Exception();
                }

                i++;
            }
        }
        procedureDeclaration.invoke(invokerEnvironment);
    }

}
