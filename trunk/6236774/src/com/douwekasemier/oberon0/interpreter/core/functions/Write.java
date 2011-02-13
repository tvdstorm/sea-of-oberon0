package com.douwekasemier.oberon0.interpreter.core.functions;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.douwekasemier.oberon0.ast.declaration.FormalParameter;
import com.douwekasemier.oberon0.ast.declaration.FormalParameterCopy;
import com.douwekasemier.oberon0.ast.declaration.ProcedureDeclaration;
import com.douwekasemier.oberon0.ast.types.IdentifierType;
import com.douwekasemier.oberon0.exceptions.BuildInFunctionsException;
import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class Write extends ProcedureDeclaration {
    
    public Write() {
        super();
        identifier = "Write";;
        
        IdentifierType fpType = new IdentifierType("INTEGER");
        ArrayList<String> fpIdentifiers = new ArrayList<String>();
        fpIdentifiers.add("print");
        
        formalparameters = new ArrayList<FormalParameter>();
        formalparameters.add(new FormalParameterCopy(fpType, fpIdentifiers));
    }
    
    public Write(Environment environment) throws BuildInFunctionsException {
        this();
        try {
            declare(environment);
        } catch (RuntimeException e) {
            throw new BuildInFunctionsException();
        }
    }

    @Override
    public void invoke(Environment environment) throws RuntimeException {
        PrintWriter output = environment.getOutput();
        output.print(environment.getReference("print").getValue().toString());
    }
}
