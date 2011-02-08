package ast;

import errorhandler.OberonException;

// interface for the entire Abstract Syntax tree, nothing special
public interface ASTnode {
  public String toString( int depth );
  public int eval( ) throws OberonException;
}
