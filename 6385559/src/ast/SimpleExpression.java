package ast;
import errorhandler.OberonException;

public class SimpleExpression extends ExpressionNode
{
  private String operator;
  protected ASTnode term;
  protected SimpleExpression followup;
  
  public SimpleExpression( String operator, ASTnode term, SimpleExpression followup )
  {
    super( null, null );
    this.operator = operator;
    this.term = term;
    this.followup = followup;
  }
  
  public String ToString( int depth )
  {
    String code = "";
    if( this.term != null )
    {
      code += this.term.ToString( depth );
    }
    
    if( this.operator != null )
    {
      code += " " + this.operator + " ";
    }
    
    if( this.followup != null )
    {
      code += this.followup.ToString( 0 );
    }
    return code;
  }

  public int eval( ) throws OberonException
  {
    if( this.operator == null && this.followup == null )
    {
      return this.term.eval( );
    }
    else if( this.operator != null && this.followup != null )
    {
      int leftValue = this.term.eval( );
      int rightValue = this.followup.eval( );
      
      if( this.operator.contentEquals( "+" ) )
      {
        return leftValue+rightValue;
      }
      else if( this.operator.contentEquals( "-" ) )
      {
        return leftValue-rightValue;
      }
      else if( this.operator.contentEquals( "OR" ) )
      {
        return leftValue|rightValue;
      }
    }
    return 0;
  }
  
  public void setRight( SimpleExpression expr )
  {
    this.followup = expr;
  }
  
  public String getVariableName() throws OberonException
  { // detect whether it is only a variable node complete simple expression needed for call be reference
    if( this.operator != null && this.followup != null && !( this.term instanceof TermNode ) )
    {
      return null;
    }
    
    return ((TermNode) this.term).getVariableName();
  }
}