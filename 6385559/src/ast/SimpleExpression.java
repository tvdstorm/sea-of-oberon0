package ast;
import errorhandler.OberonException;

public class SimpleExpression implements ASTnode {
  private final String operator;
  private final ASTnode term;
  private final SimpleExpression followup;
  
  public SimpleExpression( String operator, ASTnode term, SimpleExpression followup )
  {
    this.operator = operator;
    this.term = term;
    this.followup = followup;
  }
  
  public void printNode( int depth )
  {
    if( this.term != null )
    {
      this.term.printNode( depth );
    }
    
    if( this.operator != null )
    {
      System.out.print( " " + this.operator + " " );
    }
    
    if( this.followup != null )
    {
      this.followup.printNode( 0 );
    }
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
  
  public String getVariableName() throws OberonException
  { // detect whether it is only a variable node complete simple expression needed for call be reference
    if( this.operator != null && this.followup != null && !( this.term instanceof TermNode ) )
    {
      return null;
    }
    
    return ((TermNode) this.term).getVariableName();
  }
}