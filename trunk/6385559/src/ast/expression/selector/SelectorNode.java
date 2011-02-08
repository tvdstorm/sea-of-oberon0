package ast.expression.selector;

import errorhandler.OberonException;
import ast.ASTnode;

public interface SelectorNode extends ASTnode
{
  public String getSelectorString() throws OberonException;
}
