package com.douwekasemier.oberon0.ast.statements;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Interpretable;
import com.douwekasemier.oberon0.ast.statements.ifstatement.Else;
import com.douwekasemier.oberon0.ast.statements.ifstatement.Elsif;
import com.douwekasemier.oberon0.ast.statements.ifstatement.If;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Bool;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class IfStatement extends AST implements Interpretable {

    private If ifpart;
    private Else elsepart;
    private ArrayList<Elsif> elsifparts;

    public IfStatement() {
        ifpart = null;
        elsepart = null;
        elsifparts = new ArrayList<Elsif>();
    }

    public IfStatement(If ifpart, Else elsepart, ArrayList<Elsif> elsifparts) {
        super();
        this.ifpart = ifpart;
        this.elsepart = elsepart;
        this.elsifparts = elsifparts;
    }

    public IfStatement(Tree antlrTree) {
        this();
        antlrType = antlrTree.getType();
        antlrText = antlrTree.getText();
        assert (antlrType == Oberon0Parser.IFSTATEMENT);

        for (int i = 0; i < antlrTree.getChildCount(); i++) {
            Tree antlrChildTree = antlrTree.getChild(i);
            switch (antlrChildTree.getType()) {
                case Oberon0Parser.IF:
                    ifpart = new If(antlrChildTree);
                    break;
                case Oberon0Parser.ELSIF:
                    elsifparts.add(new Elsif(antlrChildTree));
                    break;
                case Oberon0Parser.ELSE:
                    elsepart = new Else(antlrChildTree);
                    break;
            }
        }
    }

    @Override
    public void interpret(Environment environment) throws Oberon0Exception {
        boolean doElse = false;
        if( elsepart != null ) {
            doElse = true;
        }
        
        Bool ifResult = (Bool) ifpart.getExpression().evaluate(environment);
        if( ifResult.getValue().booleanValue() ) {
            ifpart.getStatements().interpret(environment);
            
        }
        else {
            Bool elsifResult;
            for(Elsif elsifpart : elsifparts) {
                elsifResult = (Bool) elsifpart.getExpression().evaluate(environment);
                if( elsifResult.getValue().booleanValue()) {
                    elsifpart.getStatements().interpret(environment);
                    doElse = false;
                    break;
                }
            }
            
            if( doElse ) {
                elsepart.getStatements().interpret(environment);
            }
        }
    }
}
