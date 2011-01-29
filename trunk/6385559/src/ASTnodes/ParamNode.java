package ASTnodes;

import java.util.Vector;
import interpreter.ParamContainer;

public class ParamNode implements ASTnode {
  public ParamNode( ExpressionNode param, ParamNode nextParam )
  {
	this.param = param;
	this.nextParam = nextParam;
  }
	
  public void printNode(int depth) {
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
  
  public Vector<ParamContainer> getVarValueList( String scope )
  {
    Vector<ParamContainer> container = new Vector<ParamContainer>(0);
    ParamContainer buffer = new ParamContainer();
    if( this.nextParam != null )
    {
      container = this.nextParam.getVarValueList( scope );
    }
    
    buffer.value = this.param.eval( scope );
    buffer.varname = this.param.getVariableName();

	container.add( buffer );
    return container;
  }

  private ExpressionNode param = null;
  private ParamNode nextParam = null;
}
