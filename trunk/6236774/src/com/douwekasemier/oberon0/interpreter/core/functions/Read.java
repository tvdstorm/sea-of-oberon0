package com.douwekasemier.oberon0.interpreter.core.functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.douwekasemier.oberon0.ast.declaration.FormalParameter;
import com.douwekasemier.oberon0.ast.declaration.FormalParameterRef;
import com.douwekasemier.oberon0.ast.declaration.ProcedureDeclaration;
import com.douwekasemier.oberon0.ast.types.IdentifierType;
import com.douwekasemier.oberon0.exceptions.BuildInFunctionsException;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Int;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class Read extends ProcedureDeclaration {

    public Read() {
        super();
        identifier = "Read";

        IdentifierType fpType = new IdentifierType("INTEGER");
        ArrayList<String> fpIdentifiers = new ArrayList<String>();
        fpIdentifiers.add("into");

        formalparameters = new ArrayList<FormalParameter>();
        formalparameters.add(new FormalParameterRef(fpType, fpIdentifiers));
    }

    public Read(Environment environment) throws BuildInFunctionsException {
        this();
        try {
            declare(environment);
        } catch (Oberon0Exception e) {
            throw new BuildInFunctionsException();
        }
    }

    @Override
    public void invoke(Environment environment) throws Oberon0Exception {
        BufferedReader input = environment.getInput();

        try {
            String line = input.readLine();
            Value newValue = new Int(new Integer(Integer.parseInt(line)));
            environment.getReference("into").setValue(newValue);
        } catch (IOException e) {
            e.printStackTrace();
            throw new Oberon0Exception();
        }
    }
}
