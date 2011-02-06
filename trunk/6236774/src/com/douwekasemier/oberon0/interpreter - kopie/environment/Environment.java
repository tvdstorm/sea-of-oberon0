package com.douwekasemier.oberon0.interpreter.environment;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.HashMap;

import com.douwekasemier.oberon0.ast.nodes.TypeNode;

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
    }
    
    public void declareReference(String identifier, Reference reference) {
        
    }
    
    public void declareVariable(String identifier, Value value) {
        
    }
    
    public void declareConstant(String identifier, Value value) {
        
    }
    
    public void declareProcedure(String identifier, Procedure procedure) {
        
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

    public Environment getParent() {
        return parent;
    }
    
}
