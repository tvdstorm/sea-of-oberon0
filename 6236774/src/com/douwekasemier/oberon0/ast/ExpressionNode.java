package com.douwekasemier.oberon0.ast;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.nodes.ExpressionAndNode;
import com.douwekasemier.oberon0.ast.nodes.ExpressionDivNode;
import com.douwekasemier.oberon0.ast.nodes.ExpressionEqualsNode;
import com.douwekasemier.oberon0.ast.nodes.ExpressionGTENode;
import com.douwekasemier.oberon0.ast.nodes.ExpressionGTNode;
import com.douwekasemier.oberon0.ast.nodes.ExpressionLTENode;
import com.douwekasemier.oberon0.ast.nodes.ExpressionLTNode;
import com.douwekasemier.oberon0.ast.nodes.ExpressionMinusNode;
import com.douwekasemier.oberon0.ast.nodes.ExpressionModNode;
import com.douwekasemier.oberon0.ast.nodes.ExpressionMultNode;
import com.douwekasemier.oberon0.ast.nodes.ExpressionNotEqualsNode;
import com.douwekasemier.oberon0.ast.nodes.ExpressionNotNode;
import com.douwekasemier.oberon0.ast.nodes.ExpressionOrNode;
import com.douwekasemier.oberon0.ast.nodes.ExpressionPlusNode;
import com.douwekasemier.oberon0.ast.nodes.LiteralIntegerNode;
import com.douwekasemier.oberon0.ast.nodes.SelectorArrayNode;
import com.douwekasemier.oberon0.ast.nodes.SelectorIdentifierNode;
import com.douwekasemier.oberon0.ast.nodes.SelectorRecordNode;
import com.douwekasemier.oberon0.core.Oberon0Parser;

public abstract class ExpressionNode extends AbstractNode {

    public ExpressionNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);
    }

    protected Node generateExpressionNode(Tree node) throws ASTGenerationException {
        Node generatedNode;
        /*
         * NOT_EQUALS = '#' GT = '>'; GTE = '>='; LT = '<'; LTE = '<='; PLUS = '+'; MINUS = '-'; OR = 'OR'; NOT = '~'; MULT = '*'; DIV = 'DIV'; MOD = 'MOD'; AND
         * = '&';
         */
        switch (node.getType()) {
            case Oberon0Parser.INTEGER:
                generatedNode = new LiteralIntegerNode(node, this);
                break;
            case Oberon0Parser.IDENTIFIER:
                generatedNode = new SelectorIdentifierNode(node, this);
                break;
            case Oberon0Parser.ARRAYSELECTOR:
                generatedNode = new SelectorArrayNode(node, this);
                break;
            case Oberon0Parser.RECORDSELECTOR:
                generatedNode = new SelectorRecordNode(node, this);
                break;
            case Oberon0Parser.EQUALS:
                generatedNode = new ExpressionEqualsNode(node, this);
                break;
            case Oberon0Parser.NOT_EQUALS:
                generatedNode = new ExpressionNotEqualsNode(node, this);
                break;
            case Oberon0Parser.LT:
                generatedNode = new ExpressionLTNode(node, this);
                break;
            case Oberon0Parser.LTE:
                generatedNode = new ExpressionLTENode(node, this);
                break;
            case Oberon0Parser.GT:
                generatedNode = new ExpressionGTNode(node, this);
                break;
            case Oberon0Parser.GTE:
                generatedNode = new ExpressionGTENode(node, this);
                break;
            case Oberon0Parser.PLUS:
                generatedNode = new ExpressionPlusNode(node, this);
                break;
            case Oberon0Parser.MINUS:
                generatedNode = new ExpressionMinusNode(node, this);
                break;
            case Oberon0Parser.AND:
                generatedNode = new ExpressionAndNode(node, this);
                break;
            case Oberon0Parser.OR:
                generatedNode = new ExpressionOrNode(node, this);
                break;
            case Oberon0Parser.NOT:
                generatedNode = new ExpressionNotNode(node, this);
                break;
            case Oberon0Parser.MULT:
                generatedNode = new ExpressionMultNode(node, this);
                break;
            case Oberon0Parser.DIV:
                generatedNode = new ExpressionDivNode(node, this);
                break;
            case Oberon0Parser.MOD:
                generatedNode = new ExpressionModNode(node, this);
                break;
            default:
                generatedNode = null;
        }

        return generatedNode;
    }
}
