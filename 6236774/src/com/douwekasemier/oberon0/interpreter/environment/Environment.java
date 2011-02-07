package com.douwekasemier.oberon0.interpreter.environment;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.HashMap;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.nodes.ProcedureNode;
import com.douwekasemier.oberon0.ast.nodes.TypeNode;
import com.douwekasemier.oberon0.interpreter.core.Read;

public class Environment {

    private BufferedReader input;
    private PrintWriter output;
    private Environment parent;
    private HashMap<String, Reference> variableRegistry;
    private HashMap<String, Procedure> procedureRegistry;
    private HashMap<String, TypeNode> typeRegistry;

    public Environment(BufferedReader input, PrintWriter output) {
        this(input, output, null);
    }

    public Environment(BufferedReader input, PrintWriter output, Environment parent) {
        this.input = input;
        this.output = output;
        this.parent = parent;

        variableRegistry = new HashMap<String, Reference>();
        procedureRegistry = new HashMap<String, Procedure>();
        typeRegistry = new HashMap<String, TypeNode>();
    }

    public void declareReference(String identifier, Reference reference) {
        variableRegistry.put(identifier, reference);
    }

    public void declareVariable(String identifier, Value value) {
        variableRegistry.put(identifier, new Reference(value));
    }

    public void declareConstant(String identifier, Value value) {
        variableRegistry.put(identifier, new Reference(value));
    }

    public void declareProcedure(String identifier, Procedure procedure) {
        procedureRegistry.put(identifier, procedure);
    }

    public void declareType(String identifier, TypeNode type) {
        typeRegistry.put(identifier, type);
    }

    public Reference getReference(String identifier) {
        Reference ref = variableRegistry.get(identifier);
        if (ref == null && parent != null) {
            ref = parent.getReference(identifier);
        }
        return ref;
    }

    public Procedure getProcedure(String identifier) {
        Procedure procedure = procedureRegistry.get(identifier);
        if (procedure == null && parent != null) {
            procedure = parent.getProcedure(identifier);
        }
        return procedure;
    }

    public Environment newEnvironment() {
        return new Environment(input, output, this);
    }

    public BufferedReader getInput() {
        return input;
    }

    public void setInput(BufferedReader input) {
        this.input = input;
    }

    public PrintWriter getOutput() {
        return output;
    }

    public void setOutput(PrintWriter output) {
        this.output = output;
    }

    public void loadCoreFunctions() {
        Read read;
        try {
            read = new Read();
            read.attachToEnvironment(this);
        } catch (ASTGenerationException e) {
            e.printStackTrace();
        }
    }

}
