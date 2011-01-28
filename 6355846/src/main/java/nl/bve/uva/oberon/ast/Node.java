package nl.bve.uva.oberon.ast;

import java.util.List;

/**
 * Base class for all Nodes in the AST
 */
public abstract class Node {
	public Node() {
		
	}	
	
	public abstract List<Node> childNodes();
	
    protected String getNodeName() {
        String name = getClass().getName();
        int i = name.lastIndexOf('.');
        String nodeType = name.substring(i + 1);
        return nodeType;
    }
    
//    public abstract NodeType getNodeType();
}
