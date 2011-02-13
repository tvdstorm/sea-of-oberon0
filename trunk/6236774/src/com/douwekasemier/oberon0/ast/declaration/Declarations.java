package com.douwekasemier.oberon0.ast.declaration;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Declarable;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.ASTException;
import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class Declarations extends AST implements Declarable {

    private ArrayList<ConstantDeclaration> constants;
    private ArrayList<VariableDeclaration> variables;
    private ArrayList<TypeDeclaration> types;
    private ArrayList<ProcedureDeclaration> procedures;

    public Declarations() {
        constants = new ArrayList<ConstantDeclaration>();
        variables = new ArrayList<VariableDeclaration>();
        types = new ArrayList<TypeDeclaration>();
        procedures = new ArrayList<ProcedureDeclaration>();
    }

    public Declarations(
            ArrayList<ConstantDeclaration> constants,
            ArrayList<VariableDeclaration> variables,
            ArrayList<TypeDeclaration> types,
            ArrayList<ProcedureDeclaration> procedures) throws ASTException {
        
        this.constants = constants;
        this.variables = variables;
        this.types = types;
        this.procedures = procedures;
    }
    
    public Declarations(Tree antlrTree) {
        this();
        
        antlrType = antlrTree.getType();
        antlrText = antlrTree.getText();
        
        assert (antlrType == Oberon0Parser.DECLARATIONS);
        
        for (int i = 0; i < antlrTree.getChildCount(); i++) {
            Tree antlrChildNode = antlrTree.getChild(i);
            switch (antlrChildNode.getType()) {
                case Oberon0Parser.CONST:
                    constants.add(new ConstantDeclaration(antlrChildNode));
                    break;
                case Oberon0Parser.VAR:
                    variables.add(new VariableDeclaration(antlrChildNode));
                    break;
                case Oberon0Parser.TYPE:
                    types.add(new TypeDeclaration(antlrChildNode));
                    break;
                case Oberon0Parser.PROCEDURE:
                    procedures.add(new ProcedureDeclaration(antlrChildNode));
                    break;
            }
        }
    }

    @Override
    public void declare(Environment environment) throws RuntimeException {

        for (ConstantDeclaration constant : constants) {
            constant.declare(environment);
        }

        for (VariableDeclaration variable : variables) {
            variable.declare(environment);
        }

        for (TypeDeclaration type : types) {
            type.declare(environment);
        }

        for (ProcedureDeclaration procedure : procedures) {
            procedure.declare(environment);
        }
    }
}
