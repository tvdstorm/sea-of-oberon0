package com.douwekasemier.oberon0.ast.nodes;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.interpreter.Oberon0RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Procedure;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class ProcedureNode extends AbstractNode implements Node {

    protected String identifier;
    protected ArrayList<ParameterNode> formalparameters;
    private Node declarations, statements;

    public ProcedureNode() throws ASTGenerationException {
        super();
    }
    
    public ProcedureNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        assert (type == Oberon0Parser.PROCEDURE);

        formalparameters = new ArrayList<ParameterNode>();

        // Procedure identifier
        identifier = node.getChild(0).getText();

        // (Optional) formal parameters, declarations & statements
        for (int i = 1; i < node.getChildCount(); i++) {
            Tree childNode = node.getChild(i);
            switch (childNode.getType()) {
                case Oberon0Parser.FORMALPARAMETER:
                    if (childNode.getChild(0).getType() == Oberon0Parser.VAR) {
                        formalparameters.add(new ReferenceParameterNode(childNode, this));
                    } else {
                        formalparameters.add(new CopyParameterNode(childNode, this));
                    }
                    break;
                case Oberon0Parser.DECLARATIONS:
                    declarations = new DeclarationsNode(childNode, this);
                    break;
                case Oberon0Parser.STATEMENTS:
                    statements = new StatementsNode(childNode, this);
                    break;
                default:
                    throw new ASTGenerationException();
            }
        }

        // TODO Auto-generated constructor stub
    }

    @Override
    public void interpret(Environment environment) throws Oberon0RuntimeException {
        Environment localEnvironment = environment.newEnvironment();
        environment.declareProcedure(identifier, new Procedure(this, localEnvironment));

        if (declarations != null) {
            declarations.interpret(localEnvironment);
        }
    }

    public Node getDeclarations() {
        return declarations;
    }

    public ArrayList<ParameterNode> getFormalparameters() {
        return formalparameters;
    }


    @Override
    public void invoke(Environment environment) throws Oberon0RuntimeException {
        if (statements != null) {
            statements.interpret(environment);
        }
    }

}
