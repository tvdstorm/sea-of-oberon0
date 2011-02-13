package com.douwekasemier.oberon0.interpreter.environment;
import com.douwekasemier.oberon0.ast.declaration.ProcedureDeclaration;

public class Procedure {

    private ProcedureDeclaration procedureDeclaration;
    private Environment environment;

    public Procedure(ProcedureDeclaration procedureDeclaration, Environment environment) {
        this.procedureDeclaration = procedureDeclaration;
        this.environment = environment;
    }

    public ProcedureDeclaration getProcedureNode() {
        return procedureDeclaration;
    }

    public void setProcedureNode(ProcedureDeclaration procedureDeclaration) {
        this.procedureDeclaration = procedureDeclaration;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
