package parsetreeReduction;
import org.antlr.runtime.tree.*;

/*
 * This class will the given tree to a tree where all
 * singleton nodes are reduced
 */
public class singletonReduce {
  
  public void setAST( CommonTree t )
  {
    this.tree = t;
  }
  
  public CommonTree reduce( )
  {
    this.printTree( this.tree, 0 );
    
    return tree;
  }
  
  public void printTree(CommonTree t, int indent) {
    if ( t != null ) {
      StringBuffer sb = new StringBuffer(indent);
      for ( int i = 0; i < indent; i++ )
        sb = sb.append("  ");
      for ( int i = 0; i < t.getChildCount(); i++ ) {
        System.out.println(sb.toString() + t.getChild(i).toString());
        printTree((CommonTree)t.getChild(i), indent+1);
      }
    }
  }
  
  
  CommonTree tree; // contains the tree created with the parser
}
