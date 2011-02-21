package com.douwekasemier.oberon0.interpreter.environment;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import com.douwekasemier.oberon0.ast.Initializable;
import com.douwekasemier.oberon0.exceptions.BuildInFunctionsException;
import com.douwekasemier.oberon0.interpreter.core.functions.Read;
import com.douwekasemier.oberon0.interpreter.core.functions.Write;
import com.douwekasemier.oberon0.interpreter.core.functions.WriteLn;

public class Environment {

    private BufferedReader input;
    private PrintWriter output;
    private Environment parent;
    private String label;
    private Map<String, Bindable> bindableRegistry;
    private Map<String, Initializable> typeRegistry;

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

        bindableRegistry = new HashMap<String, Bindable>();
        typeRegistry = new HashMap<String, Initializable>();
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String ident) {
        if (parent == null) {
            return "Environment @" + Integer.toHexString(hashCode()) + "\r\n  " + ident + "label = " + label + ",\r\n  " + ident + "parent = " + null;
        } else {
            return "Environment @" + Integer.toHexString(hashCode()) + "\r\n  " + ident + "label = " + label + ",\r\n  " + ident + "parent = "
                    + parent.toString(ident + "  ");
        }
    }

    public void declareReference(String identifier, Reference reference) {
        bindableRegistry.put(identifier, reference);
    }

    public void declareVariable(String identifier, Value value) {
        bindableRegistry.put(identifier, new Reference(value));
    }

    public void declareConstant(String identifier, Value value) {
        bindableRegistry.put(identifier, new Reference(value));
    }

    public void declareProcedure(String identifier, Procedure procedure) {
        bindableRegistry.put(identifier, procedure);
    }

    public void declareType(String identifier, Initializable type) {
        typeRegistry.put(identifier, type);
    }

    public Reference getReference(String identifier) {
        Reference ref = (Reference) bindableRegistry.get(identifier);

        if (ref == null && parent != null) {
            ref = parent.getReference(identifier);
        }
        return ref;
    }

    public Procedure getProcedure(String identifier) {
        Procedure procedure = (Procedure) bindableRegistry.get(identifier);

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

    public Initializable resolveType(String identifier) {
        Initializable type = typeRegistry.get(identifier);
        
        if( type != null ) {
            return type;
        }
        
        if( parent != null ) {
            return parent.resolveType(identifier);
        }
        
        return null;
    }

}
