package oberon0.ast;
import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

public class OberonAST extends CommonTree{
	    public OberonAST(Token t) { super(t); }
	    
	    /** An adaptor that tells ANTLR to build OberonAST nodes */
	    public static TreeAdaptor Oberon0Adaptor = new CommonTreeAdaptor() {
	        @Override
			public Object create(Token token) {
	            return new OberonAST(token);
	        }
	        @Override
			public Object dupNode(Object t) {
	            if ( t==null ) {
	                return null;
	            }
	            return create(((OberonAST)t).token);
	        }
	        @Override
			public Object errorNode(TokenStream input, Token start, Token stop,
	                                RecognitionException e){
	            return new OberonErrorNode(input, start, stop, e);
	        }
	    };
	    
	    
		public OberonAST getLeftmostChild(){
			return (OberonAST) this.getChild(0);
		}
		
		public OberonAST getRightmostChild(){
			int numChilds = this.getChildCount();
			return (OberonAST) this.getChild(numChilds-1);
		}
		 
		@Override
		public ArrayList<OberonAST> getChildren(){
			ArrayList<OberonAST> oberonChildren = new ArrayList<OberonAST>();
			for (Object child: children){
				oberonChildren.add((OberonAST) child);
			}
			return oberonChildren;
		}
		
		
	    public void printTree(){
			printTree(this, 0);
		}
		
		//source code example from ANTLR documentation
		private void printTree(OberonAST tree, int indent) {
			if ( tree != null ) {
				StringBuffer indentation = new StringBuffer(indent);
				for ( int i = 0; i < indent; i++ )
					indentation = indentation.append("   ");
				for ( int i = 0; i < tree.getChildCount(); i++ ) {
					System.out.println(indentation.toString() + tree.getChild(i).toString());
					printTree((OberonAST)tree.getChild(i), indent+1);
				}
			}
		}
		
		public void printRootNode(){
			System.out.println(this.toString());
		}
}