package factory;

import ast.expression.*;

public class ExpressionFactory
{
  // used for generating the ExpressionNodes that have 2 operands, to allow the use of assertions
  public ExpressionNode getExpressionNode(ExpressionNode left, ExpressionNode right, String operand)
  {
    if (operand.contentEquals("&"))
    {
      return new AndNode(left, right);
    } 
    else if (operand.contentEquals(">="))
    {
      return new BiggerEqualNode(left, right);
    } 
    else if (operand.contentEquals(">"))
    {
      return new BiggerNode(left, right);
    } 
    else if (operand.contentEquals("DIV"))
    {
      return new DivideNode(left, right);
    } 
    else if (operand.contentEquals("="))
    {
      return new EqualNode(left, right);
    } 
    else if (operand.contentEquals("-"))
    {
      return new MinNode(left, right);
    } 
    else if (operand.contentEquals("MOD"))
    {
      return new ModuloNode(left, right);
    } 
    else if (operand.contentEquals("*"))
    {
      return new MultiplyNode(left, right);
    } 
    else if (operand.contentEquals("#"))
    {
      return new NotEqualNode(left, right);
    } 
    else if (operand.contentEquals("OR"))
    {
      return new OrNode(left, right);
    } 
    else if (operand.contentEquals("+"))
    {
      return new PlusNode(left, right);
    } 
    else if (operand.contentEquals("<="))
    {
      return new SmallerEqualNode(left, right);
    } 
    else if (operand.contentEquals("<"))
    {
      return new SmallerNode(left, right);
    }
    assert false;
    return null; // bit silly but the assert must be called if not then error
                 // return null
  }
}
