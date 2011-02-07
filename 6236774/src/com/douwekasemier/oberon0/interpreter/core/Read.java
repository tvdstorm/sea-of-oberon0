package com.douwekasemier.oberon0.interpreter.core;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.ast.nodes.CopyParameterNode;
import com.douwekasemier.oberon0.ast.nodes.DeclarationsNode;
import com.douwekasemier.oberon0.ast.nodes.ParameterNode;
import com.douwekasemier.oberon0.ast.nodes.ProcedureNode;
import com.douwekasemier.oberon0.ast.nodes.ReferenceParameterNode;
import com.douwekasemier.oberon0.ast.nodes.StatementsNode;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.interpreter.Oberon0RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Procedure;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class Read extends ProcedureNode implements Node {
    
    public Read() throws ASTGenerationException {
        super();
        type = Oberon0Parser.PROCEDURE;
        identifier = text = "Read";
        formalparameters = new ArrayList<ParameterNode>();
    }
    
    public void attachToEnvironment(Environment environment) {        
        Environment localEnvironment = environment.newEnvironment();
        //environment.declareProcedure(getIdentifier(), new Procedure(this, localEnvironment));
    }

    //@Override
    /*public void invoke(Environment environment, Value[] actualparameters) throws Oberon0RuntimeException {
        Value targetArray = actualparameters[0];
    }*/
    
    /*public String getIdentifier() {
        return identifier;
    }*/
}
