package ast;
import java.util.Vector;

import ast.expression.ExpressionNode;

import errorhandler.OberonException;
import management.TypeDefinitionManager;

public class ArrayNode implements ASTnode 
{
  private final ExpressionNode expression;
  private final ASTnode type;
  
  public ArrayNode( ExpressionNode expression, ASTnode type )
  {
    this.expression = expression;
    this.type = type; // can contain an TypeNode/ArrayTypeNode/RecordTypeNode
  }
  
  public String ToString( int depth ) 
  {
    String code = "";
    if( this.expression != null )
    {
      code += "ARRAY " + this.expression.ToString( 0 ) + " OF ";
    }
    if( this.type != null )
    {
      code += this.type.ToString( 0 );
    }
    return code;
  }
  
  public int eval( ) throws OberonException
  {
    return this.expression.eval( );
  }
  
  public Vector<String> getArrayElementList() throws OberonException
  { // fetch the list of all array elements
    ASTnode correctedType = this.type;
    if( correctedType != null )
    { // get the correct type definition
      correctedType = TypeDefinitionManager.correctType( correctedType );
    }
  
    int numberOfElements = this.eval( ); // get the number of current elements to add
    Vector<String> nextList = null;
    Vector<String> returnList = new Vector<String>(0);
    if( correctedType != null && correctedType instanceof ArrayNode )
    { // get the netList from the array list
      nextList = ((ArrayNode)correctedType).getArrayElementList();
    }
    else if( correctedType != null && correctedType instanceof RecordNode )
    { // get the nextList from the record list
      nextList = ((RecordNode) correctedType).getRecordElementList();
    }
    
    if( nextList != null )
    {
      for( int i = 0; i< numberOfElements; i++ )
      {
        for( int j = 0; j < nextList.size(); j++ )
        {
          returnList.add( "[" + i + "]" + nextList.get(j) );
        }
      }
    }
    else
    { // just return the first dimension of the array
      for( int i = 0; i < numberOfElements; i++ )
      {
        returnList.add( "[" + i + "]" );
      }
    }
    return returnList;
  }
}
