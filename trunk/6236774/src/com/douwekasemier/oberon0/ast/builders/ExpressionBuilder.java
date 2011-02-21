package com.douwekasemier.oberon0.ast.builders;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.Evaluatable;
import com.douwekasemier.oberon0.ast.expression.*;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public final class ExpressionBuilder {

    public static final Evaluatable build(Tree antlrTree) {
        switch (antlrTree.getType()) {
            case Oberon0Parser.INTEGER:
                return new LiteralInteger(antlrTree);
            case Oberon0Parser.IDENT_SELECT:
                return new Identifier(antlrTree);
            case Oberon0Parser.EQUALS:
                return new Equals(antlrTree);
            case Oberon0Parser.NOT_EQUALS:
                return new NotEquals(antlrTree);
            case Oberon0Parser.LT:
                return new LT(antlrTree);
            case Oberon0Parser.LTE:
                return new LTE(antlrTree);
            case Oberon0Parser.GT:
                return new GT(antlrTree);
            case Oberon0Parser.GTE:
                return new GTE(antlrTree);
            case Oberon0Parser.PLUS:
                return new Plus(antlrTree);
            case Oberon0Parser.MINUS:
                return new Minus(antlrTree);
            case Oberon0Parser.AND:
                return new And(antlrTree);
            case Oberon0Parser.OR:
                return new Or(antlrTree);
            case Oberon0Parser.NOT:
                return new Not(antlrTree);
            case Oberon0Parser.MULT:
                return new Mult(antlrTree);
            case Oberon0Parser.DIV:
                return new Div(antlrTree);
            case Oberon0Parser.MOD:
                return new Mod(antlrTree);
            default:
                throw new AssertionError("Incorrect node in Expression");
        }
    }
}
