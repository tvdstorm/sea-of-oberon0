package com.douwekasemier.oberon0.interpreter.environment;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.HashMap;

import com.douwekasemier.oberon0.exceptions.BuildInFunctionsException;
import com.douwekasemier.oberon0.interpreter.core.functions.Read;
import com.douwekasemier.oberon0.interpreter.core.functions.Write;
import com.douwekasemier.oberon0.interpreter.core.functions.WriteLn;

public class Environment {

    private BufferedReader input;
    private PrintWriter output;
    private Environment parent;
    private String label;
    private HashMap<String, Reference> variableRegistry;
    private HashMap<String, Procedure> procedureRegistry;
    private HashMap<String, Type> typeRegistry;

    public Environment(BufferedReader input, PrintWriter output) {
        this(input, output, null);
    }

    public Environment(BufferedReader input, PrintWriter output, Environment parent) {
        this(input, output, parent, "undefined");
    }

    public Environment(BufferedReader input, PrintWriter output, Environment parent, String label) {
        this.input = input;
        this.output = output;
        this.parent = parent;
        this.label = label;

        variableRegistry = new HashMap<String, Reference>();
        procedureRegistry = new HashMap<String, Procedure>();
        typeRegistry = new HashMap<String, Type>();
    }
    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String ident) {
        if( parent == null ) {
            return "Environment @"+ Integer.toHexString(hashCode())+"\r\n  "+ident+"label = " + label + ",\r\n  "+ident+"parent = " + null;            
        }
        else {
            return "Environment @"+ Integer.toHexString(hashCode())+"\r\n  "+ident+"label = " + label + ",\r\n  "+ident+"parent = " + parent.toString(ident + "  ");            
        }
    }

    public void declareReference(String identifier, Reference reference) {
        variableRegistry.put(identifier, reference);
    }

    public void declareVariable(String identifier, Value value) {
        // debug
        //System.out.println("Declare variable ["+identifier+"]");
        //System.out.println(this);
        //System.out.println();
        
        variableRegistry.put(identifier, new Reference(value));
    }

    public void declareConstant(String identifier, Value value) {
        variableRegistry.put(identifier, new Reference(value));
    }

    public void declareProcedure(String identifier, Procedure procedure) {
        //System.out.println("Declare procedure ["+identifier+"]");
        //System.out.println(this);
        //System.out.println();
        
        procedureRegistry.put(identifier, procedure);
    }

    public void declareType(String identifier, Type type) {
        typeRegistry.put(identifier, type);
    }

    public Reference getReference(String identifier) {
        //System.out.println("Get reference ["+identifier+"]");
        
        Reference ref = variableRegistry.get(identifier);
        
        // debug
        //System.out.println(this);
        //if( ref != null) {
            //System.out.println();
        //}
        
        if (ref == null && parent != null) {
            ref = parent.getReference(identifier);
        }
        return ref;
    }

    public Procedure getProcedure(String identifier) {
        //System.out.println("Get procedure ["+identifier+"]");
        
        Procedure procedure = procedureRegistry.get(identifier);
        
        // debug
        //System.out.println(this);
        //if( procedure != null) {
            //System.out.println();
        //}
        
        if (procedure == null && parent != null) {
            procedure = parent.getProcedure(identifier);
        }
        return procedure;
    }

    public Environment newEnvironment() {
        return new Environment(input, output, this);
    }
    
    public Environment newEnvironment(String label) {
        return new Environment(input, output, this, label);
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
