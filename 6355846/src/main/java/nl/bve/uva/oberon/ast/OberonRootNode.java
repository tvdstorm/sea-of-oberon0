package nl.bve.uva.oberon.ast;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.Token;

public class OberonRootNode extends CommonTree {
	protected int value = 0;
	
	public OberonRootNode() {
		super();
		
	}
	
	public OberonRootNode(Token t) {
		super(t);
	}
	
	/** Get the List value of this node. */ 
    public int getValue()       { return value; } 
	
	 /** Set the List value of this node. */ 
    public void setValue(int value) { this.value = value; } 
    
    public String toString() { 
        String s = super.toString(); 
        try { Integer.parseInt(this.getText()); } 
        catch (NumberFormatException ex)  
            { s = s + " {=" + getValue() + "}"; } 
        return s; 
    }
}
