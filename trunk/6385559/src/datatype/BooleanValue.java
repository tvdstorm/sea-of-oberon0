package datatype;

public class BooleanValue extends Value
{
  private boolean value = false;
  
  public void setBoolean( boolean in )
  {
    this.value = in;
  }
  
  public Object get( )
  {
    return this.value;
  }
}
