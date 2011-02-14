package datatype;

import errorhandler.OberonException;

public class Value
{ 
  public void set( int x ) throws OberonException
  {
    if( !(this instanceof IntegerValue) )
    {
      this.throwException( "INTEGER" );
    }
    ((IntegerValue)this).setInt( x );
  }
  
  public void set( boolean x ) throws OberonException
  {
    if( !(this instanceof BooleanValue) )
    {
      this.throwException( "BOOLEAN" );
    }
    ((BooleanValue)this).setBoolean( x );
  }
  
  public Object get()
  {
    return new Object();
  }
  
  public Value add( Value right ) throws OberonException
  {
    IntegerValue returnValue = new IntegerValue();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft()+values.getRight() );
    return returnValue;
  }
  
  public Value min( Value right ) throws OberonException
  {
    IntegerValue returnValue = new IntegerValue();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft()-values.getRight() );
    return returnValue;
  }
  
  public Value mul( Value right ) throws OberonException
  {
    IntegerValue returnValue = new IntegerValue();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft()*values.getRight() );
    return returnValue;
  }
  
  public Value div( Value right ) throws OberonException
  {
    IntegerValue returnValue = new IntegerValue();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft()/values.getRight() );
    return returnValue;
  }
  
  public Value mod( Value right ) throws OberonException
  {
    IntegerValue returnValue = new IntegerValue();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft()%values.getRight() );
    return returnValue;
  }
  
  public Value and( Value right ) throws OberonException
  {
    BooleanValue returnValue = new BooleanValue();
    booleanValues values = this.checkBooleans( right );
    returnValue.set( values.getLeft() && values.getRight() );
    return returnValue;
  }

  public Value or( Value right ) throws OberonException
  {
    BooleanValue returnValue = new BooleanValue();
    booleanValues values = this.checkBooleans( right );
    returnValue.set( values.getLeft() || values.getRight() );
    return returnValue;
  }  

  public Value eq( Value right ) throws OberonException
  {
    BooleanValue returnValue = new BooleanValue();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft() == values.getRight() );
    return returnValue;
  }

  public Value neq( Value right ) throws OberonException
  {
    BooleanValue returnValue = new BooleanValue();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft() != values.getRight() );
    return returnValue;
  }

  public Value lteq( Value right ) throws OberonException
  {
    BooleanValue returnValue = new BooleanValue();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft() <= values.getRight() );
    return returnValue;
  }

  public Value gteq( Value right ) throws OberonException
  {
    BooleanValue returnValue = new BooleanValue();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft() >= values.getRight() );
    return returnValue;
  }

  public Value lt( Value right ) throws OberonException
  {
    BooleanValue returnValue = new BooleanValue();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft() < values.getRight() );
    return returnValue;
  }

  public Value gt( Value right ) throws OberonException
  {
    BooleanValue returnValue = new BooleanValue();
    integerValues values = this.checkIntegers( right );
    returnValue.set( values.getLeft() > values.getRight() );
    return returnValue;
  }
  
  // left operant is the current object so you don;t have to give it as a parameter
  private integerValues checkIntegers( Value right ) throws OberonException
  {
    if( !(this instanceof IntegerValue && right instanceof IntegerValue) )
    {
      throw new OberonException( "Invalid datatype, Integer needed other type given." );
    }
    IntegerValue leftOperand = ((IntegerValue)this);
    IntegerValue rightOperand = ((IntegerValue)right);
    int leftValue = ((Integer)leftOperand.get());
    int rightValue = ((Integer)rightOperand.get());
    return new integerValues( leftValue, rightValue );
  }
  private booleanValues checkBooleans( Value right ) throws OberonException
  {
    if( !(this instanceof BooleanValue && right instanceof BooleanValue) )
    {
      throw new OberonException( "Invalid datatype, Integer needed other type given." );
    }
    BooleanValue leftOperand = ((BooleanValue)this);
    BooleanValue rightOperand = ((BooleanValue)right);
    boolean leftValue = ((Boolean)leftOperand.get());
    boolean rightValue = ((Boolean)rightOperand.get());
    return new booleanValues( leftValue, rightValue );
  }
  
  private void throwException( String givenType ) throws OberonException
  {
    String currentType = null;
    if( this instanceof IntegerValue )
    {
      currentType = "INTEGER";
    }
    else if( this instanceof BooleanValue )
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
