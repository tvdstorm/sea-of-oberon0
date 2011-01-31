package ast;

import java.util.Vector;

import errorhandler.OberonException;
import management.ParamContainer;

public class ParamNode implements ASTnode {
  private final ExpressionNode param;
  private final ParamNode nextParam;
  
  public ParamNode( ExpressionNode param, ParamNode nextParam )
  {
    this.param = param;
    this.nextParam = nextParam;
  }
  
  public void printNode(int depth) {
    if( this.param != null )
    {
      param.printNode( 0 );
    }
    
    if( this.nextParam != null )
    {
      System.out.print( ", " );
      nextParam.printNode( 0 );
    }
  }
  
  public int eval( ) throws OberonException
  {
    return 0;
  }
  
  public Vector<ParamContainer> getVarValueList( ) throws OberonException
  { // use a different name here because we cannot overload eval if parameters are the same
    // this function gets all the parameters given and puts them in a Vector of ParamContainers
    Vector<ParamContainer> container = new Vector<ParamContainer>(0);
    ParamContainer buffer = new ParamContainer();
    if( this.nextParam != null )
    {
      container = this.nextParam.getVarValueList( );
    }
    
    buffer.value = this.param.eval( );
    buffer.varname = this.param.getVariableName();

    container.add( buffer );
    return container;
  }
}
