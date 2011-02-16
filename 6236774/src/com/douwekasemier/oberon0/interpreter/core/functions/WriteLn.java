package com.douwekasemier.oberon0.interpreter.core.functions;
import java.io.PrintWriter;

import com.douwekasemier.oberon0.ast.declaration.ProcedureDeclaration;
import com.douwekasemier.oberon0.exceptions.BuildInFunctionsException;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class WriteLn extends ProcedureDeclaration {
    
    public WriteLn() {
        super();
        identifier = "WriteLn";
    }
    
    public WriteLn(Environment environment) throws BuildInFunctionsException {
        this();
        try {
            declare(environment);
        } catch (Oberon0Exception e) {
            throw new BuildInFunctionsException();
        }
    }

    @Override
    public void invoke(Environment environment) throws Oberon0Exception {
        PrintWriter output = environment.getOutput();
        output.println();
    }
}
