package oberon0;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.Token;

public class OberonAST extends CommonTree{
	    public IScope scope; // recorded in parser, used in visitor
	    public OberonAST(Token t) { super(t); }
	    
		
		public OberonAST getLeftmostChild(){
			return (OberonAST) this.getChild(0);
		}
		
		public OberonAST getRightmostChild(){
			int numChilds = this.getChildCount();
			return (OberonAST) this.getChild(numChilds-1);
		}
		
		@Override
		public List<OberonAST> getChildren(){
			return children;
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
					System.out.println(indentation.toString() + tree.getChild(i).toString() + "scope: " + scope);
					printTree((OberonAST)tree.getChild(i), indent+1);
				}
			}
		}
		
		public void printRootNode(){
			System.out.println(this.toString());
		}
}