package com.douwekasemier.oberon0.interpreter.environment;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.HashMap;

import com.douwekasemier.oberon0.exceptions.BuildInFunctionsException;
import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.core.functions.Read;
import com.douwekasemier.oberon0.interpreter.core.functions.Write;
import com.douwekasemier.oberon0.interpreter.core.functions.WriteLn;

public class Environment {

    private BufferedReader input;
    private PrintWriter output;
    private Environment parent;
    private HashMap<String, Reference> variableRegistry;
    private HashMap<String, Procedure> procedureRegistry;
    private HashMap<String, Type> typeRegistry;

    public Environment(BufferedReader input, PrintWriter output) {
        this(input, output, null);
    }

    public Environment(BufferedReader input, PrintWriter output, Environment parent) {
        this.input = input;
        this.output = output;
        this.parent = parent;

        variableRegistry = new HashMap<String, Reference>();
        procedureRegistry = new HashMap<String, Procedure>();
        typeRegistry = new HashMap<String, Type>();
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

    public void declareType(String identifier, Type type) {
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
        try {
            new Read(this);
            new Write(this);
            new WriteLn(this);
        } catch (BuildInFunctionsException e) {
            e.printStackTrace();
        }

    }

}
