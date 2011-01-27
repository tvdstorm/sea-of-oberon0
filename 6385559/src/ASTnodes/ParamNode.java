package ASTnodes;

public class ParamNode implements ASTnode {
  public ParamNode( ExpressionNode param, ParamNode nextParam )
  {
	this.param = param;
	this.nextParam = nextParam;
  }
	
  public void printNode(int depth) {
  // TODO Auto-generated method stub  
    if( this.param != null )
      param.printNode( 0 );
    if( this.nextParam != null )
    {
      System.out.print( ", " );
      nextParam.printNode( 0 );
    }
  }
  
  public int eval( String scope )
  {
    return 0;
  }

  private ExpressionNode param = null;
  private ParamNode nextParam = null;
}
