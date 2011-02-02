package datatype;

public class BooleanType extends Datatype
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
