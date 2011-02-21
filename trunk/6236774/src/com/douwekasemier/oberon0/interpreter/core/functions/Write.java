package com.douwekasemier.oberon0.interpreter.core.functions;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.douwekasemier.oberon0.ast.declaration.FormalParameter;
import com.douwekasemier.oberon0.ast.declaration.FormalParameterCopy;
import com.douwekasemier.oberon0.ast.declaration.FormalParameters;
import com.douwekasemier.oberon0.ast.declaration.ProcedureDeclaration;
import com.douwekasemier.oberon0.ast.types.SimpleType;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Procedure;

public class Write extends ProcedureDeclaration {

    public Write(Environment environment) {
        super();
        identifier = "Write";

        SimpleType formalparameterType = new SimpleType("INTEGER");
        ArrayList<String> formalparameterIdentifiers = new ArrayList<String>();
        formalparameterIdentifiers.add("print");

        List<FormalParameter> formalparameterList = new ArrayList<FormalParameter>();
        formalparameterList.add(new FormalParameterCopy(formalparameterType, formalparameterIdentifiers));

        formalparameters = new FormalParameters(formalparameterList);

        Environment localEnvironment = environment.newEnvironment("Procedure declaration <" + identifier + ">");
        environment.declareProcedure(identifier, new Procedure(this, localEnvironment));
    }

    @Override
    public void invoke(Environment environment) throws Oberon0Exception {
        PrintWriter output = environment.getOutput();
        output.print(environment.getReference("print").getValue().toString());
    }
}
