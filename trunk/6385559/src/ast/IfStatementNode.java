package ast;
import errorhandler.OberonException;

public class IfStatementNode implements StatementNode 
{
  private final ExpressionNode expression;
  private final StatementSequenceNode sequence;
  private final StatementNode elseStatement;
  
  public IfStatementNode( ExpressionNode expression, StatementSequenceNode sequence, StatementNode elseStatement )
  {
    this.expression = expression;
    this.sequence = sequence;
    this.elseStatement = elseStatement;
  }
  
  public String ToString( int depth )
  {
    String code = "";
    for( int i = 0; i < depth; i++ )
    { // print the depth
      code += " ";
    }
  
    code += "IF ";
    if( this.expression != null )
    {
      code += expression.ToString( depth );
    }
  
    code += " THEN\n";
    if( this.sequence != null )
    {
      code += this.sequence.ToString( depth+2 );
    }
  
    if( this.elseStatement != null )
    {
      for( int i = 0; i < depth; i++ )
      { // print the needed depth
        code += " ";
      }
      code += "ELSE\n" + this.elseStatement.ToString(depth+2);
    }
  
    for( int i = 0; i < depth; i++ )
    {
      code += " ";
    }
    return code + "END;\n";
  }
  
  public int eval( ) throws OberonException
  {
    if( this.expression.eval( ) == 1 )
    {
      if( this.sequence != null )
      {
        this.sequence.eval( );
      }
    }
    else if( this.elseStatement != null )
    {
      this.elseStatement.eval( );
    }
    return 0;
  }
}
