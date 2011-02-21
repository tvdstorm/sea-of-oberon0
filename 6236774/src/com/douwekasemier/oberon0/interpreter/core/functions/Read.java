package com.douwekasemier.oberon0.interpreter.core.functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.douwekasemier.oberon0.ast.declaration.FormalParameter;
import com.douwekasemier.oberon0.ast.declaration.FormalParameterRef;
import com.douwekasemier.oberon0.ast.declaration.FormalParameters;
import com.douwekasemier.oberon0.ast.declaration.ProcedureDeclaration;
import com.douwekasemier.oberon0.ast.types.IdentifierType;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Int;
import com.douwekasemier.oberon0.interpreter.environment.Procedure;
import com.douwekasemier.oberon0.interpreter.environment.Reference;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class Read extends ProcedureDeclaration {
    
    public Read(Environment environment) {
        super();
        identifier = "Read";

        IdentifierType formalparameterType = new IdentifierType("INTEGER");
        ArrayList<String> formalparameterIdentifiers = new ArrayList<String>();
        formalparameterIdentifiers.add("into");
        
        List<FormalParameter> formalparameterList = new ArrayList<FormalParameter>();
        formalparameterList.add(new FormalParameterRef(formalparameterType, formalparameterIdentifiers));
        
        formalparameters = new FormalParameters(formalparameterList);

        Environment localEnvironment = environment.newEnvironment("Procedure declaration <" + identifier + ">");
        environment.declareProcedure(identifier, new Procedure(this, localEnvironment));
    }

    @Override
    public void invoke(Environment environment) throws Oberon0Exception {
        BufferedReader input = environment.getInput();

        try {
            String line = input.readLine();
            Value newValue = new Int(Integer.parseInt(line));
            Reference ref = environment.getReference("into");
            ref.setValue(newValue);
        } catch (IOException e) {
            e.printStackTrace();
            throw new Oberon0Exception();
        }
    }
}
