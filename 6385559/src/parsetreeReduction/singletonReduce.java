package parsetreeReduction;
import org.antlr.runtime.tree.*;

/*
 * This class will the given tree to a tree where all
 * singleton nodes are reduced
 */
public class singletonReduce {
  
  public void setAST( Tree t )
  {
    this.tree = t;
  }
  
  public Tree reduce( )
  {
    return tree;
  }
  
  
  Tree tree; // contains the tree created with the parser
}
