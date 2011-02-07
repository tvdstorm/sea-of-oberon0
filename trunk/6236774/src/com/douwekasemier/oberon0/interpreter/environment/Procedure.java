package com.douwekasemier.oberon0.interpreter.environment;

import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.ast.nodes.ProcedureNode;
import com.douwekasemier.oberon0.interpreter.Oberon0RuntimeException;

public class Procedure {

    public ProcedureNode getProcedureNode() {
        return (ProcedureNode) procedureNode;
    }

    public void setProcedureNode(Node procedureNode) {
        this.procedureNode = procedureNode;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    Node procedureNode;
    Environment environment;
    
    public Procedure(ProcedureNode procedureNode, Environment environment) {
        this.procedureNode = procedureNode;
        this.environment = environment;
    }

}
