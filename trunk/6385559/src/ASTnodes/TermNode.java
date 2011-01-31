package ASTnodes;
import errorhandler.OberonException;

public class TermNode implements ASTnode {
  private final ASTnode factor;
  private final String operator; // '*'|'DIV'|'MOD'|'&'
  private final TermNode follow;
  
  public TermNode( ASTnode factor, String operator, TermNode follow )
  {
    this.factor = factor;
    this.operator = operator;
    this.follow = follow;
  }
  
  public void printNode( int depth )
  {
    if( this.factor != null )
    {
      this.factor.printNode( depth );
    }
    
    if( this.operator != null )
    {
      System.out.print( " " + this.operator + " " );
    }
    
    if( this.follow != null )
    {
      this.follow.printNode( depth );
    }
  }
  
  public int eval( String scope ) throws OberonException
  {
    if( this.operator == null && this.follow == null )
    {
      return this.factor.eval( scope );
    }
    else if( this.operator != null && this.follow != null )
    {
      int leftValue = factor.eval( scope );
      int rightValue = follow.eval( scope );
      
      if( this.operator.contentEquals( "*" ) )
      {
        return leftValue*rightValue;
      }
      else if( this.operator.contentEquals( "DIV" ) )
      {
        return leftValue/rightValue;
      }
      else if( this.operator.contentEquals( "MOD" ) )
      {
        return leftValue%rightValue;
      }
      else if( this.operator.contentEquals( "&" ) )
      {
        return leftValue&rightValue;
      }
    }
    return 0;
  }

  public String getVariableName( ) throws OberonException
  {
    if( this.factor instanceof VarNode && this.operator == null && this.follow == null )
    { // detect whether its only a variable node needed for call by reference
      return ( (VarNode) this.factor).getVarname( "" ); // no scope needed
    }
    return null;
  }  
}
