package com.kootsjur.oberon.ast;

import java.util.List;

public class Node
{
   private boolean isRoot;
   private Node parent;
   private List<Node> children;
   
   public Node(){}
   
   public Node(Node parent, boolean isRoot)
   {
      this.parent = parent;
      this.isRoot = isRoot;
   }
   
   public void setRoot(boolean isRoot){this.isRoot = isRoot;}
   public boolean isRoot(){return isRoot;}
   
   public void setParent(Node parent){this.parent = parent;}
   public Node getParent(){return parent;}
   
   public void setChildren(List<Node> children){this.children = children;}
   public List<Node> getChildren(){return children;}
}
