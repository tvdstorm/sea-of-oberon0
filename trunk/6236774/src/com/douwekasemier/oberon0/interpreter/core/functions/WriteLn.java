package com.douwekasemier.oberon0.interpreter.core.functions;
import java.io.PrintWriter;

import com.douwekasemier.oberon0.ast.declaration.ProcedureDeclaration;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Procedure;

public class WriteLn extends ProcedureDeclaration {
    
    public WriteLn(Environment environment) {
        super();
        identifier = "WriteLn";

        Environment localEnvironment = environment.newEnvironment("Procedure declaration <" + identifier + ">");
        environment.declareProcedure(identifier, new Procedure(this, localEnvironment));
    }

    @Override
    public void invoke(Environment environment) throws Oberon0Exception {
        PrintWriter output = environment.getOutput();
        output.println();
    }
}
