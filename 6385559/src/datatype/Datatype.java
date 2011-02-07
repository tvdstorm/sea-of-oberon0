package datatype;

import errorhandler.OberonException;

public class Datatype
{ 
  public void set( int x ) throws OberonException
  {
    if( !(this instanceof IntegerType) )
    {
      this.throwException( "INTEGER" );
    }
    ((IntegerType)this).setInt( x );
  }
  
  public void set( boolean x ) throws OberonException
  {
    if( !(this instanceof BooleanType) )
    {
      this.throwException( "BOOLEAN" );
    }
    ((BooleanType)this).setBoolean( x );
  }
  
  public Object get()
  {
    return new Object();
  }
  
  public Datatype add( Datatype right ) throws OberonException
  {
    IntegerType returnValue = new IntegerType();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft()+values.getRight() );
    return returnValue;
  }
  
  public Datatype min( Datatype right ) throws OberonException
  {
    IntegerType returnValue = new IntegerType();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft()-values.getRight() );
    return returnValue;
  }
  
  public Datatype mul( Datatype right ) throws OberonException
  {
    IntegerType returnValue = new IntegerType();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft()*values.getRight() );
    return returnValue;
  }
  
  public Datatype div( Datatype right ) throws OberonException
  {
    IntegerType returnValue = new IntegerType();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft()/values.getRight() );
    return returnValue;
  }
  
  public Datatype mod( Datatype right ) throws OberonException
  {
    IntegerType returnValue = new IntegerType();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft()%values.getRight() );
    return returnValue;
  }
  
  public Datatype and( Datatype right ) throws OberonException
  {
    BooleanType returnValue = new BooleanType();
    booleanValues values = this.checkBooleans( right );
    returnValue.set( values.getLeft() && values.getRight() );
    return returnValue;
  }

  public Datatype or( Datatype right ) throws OberonException
  {
    BooleanType returnValue = new BooleanType();
    booleanValues values = this.checkBooleans( right );
    returnValue.set( values.getLeft() || values.getRight() );
    return returnValue;
  }  

  public Datatype eq( Datatype right ) throws OberonException
  {
    BooleanType returnValue = new BooleanType();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft() == values.getRight() );
    return returnValue;
  }

  public Datatype neq( Datatype right ) throws OberonException
  {
    BooleanType returnValue = new BooleanType();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft() != values.getRight() );
    return returnValue;
  }

  public Datatype lteq( Datatype right ) throws OberonException
  {
    BooleanType returnValue = new BooleanType();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft() <= values.getRight() );
    return returnValue;
  }

  public Datatype gteq( Datatype right ) throws OberonException
  {
    BooleanType returnValue = new BooleanType();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft() >= values.getRight() );
    return returnValue;
  }

  public Datatype lt( Datatype right ) throws OberonException
  {
    BooleanType returnValue = new BooleanType();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft() < values.getRight() );
    return returnValue;
  }

  public Datatype gt( Datatype right ) throws OberonException
  {
    BooleanType returnValue = new BooleanType();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft() > values.getRight() );
    return returnValue;
  }
  
  // left operant is the current object so you don;t have to give it as a parameter
  private integerValues checkIntegers( Datatype right ) throws OberonException
  {
    if( !(this instanceof IntegerType && right instanceof IntegerType) )
    {
      throw new OberonException( "Invalid datatype, Integer needed other type given." );
    }
    IntegerType leftOperand = ((IntegerType)this);
    IntegerType rightOperand = ((IntegerType)right);
    int leftValue = ((Integer)leftOperand.get());
    int rightValue = ((Integer)rightOperand.get());
    return new integerValues( leftValue, rightValue );
  }
  private booleanValues checkBooleans( Datatype right ) throws OberonException
  {
    if( !(this instanceof BooleanType && right instanceof BooleanType) )
    {
      throw new OberonException( "Invalid datatype, Integer needed other type given." );
    }
    BooleanType leftOperand = ((BooleanType)this);
    BooleanType rightOperand = ((BooleanType)right);
    boolean leftValue = ((Boolean)leftOperand.get());
    boolean rightValue = ((Boolean)rightOperand.get());
    return new booleanValues( leftValue, rightValue );
  }
  
  private void throwException( String givenType ) throws OberonException
  {
    String currentType = null;
    if( this instanceof IntegerType )
    {
      currentType = "INTEGER";
    }
    else if( this instanceof BooleanType )
    {
      currentType = "BOOLEAN";
    }
    throw new OberonException( "Invalid type, " + currentType + " needed " + givenType + " given." );
  }
  
  private class integerValues
  {
    private final int left;
    private final int right;
    
    public integerValues( int left, int right )
    {
      this.left = left;
      this.right = right;
    }
    
    public int getLeft()
    {
      return this.left;
    }
    
    public int getRight()
    {
      return this.right;
    }
  }
  private class booleanValues
  {
    private final boolean left;
    private final boolean right;
    
    public booleanValues( boolean left, boolean right )
    {
      this.left = left;
      this.right = right;
    }
    
    public boolean getLeft()
    {
      return this.left;
    }
    
    public boolean getRight()
    {
      return this.right;
    }
  }
}
