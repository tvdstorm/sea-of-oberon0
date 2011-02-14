package datatype;

public class IntegerValue extends Value
{
  private int value = 0;
  
  public IntegerValue(){}
  
  public IntegerValue( int value )
  {
    this.value = value;
  }
  
  public void setInt( int in )
  {
    this.value = in;
  }
  
  public Object get()
  {
    return this.value;
  }
}
