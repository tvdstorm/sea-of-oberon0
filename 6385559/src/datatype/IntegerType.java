package datatype;

public class IntegerType extends Datatype
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
