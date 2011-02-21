package com.douwekasemier.oberon0.ast.statements;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.AST;
import com.douwekasemier.oberon0.ast.Interpretable;
import com.douwekasemier.oberon0.ast.statements.ifstatement.Else;
import com.douwekasemier.oberon0.ast.statements.ifstatement.Elsif;
import com.douwekasemier.oberon0.ast.statements.ifstatement.If;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.interpreter.environment.Bool;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class IfStatement extends AST implements Interpretable {

    private If ifpart;
    private Else elsepart;
    private ArrayList<Elsif> elsifparts;

    public IfStatement(Tree antlrTree) {
        super(antlrTree);
        assert (antlrType == Oberon0Parser.IFSTATEMENT);

        // IfStatement always begins with IF
        ifpart = new If(antlrTree.getChild(0));

        // After IF some optional elsif parts
        elsifparts = new ArrayList<Elsif>();
        for (int i = 1; i < antlrTree.getChildCount(); i++) {
            if (antlrTree.getChild(i).getType() == Oberon0Parser.ELSE) {
                break;
            }
            elsifparts.add(new Elsif(antlrTree.getChild(i)));
        }

        // Last (optional) else part
        Tree lastChild = antlrTree.getChild(antlrTree.getChildCount() - 1);
        if (lastChild.getType() == Oberon0Parser.ELSE) {
            elsepart = new Else(lastChild);
        }
    }

    @Override
    public void interpret(Environment environment) {
        boolean doElse = false;
        if (elsepart != null) {
            doElse = true;
        }

        Bool ifResult = (Bool) ifpart.getExpression().evaluate(environment);
        if (ifResult.getValue().booleanValue()) {
            ifpart.getStatements().interpret(environment);

        } else {
            Bool elsifResult;
            for (Elsif elsifpart : elsifparts) {
                elsifResult = (Bool) elsifpart.getExpression().evaluate(environment);
                if (elsifResult.getValue().booleanValue()) {
                    elsifpart.getStatements().interpret(environment);
                    doElse = false;
                    break;
                }
            }

            if (doElse) {
                elsepart.getStatements().interpret(environment);
            }
        }
    }
}
