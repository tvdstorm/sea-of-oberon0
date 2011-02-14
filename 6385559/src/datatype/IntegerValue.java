package datatype;

public class IntegerValue extends Value
{
  private int value = 0;
  
  public void setInt( int in )
  {
    this.value = in;
  }
  
  public Object get()
  {
    return this.value;
  }
}
