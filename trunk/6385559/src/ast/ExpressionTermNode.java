package ast;
import errorhandler.OberonException;

public class ExpressionTermNode extends ExpressionNode
{
  protected ASTnode factor;
  protected String operator; // '*'|'DIV'|'MOD'|'&'
  protected ExpressionTermNode follow;
  
  public ExpressionTermNode( ASTnode factor, String operator, ExpressionTermNode follow )
  {
    super( null, null );
    this.factor = factor;
    this.operator = operator;
    this.follow = follow;
  }
  
  public String ToString( int depth )
  {
    String code = "";
    if( this.factor != null )
    {
      code += this.factor.ToString( depth );
    }
    
    if( this.operator != null )
    {
      code += " " + this.operator + " ";
    }
    
    if( this.follow != null )
    {
      code += this.follow.ToString( depth );
    }
    return code;
  }
  
  public int eval( ) throws OberonException
  {
    if( this.operator == null && this.follow == null )
    {
      return this.factor.eval( );
    }
    else if( this.operator != null && this.follow != null )
    {
      int leftValue = factor.eval( );
      int rightValue = follow.eval( );
      
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
  
  public void setRight( ExpressionTermNode expression )
  {
    this.follow = expression;
  }

  public String getVariableName( ) throws OberonException
  {
    if( this.factor instanceof VarNode && this.operator == null && this.follow == null )
    { // detect whether its only a variable node needed for call by reference
      return ( (VarNode) this.factor).getVariableName( ); // no scope needed
    }
    return null;
  }  
}
