package com.douwekasemier.oberon0.ast.declaration;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.statements.Statements;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.ASTException;
import com.douwekasemier.oberon0.exceptions.RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class Module extends AST {

    private Declarations declarations;
    private Statements statements;
    
    public Module() {
        this.declarations = null;
        this.statements = null;
    }
    
    public Module(Tree antlrTree) throws ASTException {        
        antlrType = antlrTree.getType();
        assert (antlrType == Oberon0Parser.MODULE);
        antlrText = antlrTree.getText();

        for (int i = 0; i < antlrTree.getChildCount(); i++) {
            Tree antlrChild = antlrTree.getChild(i);
            switch (antlrChild.getType()) {
                case Oberon0Parser.DECLARATIONS:
                    declarations = new Declarations(antlrChild);
                    break;
                case Oberon0Parser.STATEMENTS:
                    statements = new Statements(antlrChild);
                    break;
                default:
                    throw new ASTException();
            }
        }
        
        astLogger.log(this);
    }
    
    public Module(Statements statements) {
        this.declarations = null;
        this.statements = statements;
    }
    
    public Module(Declarations declarations) {
        this.declarations = declarations;
        this.statements = null;
    }
    
    public Module(Declarations declarations, Statements statements) {
        this.declarations = declarations;
        this.statements = statements;
    }

    public void run(Environment environment) throws RuntimeException {
        if (declarations != null) {
            declarations.declare(environment);
        }

        if (statements != null) {
            statements.interpret(environment);
        }
    }
}