package language;

import java.util.ArrayList;

public interface IAstNode {

	/*private ArrayList<AstNode> childNodes;
	private NodeType nodeType;
	private AstNode parent;
	
	public AstNode(NodeType nodeType, AstNode parent){
		this.nodeType = nodeType;
		this.parent = parent;
	}
	
	public AstNode getChild(NodeType type){
		for (AstNode nod : childNodes) {
			if (nod != null){
				if (nod.getNodeType() == type){
					return nod;
				}
			}
		}
		return null;
	}
	
	
	public AstNode getParent(){
		return this.parent;
	}
	*/
	
	public IAstNode eval() throws Exception;
}
