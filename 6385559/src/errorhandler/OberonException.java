package errorhandler;

public class OberonException extends Exception {
  private static final long serialVersionUID = 8554252424336742400L;

  public OberonException( String message )
  {
    super( message );
  }
}
