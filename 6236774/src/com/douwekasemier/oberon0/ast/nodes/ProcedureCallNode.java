package com.douwekasemier.oberon0.ast.nodes;

import java.util.ArrayList;
import java.util.Iterator;

import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.ASTGenerationException;
import com.douwekasemier.oberon0.ast.AbstractNode;
import com.douwekasemier.oberon0.ast.Node;
import com.douwekasemier.oberon0.ast.SelectorNode;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.interpreter.Oberon0RuntimeException;
import com.douwekasemier.oberon0.interpreter.environment.Bool;
import com.douwekasemier.oberon0.interpreter.environment.Environment;
import com.douwekasemier.oberon0.interpreter.environment.Procedure;
import com.douwekasemier.oberon0.interpreter.environment.Value;

public class ProcedureCallNode extends AbstractNode implements Node {

    private String identifier;
    private ArrayList<Node> actualParameters;

    public ProcedureCallNode(Tree node, Node parent) throws ASTGenerationException {
        super(node, parent);

        // Assert that this is the node we expected, if it isn't the calling constructor is bugged!
        assert (type == Oberon0Parser.CALL);

        actualParameters = new ArrayList<Node>();

        Tree identifierNode = node.getChild(0);
        assert (identifierNode.getType() == Oberon0Parser.IDENTIFIER);
        identifier = identifierNode.getText();

        // Parameters
        for (int i = 1; i < node.getChildCount(); i++) {
            Tree fpNode = node.getChild(i);
            actualParameters.add(new RootExpressionNode(fpNode, this));
        }
    }

    @Override
    public void interpret(Environment environment) throws Oberon0RuntimeException {
        
        Procedure procedure = environment.getProcedure(identifier);
        Environment invokerEnvironment = procedure.getEnvironment().newEnvironment();
        ProcedureNode procedureNode = procedure.getProcedureNode();
        Node declarations = procedureNode.getDeclarations();
        if (declarations != null) {
            declarations.interpret(invokerEnvironment);
        }
        
        int i = 0;
        for( ParameterNode formalParameter : procedureNode.getFormalparameters() ) {
            i++;
            for (String identifier: formalParameter.getIdentifiers() ) {
                Node actualParameter = actualParameters.get(i);
                
                if( formalParameter.isReference() ) {
                    System.out.println("PANIEK< PASS BY REFERENCE!");
                    System.out.println(formalParameter);
                    
                    //invokerEnvironment.declareReference()
                }
                else {
                    invokerEnvironment.declareVariable(identifier, actualParameter.evaluate(invokerEnvironment));
                }
            }
        }
        procedureNode.invoke(invokerEnvironment);
        throw new Oberon0RuntimeException();
    }


}
