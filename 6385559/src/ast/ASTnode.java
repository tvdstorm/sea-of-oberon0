package ast;

import errorhandler.OberonException;

// interface for the entire Abstract Syntax tree, nothing special
public interface ASTnode {
  public void printNode( int depth );
  public int eval( String Scope ) throws OberonException;
}
