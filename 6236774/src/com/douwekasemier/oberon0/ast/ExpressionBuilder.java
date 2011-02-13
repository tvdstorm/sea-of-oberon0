package com.douwekasemier.oberon0.ast;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.expression.*;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public final class ExpressionBuilder {

    public static final Evaluatable build(Tree antlrTree) {
        Evaluatable expression;
        
        switch (antlrTree.getType()) {
            case Oberon0Parser.INTEGER:
                expression = new LiteralInteger(antlrTree); 
                break;
            case Oberon0Parser.IDENT_SELECT:
                expression = new Identifier(antlrTree);
                break;
            case Oberon0Parser.EQUALS:
                expression = new Equals(antlrTree);
                break;
            case Oberon0Parser.NOT_EQUALS:
                expression = new NotEquals(antlrTree);
                break;
            case Oberon0Parser.LT:
                expression = new LT(antlrTree);
                break;
            case Oberon0Parser.LTE:
                expression = new LTE(antlrTree);
                break;
            case Oberon0Parser.GT:
                expression = new GT(antlrTree);
                break;
            case Oberon0Parser.GTE:
                expression = new GTE(antlrTree);
                break;
            case Oberon0Parser.PLUS:
                expression = new Plus(antlrTree);
                break;
            case Oberon0Parser.MINUS:
                expression = new Minus(antlrTree);
                break;
            case Oberon0Parser.AND:
                expression = new And(antlrTree);
                break;
            case Oberon0Parser.OR:
                expression = new Or(antlrTree);
                break;
            case Oberon0Parser.NOT:
                expression = new Not(antlrTree);
                break;
            case Oberon0Parser.MULT:
                expression = new Mult(antlrTree);
                break;
            case Oberon0Parser.DIV:
                expression = new Div(antlrTree);
                break;
            case Oberon0Parser.MOD:
                expression = new Mod(antlrTree);
                break;
            default:
                expression = null;
        }
        
        return expression;
    } 
}
